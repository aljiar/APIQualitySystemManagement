package com.internalpractice.backend.services;

import com.internalpractice.backend.entities.User;
import com.internalpractice.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserService {

    @Inject
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }
    public void storeUser(User user){
        userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
