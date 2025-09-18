package com.example.auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Отключаем CSRF, т.к. работаем не с формами, а с JWT
                .csrf(AbstractHttpConfigurer::disable)

                // Настройка авторизации
                .authorizeHttpRequests(auth -> auth
                        // Логин и регистрация доступны без токена
                        .requestMatchers("/auth/**").permitAll()
                        // Остальные запросы требуют аутентификации
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}
