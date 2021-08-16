package cn.toseektech.consumer.translation.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;

import cn.toseektech.consumer.dto.EmpolyeeDto;
import cn.toseektech.consumer.service.EmpolyeeService;
import cn.toseektech.translation.interfaces.CacheableTranslateInvoker;

/**
 * 通过员工id查询员工信息
 * @author xuxu
 *
 */
@Component
public class EmpolyeeQueryInvoker extends CacheableTranslateInvoker<Long,EmpolyeeDto>{
	
	@Resource
	private EmpolyeeService empolyeeService;

	@Override
	public Map<Long, EmpolyeeDto> invokeByParams0(Set<Long> params) {		
		List<EmpolyeeDto> list=empolyeeService.queryEmpolyeeByIds(params);
		return Maps.uniqueIndex(list, EmpolyeeDto::getId);
	}

}
