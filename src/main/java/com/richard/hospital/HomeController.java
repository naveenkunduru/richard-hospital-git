
package com.richard.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("hospitalName", "Richard Multi Speciality Hospital");
        model.addAttribute("tagline", "Compassionate Care. Advanced Medicine.");
        return "index";
    }
}
