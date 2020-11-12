package com.spring.henallux.firstSpringProject.controller;
import com.spring.henallux.firstSpringProject.model.User;
import com.spring.henallux.firstSpringProject.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping(value="/gift")
public class GiftController {

    @RequestMapping(method=RequestMethod.GET)
    public String home(Model model) {
        
    }
}
