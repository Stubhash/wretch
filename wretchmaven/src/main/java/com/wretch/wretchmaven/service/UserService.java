package com.wretch.wretchmaven.service;

import com.wretch.wretchmaven.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}