package com.javaweb.base;


import java.lang.reflect.Array;
import java.util.*;

import org.junit.Test;

public class 可变参数 {
	
	@Test
	public void testSum(){
		sum(1,2,3,4,5,6);
		
	}
	
	public void sum(int ...nums) //...nums为可变参数
	{
		//可变参数当成数组
		int sum = 0;
		for(int i : nums)
		{
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	//注意问题 public void 注意问题(int ...nums,int x)不可以
	public void 注意问题(int x ,int ...nums) //第一个给x其他给...numsop9h
	{
		
	}
	@Test
	public void 注意问题2(){
		
		List list =   Arrays.asList("1","2","3");
		System.out.println(list);
		
		String arr[] = {"1","2","3","4"};
		list = Arrays.asList(arr);
		System.out.println(list);
		
		int nums[] = {1,2,3,4,5};
		list = Arrays.asList(nums);
		System.out.println(list);
		
		Integer numss[] = {1,2,3,4,5};
		list = Arrays.asList(numss);
		System.out.println(list);
		
	}

}
