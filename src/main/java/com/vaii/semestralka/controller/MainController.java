package com.vaii.semestralka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/zbierka")
    public String zbierka() {
        return "zbierka";
    }
    @RequestMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }
    @RequestMapping("/dokumenty")
    public String dokumenty() {
        return "dokumenty";
    }


}
