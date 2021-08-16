package cn.toseektech.consumer.dao;

import cn.toseektech.consumer.entity.SystemDictionary;
import cn.toseektech.consumer.entity.SystemDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemDictionaryMapper {
    long countByExample(SystemDictionaryExample example);

    int deleteByExample(SystemDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemDictionary record);

    int insertSelective(SystemDictionary record);

    List<SystemDictionary> selectByExample(SystemDictionaryExample example);

    SystemDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemDictionary record, @Param("example") SystemDictionaryExample example);

    int updateByExample(@Param("record") SystemDictionary record, @Param("example") SystemDictionaryExample example);

    int updateByPrimaryKeySelective(SystemDictionary record);

    int updateByPrimaryKey(SystemDictionary record);
    
    List<SystemDictionary> selectAllDictories();
}