package com.sd.beans;

public class Role {
	private int roleId;
	private String name;
	private String desc;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name + ", desc=" + desc + "]";
	}
	
}

