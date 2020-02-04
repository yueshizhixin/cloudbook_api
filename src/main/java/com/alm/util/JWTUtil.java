package com.alm.util;

import com.alm.user.po.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtil {
    private static final String SECRET = "com.lishuai.cloudbook.api";
    private static Algorithm algorithm=Algorithm.HMAC256(SECRET);

    /**
     * 生成token
     */
    private static String createToken(String type,Map<String, String> claims) {
        try {
            JWTCreator.Builder builder = JWT.create()
                    .withExpiresAt(DateUtils.addHours(new Date(),PropConfUtil.expHours()))
                    .withIssuer(type);
            claims.forEach(builder::withClaim);
            return builder.sign(algorithm);
        } catch (Exception e) {
            return null;
        }
    }

    public static String createUserToken(User user) {
        if (user == null) return null;
        Map<String, String> map = new HashMap<>();
        map.put("id", user.getId().toString());
        map.put("isSignable", user.getIsSignable().toString());
        return JWTUtil.createToken("user", map);
    }

    /**
     * 验证jwt 返回数据
     */
    private static Map<String, String> verifyToken(String type,String token) {
        try {

            JWTVerifier verifier = JWT.require(algorithm).withIssuer(type).build();
            DecodedJWT jwt = verifier.verify(token);
            Map<String, Claim> map = jwt.getClaims();
            Map<String, String> resultMap = new HashMap<>(map.size());
            map.forEach((k, v) -> resultMap.put(k, v.asString()));
            return resultMap;
        } catch (Exception e) {
            return null;
        }

    }

    public static User verifyUserToken(String token) {
        Map<String, String> map=JWTUtil.verifyToken("user", token);
        if (map == null) {
            return null;
        }
        User user = new User();
        user.setId(Integer.valueOf(map.get("id")));
        user.setIsSignable(Integer.valueOf(map.get("isSignable")));
        return user;
    }

    public static void main(String[] args) {
        try{

//            User user = new User();
//            user.setId(2);
//            user.setIsSignable(1);
//            String jwt=JWTUtil.createUserToken(user);
//            System.out.println(jwt);
//            System.out.println(JWTUtil.verifyUserToken(jwt));


            String myjwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJ1c2VyIiwiaXNTaWduYWJsZSI6IjEiLCJpZCI6IjIiLCJleHAiOjE1ODA3MjkyODh9.RzSjXXCT5Fqxa9H1D7mAKUhQ8yU48tDE92FJSSyWRUM";
            System.out.println(JWTUtil.verifyUserToken(myjwt));

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}