package cn.edu.nuc.ssm_four.service.interfaces;

import cn.edu.nuc.ssm_four.entity.Admin;

/**
 * @date 2016年11月3日下午2:54:07
 */
public interface AdminService {

	Admin login(String aname, String apass);
}
