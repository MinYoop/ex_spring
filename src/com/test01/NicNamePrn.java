package com.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class NicNamePrn {
	

	private NicName nicName;
	
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
