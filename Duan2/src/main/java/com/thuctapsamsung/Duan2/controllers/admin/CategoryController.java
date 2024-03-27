package com.thuctapsamsung.Duan2.controllers.admin;
/*nguyenban*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CategoryController {

	@RequestMapping("admin/category")
	public String index()
	{
		return "admin/category/index";
	}

	@RequestMapping("admin/add-category")
	public String add()
	{
		return "admin/category/add";
	}
}
