package com.crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Crud {

	@Id
//	@Column(name = "Student id")
	private int s_id;
//	@Column(name = "Student Name")
	private String s_name;
//	@Column(unique = true, name = "Student id")
	private String s_contact;
//	@Column(name = "Student Address")
	private String s_address;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_contact() {
		return s_contact;
	}

	public void setS_contact(String s_contact) {
		this.s_contact = s_contact;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	@Override
	public String toString() {
		return "Crud [s_id=" + s_id + ", s_name=" + s_name + ", s_contact=" + s_contact + ", s_address=" + s_address
				+ "]";
	}

}
