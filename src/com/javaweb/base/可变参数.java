package com.javaweb.base;


import java.lang.reflect.Array;
import java.util.*;

import org.junit.Test;

public class �ɱ���� {
	
	@Test
	public void testSum(){
		sum(1,2,3,4,5,6);
		
	}
	
	public void sum(int ...nums) //...numsΪ�ɱ����
	{
		//�ɱ������������
		int sum = 0;
		for(int i : nums)
		{
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	//ע������ public void ע������(int ...nums,int x)������
	public void ע������(int x ,int ...nums) //��һ����x������...numsop9h
	{
		
	}
	@Test
	public void ע������2(){
		
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
