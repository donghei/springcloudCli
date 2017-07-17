package com.example.demo;

import com.example.demo.model.Cat;
import com.example.demo.service.Catservice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudCliApplication {

        public static void main(String[] args) {

		SpringApplication.run(SpringcloudCliApplication.class, args);
	}

    @Resource
    private Catservice catService;

    @RequestMapping(value="/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatName("jack");
        cat.setCatAge(3);
        catService.save(cat);
        return "save ok.";
    }

    @RequestMapping(value="/delete")
    public String delete(@RequestParam String name){
      /*  catService.delete(1);*/
        return "delete ok"+name;
    }

    @RequestMapping(value="/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    @Value("${server.port}")
    String port;
    @RequestMapping(value="/hi")
    public String sayhi(@RequestParam String name){
        return "im dddis"+name+"port is"+ port+"11113335554448888";
    }
}
