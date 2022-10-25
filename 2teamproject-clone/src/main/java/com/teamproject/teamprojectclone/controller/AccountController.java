package com.teamproject.teamprojectclone.controller;

import com.teamproject.teamprojectclone.dto.RegisterReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account/login")
    public String login() {
        return "account/login";
    }

    @GetMapping("/account/register")
    public String register(RegisterReqDto registerReqDto) {
        return "account/register";
    }
}
