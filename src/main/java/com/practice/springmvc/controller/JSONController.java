package com.practice.springmvc.controller;
import com.practice.springmvc.model.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author Heena Hussain
 *
 */
@Controller
public class JSONController
{
	@RequestMapping(value = "/find/{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name)
	{
		Shop s1 = new Shop();
		s1.setName(name);
		s1.setStaffName(new String[]{"Heena", "Nishant"});

		return s1;
	}
}
