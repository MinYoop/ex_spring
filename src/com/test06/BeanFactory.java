package com.test06;

import com.test07.LjTv;
import com.test07.SamsongTv;

public class BeanFactory {
	
	Object getBean(String name) { // bean이 내부적으로 이렇게 구현됨
		if(name.equals("samsong")) {
			return new SamsongTv();//  id="samsong" class="com.test06.samsongTv" 구조
		}else if(name.equals("lg")) {
			return new LjTv();
		}
		return null;
	}

}
