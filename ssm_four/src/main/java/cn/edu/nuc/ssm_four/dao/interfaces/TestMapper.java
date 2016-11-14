package cn.edu.nuc.ssm_four.dao.interfaces;

import cn.edu.nuc.ssm_four.entity.Test;

public interface TestMapper {
    int deleteByPrimaryKey(Integer testid);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer testid);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}