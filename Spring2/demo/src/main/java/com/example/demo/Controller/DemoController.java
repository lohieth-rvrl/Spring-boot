package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Sevice.UserService;

@RestController
@RequestMapping("/User")
public class DemoController {
    
    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public ResponseEntity<User> createUser(User user){
        User newUser = userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/getUser")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users =userService.getUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
     }
     @DeleteMapping("/updateUser/{id}")
     public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable int id){
        User updateUser = userService.updateUser(user, id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(updateUser);
     }

     public ResponseEntity<String>  deleteUser(@PathVariable int id){
        
     }
}
