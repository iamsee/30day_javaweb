package com.javaweb.base;

import java.awt.Container;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 反射：加载类获得类的字节码
 * 反射技术应用于框架
 * 
 * @author Administrator
 * 
 */
public class 反射 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1
		Class class1 = Class.forName("com.javaweb.base.反射person");

		// 2
		Class class2 = new 反射person().getClass();

		// 3
		Class class3 = 反射person.class;
	}

	// 反射类(解剖类)的构造函数，创建类的对象
	// 反射构造函数：public 反射person(){}
	@Test
	public void test1() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("com.javaweb.base.反射person");
		Constructor c1 = class1.getConstructor(null);
		反射person p1 = (反射person) c1.newInstance(null);

		p1.setName("p1");
		System.out.println(p1.getName());

	}

	@Test
	public void test2() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class2 = Class.forName("com.javaweb.base.反射person");
		Constructor c2 = class2.getConstructor(String.class);
		反射person p2 = (反射person) c2.newInstance("xxx");
		p2.setName("bbbb");
		System.out.println(p2.getName());

	}

	@Test
	public void test3() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class3 = Class.forName("com.javaweb.base.反射person");
		Constructor c3 = class3.getConstructor(String.class, int.class);
		反射person p3 = (反射person) c3.newInstance("xxx", 121);
		p3.setName("ccc");
		System.out.println(p3.getName());

	}

	@Test
	public void test4() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class4 = Class.forName("com.javaweb.base.反射person");
		Constructor c4 = class4.getDeclaredConstructor(List.class);
		c4.setAccessible(true); //暴力反射
		反射person p4 = (反射person) c4.newInstance(new ArrayList());
		p4.setName("ddd");
		System.out.println(p4.getName());
	}
	
	/*等效于 test1*/
	@Test
	public void test5() throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Class class5 = Class.forName("com.javaweb.base.反射person");
		反射person p5 = (反射person) class5.newInstance(); //无参构造时候可以成立
		p5.setName("eeeee");
		System.out.println(p5.getName());
	}
}
