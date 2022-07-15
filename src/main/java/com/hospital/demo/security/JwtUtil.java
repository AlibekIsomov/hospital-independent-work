package com.hospital.demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private String secretKey;
    private Long expiration;


    @Value("${jwt.secret-key}")
    public void setSecretKey(String secretKey){
        this.secretKey = secretKey;
    }
    @Value("${jwt.expiration}")
    public void setExpration(String expiration){
        this.expiration = Long.parseLong(expiration);
    }

    public String generateToken(String login, String role){
        return Jwts.builder()
                .setSubject(login)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    public boolean validateToken(String token){
        try{
            // agar quyidagi kod ishlay olsa token haqiqiy bo'ladi.
            Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token);
            return  true;


        } catch (Exception ex){

        }
        return  false;

    }

    public String getLogin(String token){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public String getRole(String token){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody()
                .get("role")
                .toString();
    }

}
