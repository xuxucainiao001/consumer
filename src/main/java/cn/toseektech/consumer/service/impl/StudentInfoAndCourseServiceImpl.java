package cn.toseektech.consumer.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import cn.toseektech.common.utils.CommonUtil;
import cn.toseektech.consumer.dao.CourseMapper;
import cn.toseektech.consumer.dao.StudentCourseRefMapper;
import cn.toseektech.consumer.dao.StudentMapper;
import cn.toseektech.consumer.dto.MaxCourseCountDto;
import cn.toseektech.consumer.dto.StudentUploadDto;
import cn.toseektech.consumer.entity.Course;
import cn.toseektech.consumer.entity.MaxCourseCount;
import cn.toseektech.consumer.entity.Student;
import cn.toseektech.consumer.entity.StudentCourseRef;
import cn.toseektech.consumer.service.StudentInfoAndCourseService;

@Service
public class StudentInfoAndCourseServiceImpl implements StudentInfoAndCourseService {

	@Resource
	private StudentMapper studentMapper;

	@Resource
	private StudentCourseRefMapper studentCourseRefMapper;

	@Resource
	private CourseMapper courseMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void saveStudentInfoAndCourse(List<StudentUploadDto> list) {
		List<Student> students = Lists.newArrayList();
		Set<Course> coursesSet = Sets.newTreeSet((a, b) -> a.getCourseId().hashCode() - b.getCourseId().hashCode());
		List<StudentCourseRef> studentCourseRefs = Lists.newArrayList();
		list.forEach(studentUploadDto -> {
			Student student = new Student();
			student.setName(studentUploadDto.getName());
			student.setAge(studentUploadDto.getAge());
			student.setId(studentUploadDto.getId());
			student.setClassNum(studentUploadDto.getClassNum());
			student.setSex(studentUploadDto.getSex());
			students.add(student);

			List<Course> courseList = studentUploadDto.getCourses()
					.stream()
					.map(e->CommonUtil.copy(e, Course.class))
					.collect(Collectors.toList());

			courseList.forEach(course -> {
				StudentCourseRef studentCourseRef = new StudentCourseRef();
				studentCourseRef.setCourseId(course.getCourseId());
				studentCourseRef.setStudentId(studentUploadDto.getId());
				studentCourseRefs.add(studentCourseRef);
			});

			coursesSet.addAll(courseList);
		});

		studentMapper.batchInsert(students);
		studentCourseRefMapper.batchInsert(studentCourseRefs);
		courseMapper.batchInsert(new ArrayList<>(coursesSet));
	}

	@Override
	public List<MaxCourseCountDto> queryMaxCourseCount() {
		List<MaxCourseCount> list=courseMapper.queryMaxCourseCount();
		return CommonUtil.listCopy(list, MaxCourseCountDto.class);
	}

}
