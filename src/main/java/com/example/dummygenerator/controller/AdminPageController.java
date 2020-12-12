package com.example.dummygenerator.controller;

import com.example.dummygenerator.dto.DummyDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Slf4j
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

    @GetMapping(value = "/dummy/file/download")
    @ResponseBody
    public String dummyPostPage(DummyDto.PayMethodRequestDto requestData,
                                HttpServletResponse response) {
        log.info("dummy post data: {}", requestData);

        String fileName = "a.txt";
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        String content = "This is txt content";

        return content;
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
