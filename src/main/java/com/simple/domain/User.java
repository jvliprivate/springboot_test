package com.simple.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = -5939599230753662529L;
	private Integer id;
	private String name;
	private String age;
	//private Date updateTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString(){
		
		return "userId:"+id+"  username:"+name+"  age:"+age ;
	}
}
