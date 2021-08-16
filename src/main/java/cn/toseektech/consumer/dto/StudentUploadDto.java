package cn.toseektech.consumer.dto;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class StudentUploadDto {
	
	private Long id;
    
	private String name;
    
	private Integer sex;
    
	private Integer age;
    
	private Integer classNum;
    
	private List<CourseDto> courses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getClassNum() {
		return classNum;
	}

	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}

	public List<CourseDto> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseDto> courses) {
		this.courses = courses;
	}
	
	public static final StudentUploadDto transferFrom(StudentUploadExcelDto studentUploadExcelDto) {
		StudentUploadDto dto = new StudentUploadDto();
		dto.setId(studentUploadExcelDto.getId());
		dto.setName(studentUploadExcelDto.getName());
		dto.setSex(studentUploadExcelDto.getSex().equals("男")?1:0);
		dto.setAge(studentUploadExcelDto.getAge());
		dto.setClassNum(studentUploadExcelDto.getClassNum());
		dto.setCourses(JSON.parseArray(studentUploadExcelDto.getCourses(), CourseDto.class));
		return dto;
	}

}
