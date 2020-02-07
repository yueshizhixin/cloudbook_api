package com.alm.system.version;

import com.alm.enume.AuthEnum;
import com.alm.user.po.User;
import com.alm.util.JWTUtil;
import com.alm.util.PropConfUtil;
import com.google.common.base.Strings;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-21 21:20</p>
 * <p>desc: 版本拦截器</p>
 */
public class CommonVersionAnnotationInterceptor extends HandlerInterceptorAdapter {

    private static int allowClientVersion= PropConfUtil.allowClientVersion();

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod) handler;
            Class<?> clazz = hm.getBeanType();
            Method m = hm.getMethod();
            try {
                if (clazz != null && m != null) {
                    boolean isClzAnnotation = clazz.isAnnotationPresent(CommonVersion.class);
                    boolean isMethondAnnotation = m.isAnnotationPresent(CommonVersion.class);
                    CommonVersion authority = null;
                    // 如果方法和类声明中同时存在这个注解，那么方法中的会覆盖类中的设定。
                    if (isMethondAnnotation) {
                        authority = m.getAnnotation(CommonVersion.class);
                    } else if (isClzAnnotation) {
                        authority = clazz.getAnnotation(CommonVersion.class);
                    }
                    if (authority != null) {
                        CommonVersionCheckType[] versionTypes = authority.method();
                        if (versionTypes.length == 0) {
                            req.getRequestDispatcher("/api/500").forward(req, res);
                            return false;
                        }
                        //处理注解
                        int i = 0, len = versionTypes.length;
                        while (i < len) {
                            if (CommonVersionCheckType.CLIENT_VERSION == versionTypes[i]) {
                                String clientVersion=req.getHeader("clientVersion");
                                int cv=0;
                                if (!Strings.isNullOrEmpty(clientVersion)) {
                                    cv=Integer.parseInt(clientVersion);
                                }
                                if (cv < allowClientVersion) {
                                    req.setAttribute("msg","当前客户端版本过低，请更新");
                                    req.getRequestDispatcher("/api/200ok=0").forward(req, res);
                                    break;
                                }
                            } else if (CommonVersionCheckType.API_VERSION == versionTypes[i]) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                req.getRequestDispatcher("/api/500").forward(req, res);
                return false;
            }
        }
        return true;
    }
}
