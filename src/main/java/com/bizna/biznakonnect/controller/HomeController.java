package com.bizna.biznakonnect.controller;


import com.bizna.biznakonnect.model.Business;
import com.bizna.biznakonnect.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BusinessService businessService;

//    @GetMapping("/")
//    public String home() {
//        return "home";
//    }

    @GetMapping("/")
    public String home(Model model) {
        List<Business> businesses = businessService.getAllBusinesses();
        model.addAttribute("businesses", businesses);
        return "home";
    }
}
