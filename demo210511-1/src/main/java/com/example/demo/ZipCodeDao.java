package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ZipCodeDao {
	Logger logger = LogManager.getLogger(ZipCodeDao.class);
	
	private static final String NAMESPACE = "com.example.demo.";
	
	@Autowired(required = false)
	private SqlSession sqlSession = null;

	public List<Map<String, Object>> getZipList() {
		logger.info("getZipList 호출 성공");
		List<Map<String, Object>> zipList = null;
		
		// 상수로 가져옴 
//		zipList = new ArrayList<>();
//		Map<String, Object> rmap = new HashMap<>();
//		rmap.put("mem_name", "안녕하세요");
//		zipList.add(rmap);
//		
//		rmap = null;
//		rmap = new HashMap<>();
//		rmap.put("mem_name", "스프링중입니다.");
//		zipList.add(rmap);
//		zipList = null;
		
		zipList = sqlSession.selectList(NAMESPACE+"refreshData"); 
		return zipList;
	}
	
}
