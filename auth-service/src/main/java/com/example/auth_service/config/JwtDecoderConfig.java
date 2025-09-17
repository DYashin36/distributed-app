//package com.example.auth_service.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//
//import javax.crypto.spec.SecretKeySpec;
//
//@Configuration
//public class JwtDecoderConfig {
//
//    @Bean
//    public JwtDecoder jwtDecoder(@Value("${spring.security.jwt.secret}") String secret) {
//        return NimbusJwtDecoder
//                .withSecretKey(new SecretKeySpec(secret.getBytes(), "HmacSHA256"))
//                .build();
//    }
//}