package com.javaweb.base;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit {
	

	
	@Before
	public void before()
	{
		System.out.println("before");
	}
	
	@Test
	public void show1()
	{
		
		System.out.println("show1");
	}
	
	@Test
	public void show2()
	{
		System.out.println("show2");
	}
	
	@After
	public void after()
	{
		
		System.out.println("after");

	}


}
