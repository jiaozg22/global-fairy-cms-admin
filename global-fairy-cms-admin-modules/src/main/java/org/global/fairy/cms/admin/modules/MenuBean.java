package org.global.fairy.cms.admin.modules;

import java.io.Serializable;


/**
 * 菜单栏
 * @author jiao_
 *
 */
public class MenuBean implements Serializable {
	
	private static final long serialVersionUID = 1371122908947179814L;
	
	public Integer id;//标识
	public Integer parentId;//父标识
	public Integer leftId;//左节点标识
	public Integer rightId;//右节点标识
	public String name;//菜单名字
	public String type;//菜单类型
	public String url;//菜单类型
	public String icon;//菜单显示图标
	public String optType;//操作类型  1：查看 2.新增 3.修改 4.删除
	
	
	
	public MenuBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MenuBean(Integer id, Integer parentId, Integer leftId, Integer rightId, String name, String type, String url,
			String icon, String optType) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.leftId = leftId;
		this.rightId = rightId;
		this.name = name;
		this.type = type;
		this.url = url;
		this.icon = icon;
		this.optType = optType;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getLeftId() {
		return leftId;
	}
	public void setLeftId(Integer leftId) {
		this.leftId = leftId;
	}
	public Integer getRightId() {
		return rightId;
	}
	public void setRightId(Integer rightId) {
		this.rightId = rightId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getOptType() {
		return optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}
	
	@Override
	public String toString() {
		return "MenuBean [id=" + id + ", parentId=" + parentId + ", leftId=" + leftId + ", rightId=" + rightId
				+ ", name=" + name + ", type=" + type + ", url=" + url + ", icon=" + icon + ", optType=" + optType
				+ "]";
	}

}
