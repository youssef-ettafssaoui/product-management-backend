package com.youssef.serverproductmanagement.service;

import com.youssef.serverproductmanagement.models.Users;
import com.youssef.serverproductmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //It will be provided on WebSecurityConfig as @Bean
    @Autowired
    private PasswordEncoder passwordEncoder;

    // My Methods : saveUser, updateUser, deleteUser, findByUsername, findAllUsers and numberOfUsers
    @Override
    public Users saveUser(final Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    //save = create or update
    @Override
    public Users updateUser(final Users user){
        // save can be used for update or insert operation in Database
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(final Long userId){
        userRepository.deleteById(userId);
    }

    @Override
    public Users findByUsername(final String username){
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public List<Users> findAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public Long numberOfUsers(){
        return userRepository.count();
    }
}
