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
//        http   // ??????????????????????????????
//                .formLogin().usernameParameter("username").passwordParameter("password").loginPage("/login").permitAll()
//                // ??????Basic??????
//                //.and().httpBasic()
//                // ??????????????????
//                .successHandler(myAuthenticationSuccessHandler)
//                .failureHandler(myAuthenctiationFailureHandler)
//                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/")
//                // ???????????????????????????????????????????????????????????????
//                .and().authorizeRequests().antMatchers("/oauth/**", "/login/**", "/logout/**","/actuator/**").permitAll()
//                // api????????????admin?????????????????????
//                .antMatchers("/api/**").hasAuthority("admin")
//                // ??????????????????????????????????????????
//                .anyRequest().authenticated()
//                // ??????????????????;
//                .and().csrf().disable()
//                //?????????
//                .rememberMe().rememberMeParameter("remember-me");
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        //????????????????????????????????????
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
