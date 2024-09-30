package com.bizna.biznakonnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserProfileController {

    @GetMapping("/profile")
    public String profile(Model model) {
        // Get the current user's profile information
        // ...
        return "profile";
    }

    @PostMapping("/profile")
    public String updateProfile(@RequestParam("username") String username, @RequestParam("email") String email, Model model) {
        // Update the user's profile information
        // ...
        return "redirect:/profile";
    }
}
