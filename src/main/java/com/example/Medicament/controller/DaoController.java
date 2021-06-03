package com.example.Medicament.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DaoController {
	
	 @GetMapping("/")
	    
	    String home() {
	        return "index";
	    }

}
