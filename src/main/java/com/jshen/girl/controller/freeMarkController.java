package com.jshen.girl.controller;


import com.jshen.girl.PO.TestProerty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/freemark")
public class freeMarkController {

    @Autowired
    private TestProerty testProerty;

    @GetMapping("/index")
    public String Index(ModelMap modelMap){
        modelMap.addAttribute("proerty",testProerty);
        return "index";
    }
}
