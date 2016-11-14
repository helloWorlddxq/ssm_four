package cn.edu.nuc.ssm_four.service.interfaces;

import java.util.List;

import cn.edu.nuc.ssm_four.dto.PageInfo;
import cn.edu.nuc.ssm_four.entity.Student;

/**
 * @date 2016年11月3日下午5:00:51
 */
public interface StudentService {

	PageInfo student(int sid, int current);
	
	Student login(String sname , String spass);
	
	Student selectId(int sid);
	
	int addStudent(Student student);
	
	int deleteStudent(Student student);
	
	int updateStudent(Student student);
	
	Student selectName(String sname);
	
	List<Student> findList();
	
	List<Student> selectByName(String name);
	
	PageInfo findAllPage(int current);

	int deleteStudent(int sid);
}
