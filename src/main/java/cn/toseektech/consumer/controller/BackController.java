package cn.toseektech.consumer.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.lang.UUID;
import cn.toseektech.common.configuration.annotations.GlobalExceptionHandler;
import cn.toseektech.common.model.ResponseVO;

@RestController
@GlobalExceptionHandler
@RequestMapping("back")
public class BackController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
    
	@GetMapping("/activeCode")
	public ResponseVO<Object> acitveCode(@RequestParam("code")String code) {
		logger.info("code = {}",code);	
		return new ResponseVO<>();
	}
	
	@GetMapping("/showMDC")
	public void showMDC(){
		MDC.put("TRACE_ID", UUID.fastUUID().toString());
		logger.info("MDC:{}",MDC.get("TRACE_ID"));
	}

}
