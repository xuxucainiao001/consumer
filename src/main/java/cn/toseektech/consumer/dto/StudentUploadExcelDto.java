package cn.toseektech.consumer.dto;

import com.alibaba.excel.annotation.ExcelProperty;

public class StudentUploadExcelDto extends BaseDto{
    
	@ExcelProperty("id")
	private Long id;
    
	@ExcelProperty("姓名")
	private String name;
    
	@ExcelProperty("性别")
	private String sex;
    
	@ExcelProperty("年龄")
	private Integer age;
    
	@ExcelProperty("班级编号")
	private Integer classNum;
    
	@ExcelProperty("选修课程")
	private String courses;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
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

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

}
