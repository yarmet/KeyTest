package com.example.KeyCloackGraddle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class MyController {

    @GetMapping(path = "/products")
    public String getTest(Model model) {
        model.addAttribute("products", Arrays.asList("ASdsd", "vcbcvb", "fg"));
        return "test.html";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest httpServletRequest) throws  ServletException {
        httpServletRequest.logout();
        return "/";
    }

}
