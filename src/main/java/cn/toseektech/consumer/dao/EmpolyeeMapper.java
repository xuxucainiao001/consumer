package cn.toseektech.consumer.dao;

import cn.toseektech.consumer.entity.Empolyee;
import cn.toseektech.consumer.entity.EmpolyeeExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface EmpolyeeMapper {
    long countByExample(EmpolyeeExample example);

    int deleteByExample(EmpolyeeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Empolyee record);

    int insertSelective(Empolyee record);

    List<Empolyee> selectByExample(EmpolyeeExample example);

    Empolyee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Empolyee record, @Param("example") EmpolyeeExample example);

    int updateByExample(@Param("record") Empolyee record, @Param("example") EmpolyeeExample example);

    int updateByPrimaryKeySelective(Empolyee record);

    int updateByPrimaryKey(Empolyee record);
    
    List<Empolyee> queryAll();

	List<Empolyee> queryEmpolyeeByIds(@Param("ids")Set<Long> ids);
}