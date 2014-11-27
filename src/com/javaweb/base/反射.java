package com.javaweb.base;

import java.awt.Container;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * ���䣺������������ֽ���
 * ���似��Ӧ���ڿ��
 * 
 * @author Administrator
 * 
 */
public class ���� {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1
		Class class1 = Class.forName("com.javaweb.base.����person");

		// 2
		Class class2 = new ����person().getClass();

		// 3
		Class class3 = ����person.class;
	}

	// ������(������)�Ĺ��캯����������Ķ���
	// ���乹�캯����public ����person(){}
	@Test
	public void test1() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("com.javaweb.base.����person");
		Constructor c1 = class1.getConstructor(null);
		����person p1 = (����person) c1.newInstance(null);

		p1.setName("p1");
		System.out.println(p1.getName());

	}

	@Test
	public void test2() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class2 = Class.forName("com.javaweb.base.����person");
		Constructor c2 = class2.getConstructor(String.class);
		����person p2 = (����person) c2.newInstance("xxx");
		p2.setName("bbbb");
		System.out.println(p2.getName());

	}

	@Test
	public void test3() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class3 = Class.forName("com.javaweb.base.����person");
		Constructor c3 = class3.getConstructor(String.class, int.class);
		����person p3 = (����person) c3.newInstance("xxx", 121);
		p3.setName("ccc");
		System.out.println(p3.getName());

	}

	@Test
	public void test4() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class4 = Class.forName("com.javaweb.base.����person");
		Constructor c4 = class4.getDeclaredConstructor(List.class);
		c4.setAccessible(true); //��������
		����person p4 = (����person) c4.newInstance(new ArrayList());
		p4.setName("ddd");
		System.out.println(p4.getName());
	}
	
	/*��Ч�� test1*/
	@Test
	public void test5() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class5 = Class.forName("com.javaweb.base.����person");
		����person p5 = (����person) class5.newInstance(); //�޲ι���ʱ����Գ���
		p5.setName("eeeee");
		System.out.println(p5.getName());
	}
}
