package cn.edu.nuc.ssm_four.dao.interfaces;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm_four.BaseTest;
import cn.edu.nuc.ssm_four.entity.Admin;

/**
 * @date 2016年10月31日下午5:39:29
 */
public class AdminMapperTest extends BaseTest{

	@Autowired
	private AdminMapper adminMapper;
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		Admin admin = adminMapper.selectByPrimaryKey(1);
		System.out.println(admin);
		Assert.assertNotNull(admin);
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
