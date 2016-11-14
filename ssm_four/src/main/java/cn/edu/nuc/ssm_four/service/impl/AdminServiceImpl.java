package cn.edu.nuc.ssm_four.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm_four.dao.interfaces.AdminMapper;
import cn.edu.nuc.ssm_four.entity.Admin;
import cn.edu.nuc.ssm_four.exception.loginException;
import cn.edu.nuc.ssm_four.service.interfaces.AdminService;

/**
 * @date 2016年11月3日下午3:00:00
 */
@Service
public class AdminServiceImpl implements AdminService {

	private transient Logger log = LoggerFactory.getLogger(AdminServiceImpl.class);
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin login(String aname, String apass) {
		// TODO Auto-generated method stub
		log.info("账号{}尝试登录,密码{}",aname,apass);
		Admin admin = adminMapper.selectByName(aname);
		if (admin==null || ! apass.equals(admin.getApass())) {
			log.error("{}账号登录错误！",admin);
			throw new loginException("用户名或密码错误！！");
		}
		log.info("{}管理员账号登录成功！！", admin);
		return admin;
	}

}
