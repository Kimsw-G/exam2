package com.koreait.spring2.controller;

import com.koreait.spring2.model.SearchDTO;
import com.koreait.spring2.service.ApartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String viewResult(SearchDTO searchDTO,
                         Model model){

        model.addAttribute("list",apartService.getApartmentInfo(searchDTO));

        return "result";
    }
    @PostMapping("/result")
    public String doResult(SearchDTO searchDTO, RedirectAttributes redirectAttributes){
        apartService.saveData(searchDTO);
        System.out.println(searchDTO);
        redirectAttributes.addFlashAttribute("searchDTO",searchDTO);

        return "redirect:/result";
    }
}
