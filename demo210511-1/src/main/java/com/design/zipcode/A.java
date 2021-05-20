package com.design.zipcode;

import java.util.ArrayList;

public class A {
/*
 * 컬렉션 프레임워크에서 제공하는 클래스 중에 하나이다.
 * 여기에 담을 수 있는 것들은 기보적으로 Object 급이다.
 * 원시형 타입은 담을 수가 없다.
 * 
 * 배열과는 무엇이 다른가요?
 * 
 */
	public static void main(String[] args) {
		ArrayList f1 = new ArrayList();
		f1.add("딸기");
		f1.add("수박");
		f1.add("키위");
		String my = (String)f1.get(0);
		Object obj = f1.get(2);
		System.out.println(my);
		System.out.println(obj);
		System.out.println("-----------------------------------");
		ArrayList f2 = new ArrayList<String>();
		f2.add("딸기");
		f2.add("수박");
		f2.add("키위");
		String my2 = (String)f1.get(0);
		Object obj2 = f2.get(2);
		System.out.println(my2);
		System.out.println(obj2);
	}

}
