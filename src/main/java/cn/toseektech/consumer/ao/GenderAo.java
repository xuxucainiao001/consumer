package cn.toseektech.consumer.ao;

import cn.toseektech.translation.annotation.DictionaryFeild;
import cn.toseektech.translation.enums.TransType;


public class GenderAo{
	
	private String genderDict;
	
	@DictionaryFeild(sourceFeild = "genderDict",dictCode = "project.t_empolyee.gender",transType = TransType.VALUE_TO_KEY)
	private Byte gender;

	public String getGenderDict() {
		return genderDict;
	}

	public void setGenderDict(String genderDict) {
		this.genderDict = genderDict;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}
	
	

}
