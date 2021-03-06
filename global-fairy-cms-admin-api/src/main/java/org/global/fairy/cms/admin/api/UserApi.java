package org.global.fairy.cms.admin.api;

import javax.annotation.Resource;

import org.global.fairy.cms.admin.api.params.RegistorApiParams;
import org.global.fairy.cms.admin.api.params.converters.RegistorApiParams2RegistorServiceParamsConverter;
import org.global.fairy.cms.admin.service.IUserService;
import org.global.fairy.cms.admin.service.params.RegistorServiceParams;
import org.global.fairy.core.PageParams;
import org.springframework.stereotype.Component;	

@Component
public class UserApi {
	@Resource
	public IUserService userService;

	public String register(RegistorApiParams registorApiParams) {
		RegistorServiceParams registorServiceParams = RegistorApiParams2RegistorServiceParamsConverter
				.newInstance().convert(registorApiParams);
		return userService.register(registorServiceParams);
	}

	public String list(PageParams pagerForm) {		
		return userService.list(pagerForm) ;
	}

	/**
	 * 
	 * 新增用户
	 * 
	 * @param registorApiParams
	 */
	public String addUser(RegistorApiParams registorApiParams) {
		RegistorServiceParams registorServiceParams = RegistorApiParams2RegistorServiceParamsConverter
				.newInstance().convert(registorApiParams);
		userService.addUser(registorServiceParams);
		return null;
	}
	
//	public String addMenu() {
//		MenuBean menuBean = new MenuBean();
//		menuService.addMenu(menuBean);
//		
//		return "";
//	}

}
