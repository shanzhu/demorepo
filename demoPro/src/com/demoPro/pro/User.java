package com.demoPro.pro;

public class User {
	
	// 姓名
	private String name;
	
	// 电话
	private String cell;
	
	/**
	 * 默认构造
	 */
	public User(){}
	
	/**
	 * 有参构造
	 * @param name
	 */
	public User(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}
	
}
