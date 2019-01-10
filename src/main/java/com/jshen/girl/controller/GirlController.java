package com.jshen.girl.controller;

import com.jshen.girl.dao.Girl;
import com.jshen.girl.dao.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GirlController {


    @Autowired
    private GirlRepository girlRepository;

    public List<Girl> girlList;

    @GetMapping("/getGirlList")
    public List<Girl> getGirlList(String id){
        return girlRepository.findAll();
    }

    @GetMapping("/getGirlById")
    public Optional<Girl> getGirlList(Integer id){
        return girlRepository.findById(id);
    }

    @GetMapping("/delGirlById")
    public void deleteById(Integer id){
         girlRepository.deleteById(id);
    }

    @GetMapping("/updateGirlById")
    public void updateGirlById(@RequestParam("id") Integer id,
                               @RequestParam("age") Integer age,
                               @RequestParam("cupSize") String cupSize){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girlRepository.save(girl);
    }


    @PostMapping("/addGirl")
    public Girl addGirl(@RequestParam("age") Integer age,
                          @RequestParam("cupSize") String cupSize){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }


}
