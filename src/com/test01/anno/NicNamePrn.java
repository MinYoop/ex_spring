package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NicNamePrn {
	
	@Autowired
	private NicName nicName; //NicName 타입을 찾아서 넣어줌 대신 한개여서 오류가안뜸
	
	public NicNamePrn() {
		
	}
	
	public NicName getNicName() {
		return nicName;
	}
	
	public void setNicName(NicName nicName) {
		this.nicName = nicName;
	}
	
	@Override
	public String toString() {
		return "NicNamePrn [nicName=" + nicName + "]";
	}

}
