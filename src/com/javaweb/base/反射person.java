package com.javaweb.base;

import java.util.List;

public class ����person {

	public int id;
	public String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ����person(){
		
		System.out.println("person");
	}
	
	public ����person(String name)
	{
		System.out.println(name);
	}
	public ����person(String name,int password)
	{
		System.out.println(name+":"+password);
	}
	private ����person(List list){
		System.out.println("list");
	}
	
	
}
