package cn.toseektech.consumer.service;

import java.util.List;
import java.util.Set;

import cn.toseektech.consumer.ao.EmpolyeeAo;
import cn.toseektech.consumer.dto.EmpolyeeDto;

public interface EmpolyeeService {
	
	
	public List<EmpolyeeDto> queryAllEmpolyee();

	public List<EmpolyeeDto> queryEmpolyeeByIds(Set<Long> ids);
	
	public void disposeEmpolyee(EmpolyeeAo ao);
}
