package com.example.resourceserver.controllers;

import com.example.resourceserver.models.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrivateController {

    @GetMapping(value = "/user/info")
    public String getUserInfo(){
        return "user info";
    }

    @GetMapping(value = "/sso-resource-server/api/foos/")
    public List<Foo> getFoos(){
        Foo foo = new Foo();
        foo.setId(1l);
        foo.setName("Linh");
        return List.of(new Foo());
    }

}
