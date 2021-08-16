package cn.toseektech.consumer.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import cn.toseektech.translation.annotation.DictionaryFeild;


public class EmpolyeeVo {
	
	private Long id;
    
	private String name;
    
	private String idendity;

	private Byte gender;

	private Boolean isQuite;

	private Integer positionType;

	private String educationDegree;
	
	@DictionaryFeild(sourceFeild = "gender",dictJson = "{'1':'男','0':'女'}")
	private String genderDict;
	
	@DictionaryFeild(sourceFeild = "isQuite",dictCode = "project.t_empolyee.is_quite")
	private String isQuiteDict;
	
	@DictionaryFeild(sourceFeild = "positionType",dictCode = "project.t_empolyee.position_type")
	private String positionTypeDict;
	
	@DictionaryFeild(sourceFeild = "educationDegree",dictCode = "project.t_empolyee.education_degree")
	private String educationDegreeDict;

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

	public String getIdendity() {
		return idendity;
	}

	public void setIdendity(String idendity) {
		this.idendity = idendity;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Boolean getIsQuite() {
		return isQuite;
	}

	public void setIsQuite(Boolean isQuite) {
		this.isQuite = isQuite;
	}

	public Integer getPositionType() {
		return positionType;
	}

	public void setPositionType(Integer positionType) {
		this.positionType = positionType;
	}

	public String getEducationDegree() {
		return educationDegree;
	}

	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}

	public String getGenderDict() {
		return genderDict;
	}

	public void setGenderDict(String genderDict) {
		this.genderDict = genderDict;
	}

	public String getIsQuiteDict() {
		return isQuiteDict;
	}

	public void setIsQuiteDict(String isQuiteDict) {
		this.isQuiteDict = isQuiteDict;
	}

	public String getPositionTypeDict() {
		return positionTypeDict;
	}

	public void setPositionTypeDict(String positionTypeDict) {
		this.positionTypeDict = positionTypeDict;
	}

	public String getEducationDegreeDict() {
		return educationDegreeDict;
	}

	public void setEducationDegreeDict(String educationDegreeDict) {
		this.educationDegreeDict = educationDegreeDict;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}	
}
