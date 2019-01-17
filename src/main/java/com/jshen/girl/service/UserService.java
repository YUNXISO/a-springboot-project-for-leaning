package com.jshen.girl.service;

import com.jshen.girl.PO.DTO.User;

import java.util.List;

public interface UserService {
    public int add(User user);
    public User findById(Long userId);
    public List<User> findAll();
    public String updateUser(User user);
    public String deleteUser(Long userId);
}
