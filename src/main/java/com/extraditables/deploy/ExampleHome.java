package com.extraditables.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleHome {

    @GetMapping("/home")
    public String exampleHome(){
        return "Example home";
    }

}
