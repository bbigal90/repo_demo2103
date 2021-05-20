package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/zipcode/*")
public class ZipCodeController {
	Logger logger = LogManager.getLogger(ZipCodeController.class);
	@Autowired
	private ZipCodeLogic zipCodeLogic = null;
	@RequestMapping("getZipCodeList")
	public String getZipCodeList(HttpServletRequest req) {
		logger.info("getZipCodeList 호출 성공");;
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		req.setAttribute("zipList",zipList);

//		return "forward:getZipCodeList.jsp";
		// WEB-INF/jsp/zipcode/getZipcodeList.jsp.jsp -> 404
		return "zipcode/getZipCodeList";
	}
	@RequestMapping("getZipCodeList2.sp4")
	public ModelAndView getZipCodeList2(HttpServletRequest req) {
		logger.info("getZipCodeList2 호출 성공");;
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("zipcode/getZipcodeList");
		mav.addObject("zipList", zipList);
		return mav;
	}
}
