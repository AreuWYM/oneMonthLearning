//package com.example.testprovider.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserDetailsService userDetailsService;
//    @Autowired
//    private AuthenticationSuccessHandler myAuthenticationSuccessHandler;
//
//    @Autowired
//    private AuthenticationFailureHandler myAuthenctiationFailureHandler;
//
//
//
//
////    @Bean
////    public AuthenticationProvider daoAuthenticationProvider() {
////        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
////        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
////        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
////        daoAuthenticationProvider.setHideUserNotFoundExceptions(false);
////        return daoAuthenticationProvider;
////    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(new CustomPasswordEncoder());
////        auth.parentAuthenticationManager(authenticationManagerBean());
////        auth.authenticationProvider(daoAuthenticationProvider());
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http   // 配置登录页并允许访问
//                .formLogin().usernameParameter("username").passwordParameter("password").loginPage("/login").permitAll()
//                // 配置Basic登录
//                //.and().httpBasic()
//                // 配置登出页面
//                .successHandler(myAuthenticationSuccessHandler)
//                .failureHandler(myAuthenctiationFailureHandler)
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/")
//                // 开放接口访问权限，不需要登录授权就可以访问
//                .and().authorizeRequests().antMatchers("/oauth/**", "/login/**", "/logout/**","/actuator/**").permitAll()
//                // api接口需要admin管理员才能访问
//                .antMatchers("/api/**").hasAuthority("admin")
//                // 其余所有请求全部需要鉴权认证
//                .anyRequest().authenticated()
//                // 关闭跨域保护;
//                .and().csrf().disable()
//                //记住我
//                .rememberMe().rememberMeParameter("remember-me");
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        //解决静态资源被拦截的问题
//        web.ignoring().antMatchers("/asserts/**");
//        web.ignoring().antMatchers("/favicon.ico");
//        web.ignoring().antMatchers("/templates/login.html");
//    }
//
//
//
//
//
//    @Bean
//    public PasswordEncoder bcryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
//
