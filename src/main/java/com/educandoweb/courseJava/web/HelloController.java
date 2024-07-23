package com.educandoweb.courseJava.web;

import com.educandoweb.courseJava.dto.HelloDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping(path = "/workshop")
    public HelloDTO hello() {
        return new HelloDTO("Roberto Vinicius!");
    }
}
