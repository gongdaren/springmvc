package com.myssh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class LoginController {
	@RequestMapping(value = "/login.html")
	public ModelAndView Login(@RequestParam("userID") String userID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginSuccess");
		mav.addObject("userID", userID);
		return mav;
	}
}
