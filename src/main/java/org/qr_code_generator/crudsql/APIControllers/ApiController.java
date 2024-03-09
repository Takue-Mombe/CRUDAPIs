package org.qr_code_generator.crudsql.APIControllers;


import org.qr_code_generator.crudsql.Models.User;
import org.qr_code_generator.crudsql.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {


    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String getPage(){
        return "Yoo welcome to Spring";
    }

    @GetMapping("/users")
    public List<User> getUser(){
        return userRepo.findAll();
    }


    @PostMapping("/save")
    public String saveuser(User user){
        userRepo.save(user);
        return "Save was a success";
    }
}
