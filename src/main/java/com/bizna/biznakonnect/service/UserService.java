package com.bizna.biznakonnect.service;

import com.bizna.biznakonnect.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);

    Optional<User> getUserById(Long id);

    Optional<User> getUserByUsername(String username);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long id);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}