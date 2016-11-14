package cn.edu.nuc.ssm_four.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.nuc.ssm_four.dto.PageInfo;
import cn.edu.nuc.ssm_four.entity.Student;
import cn.edu.nuc.ssm_four.service.interfaces.StudentService;

/**
 * @date 2016年11月4日下午5:36:35
 */
@Controller
/*@RequestMapping("/u")*/
public class StudentController {

	@Autowired
	private StudentService studentService;
	
/*	@RequestMapping(value = "/{sid}/home",method=RequestMethod.GET)
	public String index(@PathVariable("sid")int sid, @RequestParam(name="current" , defaultValue="1")Integer current,HttpSession session){
		Student student  = (Student)session.getAttribute("student");
		if (student == null || student.getSid() !=sid) {
			return "redirect:login";
		}
		PageInfo pi = studentService.student(sid, current);
		return "index";
	}*/
	@RequestMapping(value="/StudentLogin" , method=RequestMethod.GET)
	public String forward(){
		
		return "/login2";
	}
	@RequestMapping(value="/StudentLogin" , method=RequestMethod.POST)
	public String Studentlogin(Student student , HttpSession session){
		try {
			student = studentService.login(student.getSname(), student.getSpass());
			session.setAttribute("Student", student);
			return "StudentList";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:login2";
		}
		
	}
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public String register(){
		
		return "/register";
	}
	
	public String register(Student student,HttpSession session,HttpServletRequest req, HttpServletResponse res){
		student.setSname(req.getParameter("sname"));
		
		
		return null;
		
	}
	
	/**
	 * 添加学生
	 * @return
	 */
	@RequestMapping(value="/toadd",method=RequestMethod.GET)
	public String add(){
		
		return "/add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Student student){
		int count = studentService.addStudent(student);
		String sname = null;
		if( count < 0 && !Student.class.getName().equals(studentService.selectByName(sname))){
			return "add";
		}else{
					System.out.println("已存在!");
					return "redirect:StudentList";
		}
	}
	/**
	 * 删除学生
	 * @param sid
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteStudent(Integer sid,HttpSession session){
		int result=studentService.deleteStudent(sid);
			if(result>0){
				return "/success";	
			}else{
				session.setAttribute("info", "该学生不能删除！");
				return "/StudentList";
			}
	}	
	/**
	 * 编辑学生
	 * @param sid
	 * @param session
	 * @return
	 */
	@RequestMapping(value="toedit",method=RequestMethod.GET)
	public String studentUpdate(int sid,HttpSession session){
		Student student= studentService.selectId(sid);
		session.setAttribute("Student", student);
		return "edit";		
	}	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String goodsUpdate(Student student,HttpSession session,Model model){
	
		int result = studentService.updateStudent(student);
		System.out.println(student.getSname()+student.getSsex()+student.getSpro()+student.getSclass());
		if(result>0){
			Student students = studentService.selectId(student.getSid());
			model.addAttribute("Student", student);
			session.setAttribute("result", "修改成功！");
			return "redirect:/StudentList";
		}else{
			session.setAttribute("result", "修改失败！");
			return "edit";
		}
	}
	/**
	 * 根据学生姓名查找
	 * @param model
	 * @param sname
	 * @return
	 */
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String selectByName(Model model,String sname){
		System.out.println(sname);
		if( sname != null && !sname.equals("") ){
			List<Student> list = studentService.selectByName(sname);
			model.addAttribute("list", list);
			return "StudentList2";
		}
		return "redirect:StudentList";
		
	}	
	@RequestMapping(value="/StudentList")  
    public String getAllGoods(HttpServletRequest request,Model model,
    		@RequestParam(name="current",defaultValue="1") int current){ 
		
		PageInfo pi = studentService.findAllPage(current);
		model.addAttribute("pi", pi);
		 return "/StudentList";  
    }
}
