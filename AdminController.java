package com.college.lateentry.controller;

import com.college.lateentry.model.Admin;
import com.college.lateentry.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/login")
    public String login(@RequestBody Admin admin) {
        return service.login(admin) ? "Login Successful" : "Invalid Credentials";
    }
}
