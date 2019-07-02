package com.bretgui.geoservice.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * created by BretGui
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String passwd = "";
        System.out.println("收到的账号：" + s);

        if(!s.equals("admin")){
            throw new RuntimeException("登录账号不存在");
        }
        return null;
    }
}