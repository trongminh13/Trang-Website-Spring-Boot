package com.thuctapsamsung.Duan2.controllers;
/*nguyenban*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {
@RequestMapping("/")
	public String home() {
		return "index";
	}
}

//@GetMapping("/")
//public String Pageindex() {
//	return "Pageindex";
//}
//
//
//}

//@GetMapping("/")
//public String quickstart() {
//	return "indexx";
//}
//}
