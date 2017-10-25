package com.alvin.controller;

import com.alvin.model.dto.User;
import com.alvin.model.dto.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/HelloWorld/")
public class HelloWorldController {

    @RequestMapping(value = "ftl")
    public ModelAndView ftl() {
        ModelAndView mav = new ModelAndView("ftls/HelloWorld");
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setIdno("11111111111111");
        user.setRealname("<b>张建</b>");
        user.setNickname("Alvin");
        user.setGender(1);
        userList.add(user);
        
        user = new User();
        user.setIdno("222222222222222");
        user.setRealname("魏鑫鑫");
        user.setNickname("Claire");
        user.setGender(0);
        userList.add(user);
        mav.addObject("userList", userList);
        
        List<String> fruitList = new ArrayList<>();
        fruitList.add("苹果");
        fruitList.add("香蕉");
        fruitList.add("桃子");
        fruitList.add("葡萄");
        mav.addObject("fruitList", fruitList);
        return mav;
    }
    
    @RequestMapping(value = "json")
    @ResponseBody
    public UserAccount json(){
        UserAccount ua = new UserAccount();
        ua.setRealname("alvin");
        return ua;
    }

    @RequestMapping(value = "jsp")
    public ModelAndView jsp(){
        ModelAndView mav = new ModelAndView("jsps/HelloWorld");
        UserAccount ua = new UserAccount();
        ua.setRealname("alvin");
        return mav;
    }
}
