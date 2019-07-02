package org.global.fairy.cms.admin.service;

import org.global.fairy.cms.admin.modules.MenuBean;

/**
 * 
 * @author jiao_zg22@163.com
 * @param <MenuBean>
 * @since 20190625
 *
 */
public interface IMenuService {
	
	/**
	 * 创建栏目
	 * @param MenuBean
	 * @param menuBean
	 */
	void addMenu(MenuBean menuBean);
}
