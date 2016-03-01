package com.bathtub.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bathtub.module.admin.entity.User;
import com.bathtub.module.admin.service.UserService;


@Controller
public class LoginController
{
	@Autowired()
	private UserService userService;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView  login(User user)
	{
		if("bathtub".equals(user.getLoginId()) && "99999".equals(user.getPassword()))
		{
			return new ModelAndView("loginSuccess");  
		}
		else
		{
			User newUser =new User();
			newUser.setDelFlag(0);
			newUser.setLoginId(user.getLoginId());
			newUser.setPassword(user.getPassword());
			newUser.setDisplayName(user.getLoginId());
			userService.saveUser(newUser);
			ModelAndView mav = new ModelAndView("loginError");  
			mav.addObject("errorMsg","用户名或密码错误！");
			return mav;
		}
	}
}
