package org.qr_code_generator.crudsql.APIControllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String getPage(){
        return "Welcome";
    }
}
