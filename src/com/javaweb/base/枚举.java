package com.javaweb.base;

import org.junit.Test;

public class ö�� {
	
	@Test
	public void test(){
		print(Grade.B);
		
	}
	
	
	
	public void print(Grade g){
	String value1 =  g.localeValue();
	System.out.println(value1);
			
		
	}
	
	//ö�ٳ��÷���
	@Test
	public void ���÷���(){
		
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
//��ͳ
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

//���͡�
enum Grade{ 	//class A:100-90 B:89-70 ����
	//A,B,C,D,E; //Object
	//�����ֶΡ�����
	
	A("100-90"){
		public String localeValue(){
			return "��";
		}
	}
	,B("89-80"){
		public String localeValue(){
			return "��";
		}
	}
	,C("79-70"){
		public String localeValue(){
			return "��";
		}
	}
	,D("69-60"){
		public String localeValue(){
			return "��";
		}
	}
	,E("59-0"){
		public String localeValue(){
			return "������";
		}
	};
	
	private String value;		//��װÿ�������Ӧ������
	private Grade(String value){
		this.value=value;
	}
	public String getValue(){
		return this.value;
		
	}
	//���󷽷���ö��
	public abstract String localeValue();
}

