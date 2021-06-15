package com.koreait.spring2.controller;

import com.koreait.spring2.model.SearchDTO;
import com.koreait.spring2.service.ApartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApartController {

    @Autowired
    ApartService apartService;

    @RequestMapping("/")
    public String hello(Model model) {

        model.addAttribute("list", apartService.getAllInfo());
        return "main";
    }
    @GetMapping("/result")
    public String result(){

        return "";
    }
    @PostMapping("/result")
    public String result(SearchDTO searchDTO){
        apartService.saveData(searchDTO);
        return "redirect:/result";
    }
}
