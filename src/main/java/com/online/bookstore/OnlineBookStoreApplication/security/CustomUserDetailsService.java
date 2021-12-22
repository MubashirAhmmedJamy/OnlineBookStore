package com.online.bookstore.OnlineBookStoreApplication.security;

import com.online.bookstore.OnlineBookStoreApplication.model.User;
import com.online.bookstore.OnlineBookStoreApplication.service.user.UserService;
import com.online.bookstore.OnlineBookStoreApplication.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getbyUserName(username);

        Set<GrantedAuthority> grantedAuthorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

        return UserPrinciple.builder()
                .user(user)
                .id(user.getId())
                .password(user.getPassword())
                .grantedAuthorities(grantedAuthorities)
                .username(user.getUsername())
                .build();
    }
}
