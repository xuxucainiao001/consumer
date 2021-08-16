package cn.toseektech.consumer.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import cn.toseektech.consumer.dao.SystemDictionaryMapper;
import cn.toseektech.consumer.dto.DictionaryDto;
import cn.toseektech.consumer.entity.SystemDictionary;
import cn.toseektech.translation.interfaces.DictionaryLoadService;

@Service
public class DictionaryServiceImpl implements DictionaryLoadService {

	private static final String DICT_SEPERATOR = ":";

	@Resource
	private SystemDictionaryMapper systemDictionaryMapper;

	@Override
	public Map<String, Map<String, String>> loadAllDictionaries() {
		List<SystemDictionary> list = systemDictionaryMapper.selectAllDictories();
		return list.parallelStream().map(e -> {
			DictionaryDto dto = new DictionaryDto();
			String tag = e.getDictTag();
			if (StringUtils.isBlank(tag)) {
				dto.setDictCode(e.getSystemCode()+"."+e.getDictCode());
			} else {
				dto.setDictCode(new StringBuilder(tag).append(DICT_SEPERATOR).append(e.getSystemCode()).append(".").append(e.getDictCode()).toString());
			}
			dto.setDictKey(e.getDictKey());
			dto.setDictValue(e.getDictValue());
			return dto;
		}).collect(Collectors.groupingBy(DictionaryDto::getDictCode,
				Collectors.toMap(DictionaryDto::getDictKey, DictionaryDto::getDictValue)));

	}

}
