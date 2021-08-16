package cn.toseektech.consumer.service;

import java.util.List;

import cn.toseektech.consumer.dto.MaxCourseCountDto;
import cn.toseektech.consumer.dto.StudentUploadDto;

public interface StudentInfoAndCourseService {
	
	public void saveStudentInfoAndCourse(List<StudentUploadDto> list);
	
	public List<MaxCourseCountDto> queryMaxCourseCount();
		
}
