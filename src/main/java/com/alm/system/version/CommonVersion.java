package com.alm.system.version;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2018-12-21 21:17</p>
 * <p>desc: 统一版本检查</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
public @interface CommonVersion {
    CommonVersionEnum[] value() default {};

    CommonVersionCheckType[] method() default {};

}
