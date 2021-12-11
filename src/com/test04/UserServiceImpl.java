package com.test04;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//TODO : 002. <bean id="userServiceImpl" class="com.test04.UserServiceImpl">을 annotation 으로
@Component
public class UserServiceImpl implements UserService {
	
	@Resource(name="myUser02")
	//TODO : 003. <bean id="myUser01" class="com.test04.UserDto">를 annotation으로
	private UserDto dto;

	@Override
	public void addUser() {
		System.out.println("추가된 멤버 : " + dto.getUsername());
	}

}
