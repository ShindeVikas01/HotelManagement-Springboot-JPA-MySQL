package com.infinity.hotelmanagment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customertb")
public class CustomerEntity {

	@Id
	private int cid;
	private String cname;
	private String mobnum;
	private String eid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobnum() {
		return mobnum;
	}
	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	
}
