package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/createProduct")
    public ResponseEntity<User> createProduct(@RequestBody User user) {
        User newUser = userService.createProduct(user);
        return ResponseEntity.status( HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/getProduct")
    public ResponseEntity<List<User>> getProduct(){
        List<User> users = userService.getProduct();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<User> updateProduct(@RequestBody User user,@PathVariable int id){
        User updateUser = userService.updateProduct(user, id);
        return ResponseEntity.status(HttpStatus.OK).body(updateUser);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        userService.createProduct(id);
        return ResponseEntity.status(HttpStatus.OK).body("User with id " + id + " deleted successfully.");
    }

    

}
