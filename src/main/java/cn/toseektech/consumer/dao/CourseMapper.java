package cn.toseektech.consumer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.toseektech.consumer.entity.Course;
import cn.toseektech.consumer.entity.CourseExample;
import cn.toseektech.consumer.entity.MaxCourseCount;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
    void batchInsert(@Param("list") List<Course> list);

	List<MaxCourseCount> queryMaxCourseCount();
}