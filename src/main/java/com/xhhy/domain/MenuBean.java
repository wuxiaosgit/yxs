package com.xhhy.domain;

import java.io.Serializable;

public class MenuBean implements Serializable {
	private Integer menuId;
	private Integer menuState;
	private String  menuName;
	private String  menuUrl;
	
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public Integer getMenuState() {
		return menuState;
	}
	public void setMenuState(Integer menuState) {
		this.menuState = menuState;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	@Override
	public String toString() {
		return "MenuBean [menuId=" + menuId + ", menuState=" + menuState + ", menuName=" + menuName + ", menuUrl="
				+ menuUrl + "]";
	}
	
}
