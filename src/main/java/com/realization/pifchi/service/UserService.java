package com.realization.pifchi.service;

import com.realization.pifchi.model.User;
import org.hibernate.sql.Update;

import java.util.List;


public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
