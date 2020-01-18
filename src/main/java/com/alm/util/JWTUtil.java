package com.alm.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.common.base.Strings;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtil {
    private static final String SECRET = "com.lishuai.cloudbook.api";

    /**
     * 生成token
     */
    private static String createToken(String type,Map<String, String> claims) {
        try {

            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTCreator.Builder builder = JWT.create()
                    .withIssuer(type);
            claims.forEach(builder::withClaim);
            return builder.sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String createUserToken(Map<String, String> claims) {
        claims.put("exp",DateUtil.toString(DateUtils.addHours(new Date(), 1)));
        return JWTUtil.createToken("user", claims);
    }

    /**
     * 验证jwt 返回数据
     */
    private static Map<String, String> verifyToken(String type,String token) {
        try {
            Algorithm algorithm;
            Map<String, Claim> map;
            algorithm = Algorithm.HMAC256(SECRET);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(type).build();
            DecodedJWT jwt = verifier.verify(token);
            map = jwt.getClaims();
            Map<String, String> resultMap = new HashMap<>(map.size());
            map.forEach((k, v) -> resultMap.put(k, v.asString()));
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static Map<String, String> verifyUserToken(String token) {
        return JWTUtil.verifyToken("user", token);
    }

    public static void main(String[] args) {
        try{
            Map<String, String> map=new HashMap<String, String>();
            map.put("id", "2");
            String jwt=JWTUtil.createUserToken(map);
            System.out.println(jwt);

            String myjwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ1c2VyIiwiaWQiOiIyIiwiZXhwIjoxNTc4NDc4ODg2fQ.O_kD6gy9uxLiWVAv25euuVeASpHL55tz_P4Z3V0PtO4";
            System.out.println(JWTUtil.verifyUserToken(myjwt));

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}