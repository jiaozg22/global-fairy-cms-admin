package org.global.fairy.cms.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.global.fairy.cms.admin.dao.beans.UserInfoBean;
import org.global.fairy.core.PageParams;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper{

	UserInfoBean getUserInfo();

	int insertUserInfo(UserInfoBean userInfo);

	int deleteUserInfo(long id);

	List<UserInfoBean> list(@Param(value = "pageParams") PageParams pageParams);

}
