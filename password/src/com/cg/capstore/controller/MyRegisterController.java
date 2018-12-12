package com.cg.capstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capstore.dto.Customer;
import com.cg.capstore.service.ICapStoreService;

@Controller
public class MyRegisterController {
	@Autowired
	ICapStoreService ser;
	@RequestMapping("all")
	public String home(@ModelAttribute("my")Customer cust)
	{
		return "login";
	}
	@RequestMapping("retrieve_customer")
	public String abc(@ModelAttribute("my") Customer cust) {
		return "retrieve_customer";
	}
	@RequestMapping("retrieve")
	public ModelAndView pwd(@ModelAttribute("my") Customer cust)
	{
		
		Customer cu=ser.fetchCustomerId(cust.getEmail());
		
		return new ModelAndView("update","list",cu);
		
	}
	@RequestMapping("passwordupdate")
	public ModelAndView password(@ModelAttribute("my")Customer cu)
	{
		String pw=cu.getPassword();
		
		cu.setPassword(pw);
		cu.setFname(cu.getFname());
		cu.setLname(cu.getLname());
		cu.setOrderId(cu.getOrderId());
       cu.setPhone_no(cu.getPhone_no());	
		Customer c=ser.updatePwd(cu);
		
		return new ModelAndView("success","li",c.getEmail());
		
	}

}
