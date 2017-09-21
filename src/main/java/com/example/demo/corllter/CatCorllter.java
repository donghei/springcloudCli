package com.example.demo.corllter;

import com.example.demo.model.Cat;
import com.example.demo.service.Catservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Admintrator on 2017/7/17/017.
 */

@RestController
@RequestMapping("/cat")
public class CatCorllter {

    @Autowired
    private Catservice catservice;
    @RequestMapping(value = "/{name}")
    public String ServiceTest(@PathVariable String name){
        Cat cat = new Cat();

        cat.setCatName(name);
        catservice.save(cat);
        return  "小猫年龄"+11+"小猫名字"+name;
    }
}
