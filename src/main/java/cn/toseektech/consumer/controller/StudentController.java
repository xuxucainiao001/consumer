package cn.toseektech.consumer.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.EasyExcelFactory;

import cn.toseektech.common.configuration.annotations.GlobalExceptionHandler;
import cn.toseektech.common.model.ResponseVO;
import cn.toseektech.common.utils.CommonUtil;
import cn.toseektech.consumer.ao.EmpolyeeAo;
import cn.toseektech.consumer.ao.GenderAo;
import cn.toseektech.consumer.dto.EmpolyeeDto;
import cn.toseektech.consumer.dto.MaxCourseCountDto;
import cn.toseektech.consumer.dto.StudentUploadDto;
import cn.toseektech.consumer.dto.StudentUploadExcelDto;
import cn.toseektech.consumer.service.EmpolyeeService;
import cn.toseektech.consumer.service.StudentInfoAndCourseService;
import cn.toseektech.consumer.vo.EmpolyeeVo;
import cn.toseektech.translation.annotation.Translate;
import cn.toseektech.translation.util.TranslationUtil;

@RestController
@GlobalExceptionHandler
@RequestMapping("/student")
public class StudentController {

	@Resource
	private StudentInfoAndCourseService studentInfoAndCourseService;

	@Resource
	private EmpolyeeService empolyeeService;

	/**
	 * 上传excel文件并解析
	 * 
	 * @param multipartFile
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/uploadStudentInfo")
	public Object uploadStudentInfo(@RequestPart("file") MultipartFile multipartFile) throws IOException {
		List<StudentUploadExcelDto> excelList = EasyExcelFactory.read(multipartFile.getInputStream())
				.head(StudentUploadExcelDto.class).sheet().doReadSync();
		// StudentUploadExcelDto 转 StudentUploadDto
		List<StudentUploadDto> list = excelList.stream().map(StudentUploadDto::transferFrom)
				.collect(Collectors.toList());
		// 保存数据
		studentInfoAndCourseService.saveStudentInfoAndCourse(list);
		// 统计选修最多的课程
		List<MaxCourseCountDto> resultList = studentInfoAndCourseService.queryMaxCourseCount();
		return new ResponseVO<>(resultList);
	}   

	@GetMapping("/showEmpolyeeList")
	public List<EmpolyeeVo> showEmpolyeeList() {
		List<EmpolyeeDto> queryAllEmpolyee = empolyeeService.queryAllEmpolyee();
		return TranslationUtil.translate(CommonUtil.listCopy(queryAllEmpolyee, EmpolyeeVo.class));

	}

	@Translate
	@PostMapping("/printEmpolyee")
	public ResponseVO<List<EmpolyeeAo>> printEmpolyee(@RequestBody @Translate List<EmpolyeeAo> list) {
		return new ResponseVO<>(list);
	}
	
	@Translate
	@PostMapping("/printGender")
	public ResponseVO<GenderAo> printGender(@RequestBody @Translate GenderAo ao) {
		return new ResponseVO<>(ao);
	}

}
