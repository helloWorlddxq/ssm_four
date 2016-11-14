package cn.edu.nuc.ssm_four.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.nuc.ssm_four.entity.Admin;
import cn.edu.nuc.ssm_four.service.interfaces.AdminService;

/**
 * @date 2016年11月8日上午10:54:02
 */
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	@RequestMapping(value="/AdminLogin" , method=RequestMethod.GET)
	public String forward(){
		
		return "/login0";
	}
	@RequestMapping(value="/AdminLogin" , method=RequestMethod.POST)
	public String Adminlogin(Admin admin,HttpSession session){
		try {
			System.out.println("测试：0.0");
			admin = adminService.login(admin.getAname(), admin.getApass());
			session.setAttribute("Admin", admin);
			return "AdminList";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:login0";
		}
}
