package com.jshen.girl.controller;

import com.jshen.girl.PO.TestProerty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymleaf")
public class thymleafController {

    @Autowired
    private TestProerty testProerty;

    @GetMapping("/index")
    public String toIndex(ModelMap modelMap){
        return "index2";
    }

    @GetMapping("/info")
    public String toinfo(ModelMap modelMap){
        modelMap.addAttribute("proerty",testProerty);
        return "admin/info";
    }
}
