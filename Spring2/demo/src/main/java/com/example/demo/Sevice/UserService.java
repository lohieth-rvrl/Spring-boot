package com.example.demo.Sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.Userrepository;

@Service
public class UserService {
    @Autowired
    private Userrepository userrepository;

    public User addUser(User user){
        return userrepository.save(user);
    }

    public List<User> getUsers(){
        return userrepository.findAll();
    }

    public User updateUser(User user, int id){
        User updateUser = userrepository.findById(id).orElseThrow(()->new IllegalArgu)
        updateUser.setId(user.getId());
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmai());
        return
    }
}
