package com.online.bookstore.OnlineBookStoreApplication.repository;

import com.online.bookstore.OnlineBookStoreApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
