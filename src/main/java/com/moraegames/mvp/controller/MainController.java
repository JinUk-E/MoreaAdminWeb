package com.moraegames.mvp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    // 1. 메인 페이지 (http://localhost:8080)
    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html을 찾아감
    }

    // 2. 자기소개 페이지 (http://localhost:8080/intro)
    @GetMapping("/intro")
    public String intro(Model model) {
        // 화면에 데이터를 전달할 수도 있습니다
        model.addAttribute("name", "정진욱");
        return "intro"; // templates/intro.html을 찾아감
    }
}
