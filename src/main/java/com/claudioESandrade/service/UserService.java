package com.claudioESandrade.service;

import com.claudioESandrade.domain.model.User;

public interface UserService {

    User create(User userToCreate);

    User findById(Long id);
}
