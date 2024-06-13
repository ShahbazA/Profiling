package com.example.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Profile("local")
@Configuration
@EnableWebSecurity
public class WebSecurityConfigLocal extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //only '/local' is secured
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/v1/api/home/local").authenticated()
                .anyRequest().permitAll() // All other requests are permitted
                .and()
                .httpBasic();
    }
}