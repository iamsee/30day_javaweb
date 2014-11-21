package com.javaweb.base;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class for循环增强 {
	@Test
	public void 委托数组() {
		int arr[] = { 1, 2, 3 };

		for (int num : arr) {
			System.out.println(num);
		}
	}

	@Test
	public void 委托集合() {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (Object obj : list) {
			int i = (Integer) obj;
			System.out.println(i);

		}

	}

	@Test
	public void 委托map() {
		Map map = new HashMap(); // LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		map.put("4", "ddd");

		// 传统方式1
		System.out.println("传统方法1获取map");
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) map.get(key);
			System.out.println(key + ":" + value);
		}

		// 传统方式2
		System.out.println("传统方法2获取map");
		Set set2 = map.entrySet();
		Iterator it2 = set2.iterator();
		while (it2.hasNext()) {
			Map.Entry entry = (Entry) it2.next();
			String key2 = (String) entry.getKey();
			String value2 = (String) entry.getValue();
			System.out.println(key2 + ":" + value2);

		}

		// for增强型对应传统1
		System.out.println("for增强型对应传统1获取map");
		for (Object obj : map.keySet()) {
			String key3 = (String) obj;
			String value3 = (String) map.get(key3);
			System.out.println(key3 + ":" + value3);

		}
		// for增强型对应传统2
		System.out.println("for增强型对应传统2获取map");
		for (Object obj4 : map.entrySet()) {
			Map.Entry entry4 = (Entry) obj4;
			String key4 = (String) entry4.getKey();
			String value4 = (String) entry4.getValue();
			System.out.println(key4 + ":" + value4);
		}

	}

	@Test
	//注意问题
	public void 注意问题(){
		
		int arr[] = {1,2,3};
		for (int i : arr){
			i = 10;
			
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		ArrayList list = new ArrayList();
		list.add("1");
		for(Object obj:list)
		{
			obj="10";
		}
		System.out.println(list.get(0));
	}
}

	