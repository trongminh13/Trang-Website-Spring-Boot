package com.thuctapsamsung.Duan2.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*nguyenban*/
@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/admin")
	public String index() {
		return "redirect:/admin/";
	}

	public String admin() {
		return "admin/index";
	}

}
