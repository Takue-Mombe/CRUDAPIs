package org.qr_code_generator.crudsql.APIControllers;


import org.qr_code_generator.crudsql.Models.User;
import org.qr_code_generator.crudsql.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {


    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String getPage(){
        return "Yoo welcome to Spring";
    }

    @GetMapping(value = "/users")
    public List<User> getUser(){
        return userRepo.findAll();
    }


    @PostMapping(value = "/save")
    public String saveUser(User user){
        userRepo.save(user);
        return "Save was a success";
    }
    @PutMapping("update/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody User user){

        User user1=userRepo.findById(id).get();
        user1.setAge(user.getAge());
        user1.setFirstName(user.getFirstName());
        user1.setOccupation(user.getOccupation());
        user1.setLastName(user.getLastName());

        userRepo.save(user1);
        return "updated...";

    }
}
