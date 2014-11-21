package com.javaweb.base;

import org.junit.Test;

public class 枚举 {
	
	@Test
	public void test(){
		print(Grade.B);
		
	}
	
	
	
	public void print(Grade g){
	String value1 =  g.localeValue();
	System.out.println(value1);
			
		
	}
	
	//枚举常用方法
	@Test
	public void 常用方法(){
		
		System.out.println(Grade.C.name());
		System.out.println(Grade.C.ordinal());
		String str = "B";
		//Grade g = Grade.valueOf(Grade.class,str);
		Grade g = Grade.valueOf(str);
		System.out.println(g);
		Grade gs[] = Grade.values();
		for(Grade g1 : gs)
		{
			System.out.println(g1);
		}
	}

}
//传统
//class Grade{
//	
//	private Grade(){}
//	
//	public static final Grade A = new Grade();
//	public static final Grade B = new Grade();
//	public static final Grade C = new Grade();
//	public static final Grade D = new Grade();
//	public static final Grade E = new Grade();
//}

//新型、
enum Grade{ 	//class A:100-90 B:89-70 ……
	//A,B,C,D,E; //Object
	//声明字段、方法
	
	A("100-90"){
		public String localeValue(){
			return "优";
		}
	}
	,B("89-80"){
		public String localeValue(){
			return "良";
		}
	}
	,C("79-70"){
		public String localeValue(){
			return "可";
		}
	}
	,D("69-60"){
		public String localeValue(){
			return "差";
		}
	}
	,E("59-0"){
		public String localeValue(){
			return "不及格";
		}
	};
	
	private String value;		//封装每个对象对应分数段
	private Grade(String value){
		this.value=value;
	}
	public String getValue(){
		return this.value;
		
	}
	//抽象方法的枚举
	public abstract String localeValue();
}

