package com.example.demo;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class RestDeptcController {
	Logger logger = LogManager.getLogger(RestDeptcController.class);
	@Autowired
	DeptLogic deptLogic = null;
	@RequestMapping("dept/respansePage")
	public String responsePage() {
		logger.info("respansePage 호출 성공");
		return "한글 페이지";
	}
	@RequestMapping("dept/jsonDeptList")
	public String jsonDeptList() {
		logger.info("jsonDeptList 호출 성공");
		List<Map<String, Object>> deptList = null;
		deptList = deptLogic.jsonDeptList();
		Gson g = new Gson();
		String deptGson = g.toJson(deptList);
		return deptGson;
	}
}
