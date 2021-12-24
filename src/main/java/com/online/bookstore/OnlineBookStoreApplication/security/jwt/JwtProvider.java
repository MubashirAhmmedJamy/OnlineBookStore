package com.online.bookstore.OnlineBookStoreApplication.security.jwt;

import com.online.bookstore.OnlineBookStoreApplication.security.UserPrinciple;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrinciple userPrinciple);

    Authentication getAuthentication(HttpServletRequest request);

    Claims extractClaims(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
