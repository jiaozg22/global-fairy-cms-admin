package org.global.fairy.cms.admin.service.impl;


import org.global.fairy.cms.admin.modules.MenuBean;
import org.global.fairy.cms.admin.service.IMenuService;
import org.springframework.stereotype.Service;



/**
 * 菜单栏dao实现类
 * @author jiao_zg22@163.com
 *
 */
@Service("menuService")
public class MenuServiceImpl implements IMenuService{

	@Override
	public void addMenu(MenuBean menuBean) {
		// TODO Auto-generated method stub
		System.out.println("menuService");
	}
}
