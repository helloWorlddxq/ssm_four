package cn.edu.nuc.ssm_four.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.ssm_four.entity.Student;
import cn.edu.nuc.ssm_four.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

	int count(int tid);
	
	List<Teacher> selectId(@Param("tid")int tid, @Param("start")int start, @Param("offset")int offset);
    
    Teacher selectName(String tname);
    
    List<Student> findList();
    
    List<Student> selectStudent();
    
    List<Student> selectSname(String sname);
    
    Student selectId(int sid);
}