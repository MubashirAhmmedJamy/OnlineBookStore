package com.online.bookstore.OnlineBookStoreApplication.security.jwt;

import com.online.bookstore.OnlineBookStoreApplication.security.UserPrinciple;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class JwtProviderImpl implements JwtProvider{
    @Value("${app.jwt.secret}")
    private String JWT_SECRET;

    @Value("${app.jwt.expiration-in-ms}")
    private String JWT_EXPIRATINO_IN_MS;

//    public String generateToken(UserPrinciple userPrinciple){
//        String authorities = userPrinciple.getAuthorities().stream().map(GrantedAuthority::getAuthority)
//                .collect(Collectors.joining());
//    }
}