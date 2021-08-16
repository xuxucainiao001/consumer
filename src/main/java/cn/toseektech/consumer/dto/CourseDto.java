package cn.toseektech.consumer.dto;

/**
 * 课程
 * @author xuxu
 *
 */
public class CourseDto extends BaseDto{
	
	private Long courseId;
	
	private String courseName;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
