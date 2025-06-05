package org.ECommerece.SecurityConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    //customize the security filter chain
    @Bean // to make this method a bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated()); //.requestMatchers("/swagger-ui/**","/v3/api-docs/**").permitAll() all requests should be authenticated
        http.httpBasic(withDefaults());
//        http.formLogin(withDefaults()); // to enable form based authentication
        return http.build();
    }
}
