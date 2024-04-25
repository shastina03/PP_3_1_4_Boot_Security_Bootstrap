package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u LEFT JOIN FETCH u.roles WHERE u.username = :username")
    User findByUsername(String username);


}