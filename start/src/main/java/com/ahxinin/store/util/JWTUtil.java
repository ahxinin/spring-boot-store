package com.ahxinin.store.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * @Author: hexin
 * @Date: 2021/3/10
 */
public class JWTUtil {

    private static final String SECRET = "Us3OxRAHLlnErmRXvodD4TvqQclYho5Y";

    public static String createToken(){
        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        return JWT.create().sign(algorithm);
    }

    public static boolean verifyToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTVerifier verifier = JWT.require(algorithm).acceptLeeway(600).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (JWTVerificationException exception){
            return false;
        }
    }
}
