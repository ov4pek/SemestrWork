package ru.kpfu.itis.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
@EnableWebSecurity
@ComponentScan("ru.kpfu.itis.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthenticationProvider authProvider;
    private final AccessDeniedHandler accessDeniedHandler;

    @Autowired
    public SecurityConfig(AuthenticationProvider authProvider, AccessDeniedHandler accessDeniedHandler) {
        this.authProvider = authProvider;
        this.accessDeniedHandler = accessDeniedHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/authentication", "/registration").anonymous()
                .antMatchers("/**").hasRole("USER")
                .antMatchers("/**").hasRole("ADMIN");

        http.csrf().disable()
                .formLogin()
                .loginPage("/authentication")
                .loginProcessingUrl("/login/process")
                .usernameParameter("email")
                .passwordParameter("password")
                .defaultSuccessUrl("/main", true)
                .failureForwardUrl("/authentication?error=true")
                .and()
                .logout().logoutSuccessUrl("/authentivation")
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }
}
