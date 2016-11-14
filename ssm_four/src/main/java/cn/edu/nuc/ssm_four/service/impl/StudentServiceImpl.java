package cn.edu.nuc.ssm_four.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm_four.dao.interfaces.StudentMapper;
import cn.edu.nuc.ssm_four.dto.PageInfo;
import cn.edu.nuc.ssm_four.entity.Student;
import cn.edu.nuc.ssm_four.exception.loginException;
import cn.edu.nuc.ssm_four.service.interfaces.StudentService;

/**
 * @date 2016年11月3日下午5:07:45
 */
@Service
public class StudentServiceImpl implements StudentService {

	private transient Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
	@Autowired
	private StudentMapper studentMapper;
	private static int size = 0;
	@Override
	public PageInfo student(int sid, int current) {
		// TODO Auto-generated method stub
		PageInfo pi = new PageInfo(current);
		int count = studentMapper.count(sid);
		pi.setCount(count);
		
		List<Student> list = studentMapper.selectId(sid,pi.getStart(),pi.getOffset());
		pi.setList(list);
		return pi;
	}
	@Override
	public Student login(String sname, String spass) {
		log.info("账号{}尝试登录,密码{}",sname,spass);
		Student student = studentMapper.selectSname(sname);
		if (student==null || !spass.equals(student.getSpass())) {
			log.error("{}账号登录错误！",student);
			throw new loginException("用户名或密码错误！！");
		}
		log.info("{}学生账号登录成功！！", student);
		return student;
	}
	@Override
	public Student selectId(int sid) {
		Student student = studentMapper.find(sid);
		return student;
	}
	@Override
	public int addStudent(Student student) {
		int result = studentMapper.insert(student);
		return result;
	}
	@Override
	public int deleteStudent(int sid) {
		int result = studentMapper.deleteByPrimaryKey(sid);
		return result;
	}
	@Override
	public int updateStudent(Student student) {
		int result = studentMapper.updateByPrimaryKey(student);
		return result;
	}
	@Override
	public Student selectName(String sname) {
		return null;
		
	}
	@Override
	public List<Student> findList() {
		List<Student> list = new ArrayList<Student>();
		list = studentMapper.findList();
		return list;
	}
	@Override
	public List<Student> selectByName(String sname) {
		List<Student> student = studentMapper.selectByName(sname);
		return student;
	}
	@Override
	public PageInfo findAllPage(int current) {
		PageInfo pi = new PageInfo(current);
		List<Student> li = studentMapper.findList();
		size = li.size();
		pi.setCount(size);
		
		List<Student> list = studentMapper.findAllPage( pi.getStart(), pi.getOffset());
		pi.setList(list);
		
		return pi;
	}
	@Override
	public int deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
