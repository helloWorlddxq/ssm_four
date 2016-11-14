package cn.edu.nuc.ssm_four.service.interfaces;

import org.jboss.logging.Param;

import cn.edu.nuc.ssm_four.dto.PageInfo;
import cn.edu.nuc.ssm_four.entity.Student;
import cn.edu.nuc.ssm_four.entity.Teacher;

/**
 * @date 2016年11月9日上午9:46:44
 */
public interface TeacherService {

	PageInfo teacher(int tid, int current);
	
	Teacher login(String tname, String tpass);
	
	Student selectName(String sname);
	
	PageInfo findAllPage(int current);
	
	
}
