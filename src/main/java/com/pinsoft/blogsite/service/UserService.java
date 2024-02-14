package com.pinsoft.blogsite.service;

import com.pinsoft.blogsite.entity.User;
import com.pinsoft.blogsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
    public User findByUserName(String username){
        return userRepository.findByUsername(username);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
}
