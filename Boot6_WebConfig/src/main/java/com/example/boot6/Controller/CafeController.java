package com.example.boot6.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CafeController {
	
	@GetMapping("/cafe/insertform")
	public String insertform() {
		return "cafe/insertform";
	}
}
