package cn.toseektech.consumer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.toseektech.consumer.entity.StudentCourseRef;
import cn.toseektech.consumer.entity.StudentCourseRefExample;

public interface StudentCourseRefMapper {
    long countByExample(StudentCourseRefExample example);

    int deleteByExample(StudentCourseRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentCourseRef record);

    int insertSelective(StudentCourseRef record);

    List<StudentCourseRef> selectByExample(StudentCourseRefExample example);

    StudentCourseRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentCourseRef record, @Param("example") StudentCourseRefExample example);

    int updateByExample(@Param("record") StudentCourseRef record, @Param("example") StudentCourseRefExample example);

    int updateByPrimaryKeySelective(StudentCourseRef record);

    int updateByPrimaryKey(StudentCourseRef record);
    
    void batchInsert(@Param("list") List<StudentCourseRef> list);
}