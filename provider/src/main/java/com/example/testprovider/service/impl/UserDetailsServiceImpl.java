//package com.example.testprovider.service.impl;
//
//
//import com.example.testprovider.entity.Authrity;
//import com.example.testprovider.repository.AuthRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//
///**
// * <pre>
// *
// * </pre>
// *
// * <pre>
// * @author mazq
// * 修改记录
// *    修改后版本:     修改人：  修改日期: 2020/04/30 15:15  修改内容:
// * </pre>
// */
//@Slf4j
//@Service("userAuthService")
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    AuthRepository authRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Authrity user = authRepository.findByname(username);
//        if(user == null){
//            log.info("登录用户[{}]没注册!",username);
//            throw new UsernameNotFoundException("登录用户["+username + "]没注册!");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), getAuthority());
//    }
//
//    private List getAuthority() {
//        return Arrays.asList(new SimpleGrantedAuthority("admin"));
////        return Arrays.asList(Collections.emptyList());
//    }
//}
//
