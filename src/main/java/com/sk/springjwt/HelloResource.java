package com.sk.springjwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloResource {


    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }


}
