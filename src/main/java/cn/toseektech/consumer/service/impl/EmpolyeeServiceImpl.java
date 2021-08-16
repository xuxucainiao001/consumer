package cn.toseektech.consumer.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.toseektech.common.utils.CommonUtil;
import cn.toseektech.consumer.ao.EmpolyeeAo;
import cn.toseektech.consumer.dao.EmpolyeeMapper;
import cn.toseektech.consumer.dto.EmpolyeeDto;
import cn.toseektech.consumer.entity.Empolyee;
import cn.toseektech.consumer.service.EmpolyeeService;


@Service
public class EmpolyeeServiceImpl implements EmpolyeeService {
	
	@Resource
	private  EmpolyeeMapper empolyeeMapper;

	@Override
	public List<EmpolyeeDto> queryAllEmpolyee() {
		List<Empolyee> list = empolyeeMapper.queryAll();
		return CommonUtil.listCopy(list, EmpolyeeDto.class);
	}

	@Override
	public List<EmpolyeeDto> queryEmpolyeeByIds(Set<Long> ids) {
		List<Empolyee> list =empolyeeMapper.queryEmpolyeeByIds(ids);
		return CommonUtil.listCopy(list, EmpolyeeDto.class);
	}

	@Override
	public void disposeEmpolyee(EmpolyeeAo ao) {
		
	}

}
