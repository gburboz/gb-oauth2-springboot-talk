// Uncomment to demo this config
/*
package com.glad.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        // Apply this to all requests
        http.antMatcher("/**")
                .authorizeRequests()
                    // First make sure these URLs are publicly accessible
                    .antMatchers(
                            "/",
                            "/index.html"
                    ).permitAll()
                    // All other requests should need an authenticated user
                    .anyRequest().authenticated()
                .and()
                // Logout config
                .logout()
                    // Workaround to support logout with both GET and POST (CSRF)
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    // On successful logout go to home URL
                    .logoutSuccessUrl("/index.html")
                .and()
                // Add built-in spring security form login page
                .formLogin();
        // @formatter:on
    }

}
*/
