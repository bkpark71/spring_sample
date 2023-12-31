package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestWebController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public String hello2(@RequestParam("msg") String msg){
        return msg;
    }

    @PostMapping("/hello3/{id}")
    @ResponseBody
    public String hello3(@PathVariable("id") int id){
        return "hello " + id;
    }

    @GetMapping("/hello4")
    public String hello4(@RequestParam("msg") String msg, Model model){
        model.addAttribute("msg",msg);
        return "hello";
    }
}
