package cn.edu.nuc.ssm_four.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.nuc.ssm_four.entity.Teacher;
import cn.edu.nuc.ssm_four.service.interfaces.TeacherService;

/**
 * @date 2016年11月9日上午9:45:39
 */
@Controller
public class TeacherController {
    @Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/TeacherLogin" , method=RequestMethod.GET)
	public String forward(){
		
		return "/login1";
	}
	@RequestMapping(value="/TeacherLogin" , method=RequestMethod.POST)
	public String Teacherlogin(Teacher teacher , HttpSession session){
		try {
			teacher = teacherService.login(teacher.getTname(), teacher.getTpass());
			session.setAttribute("Teacher", teacher);
			return "TeacherList";
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return "redirect:login1";
	}
}
