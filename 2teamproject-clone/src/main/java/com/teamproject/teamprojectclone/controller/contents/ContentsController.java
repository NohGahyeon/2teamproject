package com.teamproject.teamprojectclone.controller.contents;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentsController {

    @GetMapping("/contents")
    public String loadContents() {
        return "contents_number";
    }




}
