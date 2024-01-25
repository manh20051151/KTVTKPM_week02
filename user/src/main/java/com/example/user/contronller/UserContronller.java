package com.example.user.contronller;

import com.example.user.entity.User;
import com.example.user.repostirory.UserRepostirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/serviceUser")
public class UserContronller {
    @Autowired
    private UserRepostirory userRepostirory;

    @GetMapping("/users")
    public List<User> getAll(){
        List<User> l = userRepostirory.findAll();

        return l;
    }
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable("id") int id) {
        Optional<User> u = userRepostirory.findById(id);
        return u;
    }
}
