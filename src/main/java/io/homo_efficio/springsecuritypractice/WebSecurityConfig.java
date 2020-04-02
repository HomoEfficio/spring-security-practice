package io.homo_efficio.springsecuritypractice;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author homo.efficio@gmail.com
 * created on 2020-04-02
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic()
                .and()
                .addFilterBefore(getSimpleAuthFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public SimpleUsernamePasswordAuthFilter getSimpleAuthFilter() throws Exception {
        return new SimpleUsernamePasswordAuthFilter(authenticationManager());
    }
}
