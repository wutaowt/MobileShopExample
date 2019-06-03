package com.huatec.edu.mobileshop.entity;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Member implements Serializable {
	private  Integer member_id;
	private String uname;
	private String password;
	private String email;
	private String sex  ;
	private String mobile;
	private Timestamp regtime ;
	private Timestamp lastlogin;
	private String image;
	private List<MemberAddress> memberAddress;
	
	
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Timestamp getRegtime() {
		return regtime;
	}
	public void setRegtime(Timestamp regtime) {
		this.regtime = regtime;
	}
	public Timestamp getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Timestamp lastlogin) {
		this.lastlogin = lastlogin;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

	
	
	
	
	public List<MemberAddress> getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(List<MemberAddress> memberAddress) {
		this.memberAddress = memberAddress;
	}
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", uname=" + uname + ", password=" + password + ", email=" + email
				+ ", sex=" + sex + ", mobile=" + mobile + ", regtime=" + regtime + ", lastlogin=" + lastlogin + "]";
	}
	
	
}	
