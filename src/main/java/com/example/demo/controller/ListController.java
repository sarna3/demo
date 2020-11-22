package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class ListController<session> {
    @PostMapping(value = "/add")
    public String add(@RequestParam("name") String name,
                      @RequestParam("tel") String tel,
                      @RequestParam("email") String email,
                      @RequestParam("address") String address,
                      @RequestParam("qq") String qq,
                      HttpSession session) {
        session.setAttribute("name",name);
        session.setAttribute("tel",tel);
        session.setAttribute("email",email);
        session.setAttribute("address",address);
        session.setAttribute("qq",qq);
        return "list";
    }

    @PostMapping(value = "/change")
    public String change(@RequestParam("name") String name,
                         @RequestParam("tel") String tel,
                         @RequestParam("email") String email,
                         @RequestParam("address") String address,
                         @RequestParam("qq") String qq,
                         HttpSession session) {
        session.setAttribute("name",name);
        session.setAttribute("tel",tel);
        session.setAttribute("email",email);
        session.setAttribute("address",address);
        session.setAttribute("qq",qq);
        return "list";
    }
    @PostMapping(value = "/delete")
    public String delete(@RequestParam("contactor") String contactor,
                         HttpSession session) {
        if(contactor.equals("a")) {
            session.setAttribute("name",null);
            session.setAttribute("tel",null);
            session.setAttribute("email",null);
            session.setAttribute("address",null);
            session.setAttribute("qq",null);
            return "list";
        }
        else
            return "redirect:/result.html";
    }
}
