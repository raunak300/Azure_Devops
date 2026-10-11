package com.actions.gitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EntryContoller {

    @GetMapping("/health")
    public String work(){
        return "Running";
    }
}
