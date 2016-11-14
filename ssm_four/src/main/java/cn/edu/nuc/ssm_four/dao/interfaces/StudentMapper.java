package cn.edu.nuc.ssm_four.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.nuc.ssm_four.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    int count(int sid);
    
    List<Student> selectId(@Param("sid")int sid, @Param("start")int start, @Param("offset")int offset);
    
    List<Student> findAllPage( @Param("start") int start, @Param("offset")int offset);
    
    Student selectSname(String sname);

	List<Student> findList();
	
	List<Student> selectByName(String sname);
	
	Student find(int sid);
}