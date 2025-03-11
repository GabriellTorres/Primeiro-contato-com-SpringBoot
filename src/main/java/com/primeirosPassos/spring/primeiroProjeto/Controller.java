package com.primeirosPassos.spring.primeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/olaMundo")
    public String olaMundo(){

        return "Ola mundo";
    }
}
