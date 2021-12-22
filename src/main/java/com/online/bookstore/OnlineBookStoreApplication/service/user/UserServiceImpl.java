package com.online.bookstore.OnlineBookStoreApplication.service.user;

import com.online.bookstore.OnlineBookStoreApplication.model.User;
import com.online.bookstore.OnlineBookStoreApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<User> getAllByActive(boolean active) {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getbyUserName(String username) {
        try {
            return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
        }catch(Exception e){
            return null;
        }
    }
}
