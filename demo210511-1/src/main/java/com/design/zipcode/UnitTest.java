package com.design.zipcode;

import java.util.ArrayList;

public class UnitTest {

	public static void main(String[] args) {
		ZipCodeDao zcd = new ZipCodeDao();
		ArrayList<ZipCodeVO> zipcodeList = null;
		zipcodeList = zcd.getZipCodeList("가산동");
		zipcodeList = zcd.getZipCodeList("철산동");
		zipcodeList = zcd.getZipCodeList("구디동");
		System.out.println(zipcodeList);
	}

}
