package com.design.zipcode;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;

/*
 * 자료구조의 종류
 * 1) List 계열
 * 	ArrayList - 싱글스레드 안전, 동기화 처리 생략, 속도 빠르다.
 *  Vector - 멀티스레드 안전, 동기화 처리, 속도 느린편
 *  	: 경합, 다중 접속자 처리, 순서, 동기화처리
 * 2) Map 계열 ( 해시태그 ) 
 * 
 * 3) Set 계열 ( 빈도 낮음 ) - 집합
 * 
 * 머리가 jvm 이어야 이득이다
 * 
 * 
 */
public class ZipCodeList extends JFrame {
	
	public static void main(String[] args) {
		// <>꺽쇠 : 제네릭이라고 함. 생성부에는 타입 없이 다이아몬드 연산자만 붙임.
		Vector<ZipCodeVO> v = new Vector<>(); // 다형성을 누릴 수 없다.
		List<ZipCodeVO> v2 	= new Vector<>();  // 다형성 누린다.
		ZipCodeVO zcVO 		= null;
		ZipCodeVO zcVOs[] 	= null;
		int i = 0;
		while(i<3) {
			
			zcVO = new ZipCodeVO();
			//VO 안에 전역변수인 어드레스에 서울시 금천구 가산동을 초기화 하였다.
			zcVO.setAddress("서울시");

			System.out.println("zcVO주소번지 바뀐다. ===>"+ zcVO +"===zcVO ===>"+zcVO.getAddress());
			v.add(zcVO);
			zcVO.setAddress("인천직할시");
			i++;
			
		}
		for (int x=0; x<v.size();x++) {
			ZipCodeVO zVO = v.get(x); // 28번에서 만들어진 VO와는 다른것.
			System.out.println(zVO);  // 다른 주소번지가 출력된다.
		}
		zcVOs = new ZipCodeVO[v.size()]; // 객체배열이 3개 만들어 진다.
		System.out.println("배열의 크기는 "+ zcVOs.length); // 3이 출력됨.
		// 여기서 찍으면 3개가 다 null 아니면 서울시 금천구 가산동이다.
		v.copyInto(zcVOs); // 벡터에 담긴 것을 배열에 담아준다.
		for(int y=0; y<zcVOs.length;y++) {
			System.out.println(zcVOs[y]+"--"+ zcVOs[y].getAddress()); // 객체 배열의 주소번지가 3개 출력된다.
		}
	}

}
