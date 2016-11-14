package cn.edu.nuc.ssm_four.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm_four.BaseTest;
import cn.edu.nuc.ssm_four.dto.PageInfo;
import cn.edu.nuc.ssm_four.service.interfaces.StudentService;

/**
 * @date 2016年11月4日下午2:27:25
 */
public class StudentServiceImplTest extends BaseTest {

	@Autowired
	private StudentService studentService;
	@Test
	public void test() {
		PageInfo pi = studentService.student(3,1);
		System.out.println( pi );
	}

}
