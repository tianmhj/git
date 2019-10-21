package com.dzkj.pojo;

public class users {
	private Integer id;
	private String name;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public users(Integer id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	

}
