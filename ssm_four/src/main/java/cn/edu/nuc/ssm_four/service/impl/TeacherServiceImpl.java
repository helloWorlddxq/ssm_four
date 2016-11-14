package cn.edu.nuc.ssm_four.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm_four.dao.interfaces.TeacherMapper;
import cn.edu.nuc.ssm_four.dto.PageInfo;
import cn.edu.nuc.ssm_four.entity.Student;
import cn.edu.nuc.ssm_four.entity.Teacher;
import cn.edu.nuc.ssm_four.exception.loginException;
import cn.edu.nuc.ssm_four.service.interfaces.TeacherService;

/**
 * @date 2016年11月9日上午10:23:04
 */
@Service
public class TeacherServiceImpl implements TeacherService {

	private transient Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);
	@Autowired
	private TeacherMapper teacherMapper;
	@Override
	public PageInfo teacher(int tid, int current) {
		// TODO Auto-generated method stub
		PageInfo pi = new PageInfo(current);
		int count = teacherMapper.count(tid);
		pi.setCount(count);
		
		List<Teacher> list = teacherMapper.selectId(tid,pi.getStart(),pi.getOffset());
		pi.setList(list);
		return pi;
	}

	@Override
	public Teacher login(String tname, String tpass) {
		// TODO Auto-generated method stub
		log.info("账号{}尝试登录,密码{}",tname,tpass);
		Teacher teacher = teacherMapper.selectName(tname);
		if (teacher==null || !tpass.equals(teacher.getTpass())) {
			log.error("{}账号登录错误！",teacher);
			throw new loginException("用户名或密码错误！！");
		}
		log.info("{}教师账号登录成功！！", teacher);
		return teacher;
	}

	@Override
	public Student selectName(String sname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo findAllPage(int current) {
		// TODO Auto-generated method stub
		return null;
	}

}
