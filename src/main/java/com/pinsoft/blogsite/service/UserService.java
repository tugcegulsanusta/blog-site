package com.pinsoft.blogsite.service;

import com.pinsoft.blogsite.entity.User;
import com.pinsoft.blogsite.exceptions.ApiRequestException;
import com.pinsoft.blogsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //@PreAuthorize("hasAuthority('admin')")
    public void delete(Long id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new ApiRequestException("The given id is not exist!");
        } else {
            userRepository.findById(id);
        }
    }
    //@PreAuthorize("hasAuthority('admin')")
    public void inactivate(Long id){
        if(userRepository.findById(id).isEmpty()){
            throw new ApiRequestException("The given id is not exist");
        }else {
            User user = userRepository.findById(id).get();
            userRepository.save(user);
        }
    }
    //@PreAuthorize("hasAuthority('admin')")
    public void activate(Long id){
        if(userRepository.findById(id).isEmpty()){
            throw new ApiRequestException("The given id is not exist");
        }else {
            User user = userRepository.findById(id).get();
            userRepository.save(user);
        }
    }
    //@PreAuthorize("hasAuthority('admin')")
    public List<User> getAll() {
        return userRepository.findAll();
    }
    //@PreAuthorize("hasAuthority('admin')")
    public Optional<User> getById(Long id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new ApiRequestException("The given id is not exist!");
        } else {
            return userRepository.findById(id);
        }

    }
}
