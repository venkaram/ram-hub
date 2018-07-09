package com.test;

public class CustomObject {
	
	private String roleName;
	private String privilegeName;
	private String privilege;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	@Override
	public String toString() {
		return "CustomObject [roleName=" + roleName + ", privilegeName="
				+ privilegeName + ", privilege=" + privilege + "]";
	}

}
