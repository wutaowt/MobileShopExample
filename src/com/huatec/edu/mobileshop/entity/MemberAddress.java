package com.huatec.edu.mobileshop.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class MemberAddress implements Serializable {
	private Integer address_id;
	private Integer member_id;

	private String province;
	private String city;
	private String region;

	private String addr;
	private String mobile;
	private String receiver;

	private Timestamp creatime;
	private Timestamp modifytime;

	// πÿ¡™ Ù–‘
	private Member member;

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Timestamp getCreatime() {
		return creatime;
	}

	public void setCreatime(Timestamp creatime) {
		this.creatime = creatime;
	}

	public Timestamp getModifytime() {
		return modifytime;
	}

	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public MemberAddress() {
		super();
	}

	public MemberAddress(Integer address_id, Integer member_id, String province, String city, String region,
			String addr, String mobile, String receiver, Timestamp creatime, Timestamp modifytime) {
		super();
		this.address_id = address_id;
		this.member_id = member_id;
		this.province = province;
		this.city = city;
		this.region = region;
		this.addr = addr;
		this.mobile = mobile;
		this.receiver = receiver;
		this.creatime = creatime;
		this.modifytime = modifytime;
	}

	@Override
	public String toString() {
		return "MemberAddress [address_id=" + address_id + ", member_id=" + member_id + ", province=" + province
				+ ", city=" + city + ", region=" + region + ", addr=" + addr + ", mobile=" + mobile + ", receiver="
				+ receiver + ", creatime=" + creatime + ", modifytime=" + modifytime + ", member=" + member + "]";
	}

}
