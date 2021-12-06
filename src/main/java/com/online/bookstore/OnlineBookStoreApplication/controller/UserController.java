package com.online.bookstore.OnlineBookStoreApplication.controller;

import com.online.bookstore.OnlineBookStoreApplication.model.User;
import com.online.bookstore.OnlineBookStoreApplication.pojo.ApiResponse;
import com.online.bookstore.OnlineBookStoreApplication.service.user.UserService;
import com.online.bookstore.OnlineBookStoreApplication.utils.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = Mappings.REST)
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = Mappings.CREATE_USER, method = RequestMethod.POST)
    ResponseEntity<Object> createUser(@RequestBody User user, Principal principal){
        ApiResponse response = new ApiResponse(false);

        try {
            response.setSuccess(userService.create(user));
        }catch (Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
