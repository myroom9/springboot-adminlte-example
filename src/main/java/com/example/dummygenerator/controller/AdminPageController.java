package com.example.dummygenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminPageController {
    @RequestMapping({"/dashboard", "/"})
    public String dashboardPage() {
        return "admin/dashboard";
    }

    @GetMapping(value = "/dummy")
    public String dummyPage() {
        return "admin/dummy/dummy";
    }

    @GetMapping("/user/add")
    public String addUser() {
        return "admin/user-add";
    }

    @GetMapping({"/user", "/user/list"})
    public String listUser() {
        return "admin/user-list";
    }
}
