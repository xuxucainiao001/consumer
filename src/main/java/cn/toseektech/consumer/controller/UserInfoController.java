package cn.toseektech.consumer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.toseektech.common.configuration.annotations.GlobalExceptionHandler;
import cn.toseektech.common.model.ResponseVO;
import cn.toseektech.common.utils.CommonUtil;
import cn.toseektech.consumer.dto.UserDto;
import cn.toseektech.remote.provider.api.UserRemote;
import cn.toseektech.remote.provider.dto.UserRemoteDto;

@RestController
@GlobalExceptionHandler
public class UserInfoController {

	@Resource
	private UserRemote userRemote;

	@GetMapping(value = "/getUserList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseVO<List<UserDto>> getUserList() {
		List<UserRemoteDto> list = userRemote.getUserList();
		return new ResponseVO<>(CommonUtil.listCopy(list, UserDto.class));
	}

}
