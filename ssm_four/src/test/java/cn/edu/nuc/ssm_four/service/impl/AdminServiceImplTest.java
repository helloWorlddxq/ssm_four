package cn.edu.nuc.ssm_four.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm_four.BaseTest;
import cn.edu.nuc.ssm_four.entity.Admin;
import cn.edu.nuc.ssm_four.service.interfaces.AdminService;

/**
 * @date 2016年11月3日下午3:48:19
 */
public class AdminServiceImplTest extends BaseTest{

	 
	@Autowired
	private AdminService adminService;
	@Test
	public void testLogin() {

		Admin admin = adminService.login("dxq", "dxq");
		System.out.println(admin);
		Assert.assertNotNull(admin);
	}

}
