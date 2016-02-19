package com.bathtub.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController
{
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView  login(String username,String password)
	{
		if("bathtub".equals(username) && "99999".equals(password))
		{
			return new ModelAndView("loginSuccess");  
		}
		else
		{
			ModelAndView mav = new ModelAndView("loginError");  
			mav.addObject("errorMsg","用户名或密码错误！");
			return mav;
		}
	}
}
