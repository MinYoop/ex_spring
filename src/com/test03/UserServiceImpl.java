package com.test03;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser(UserDto dto) {
		System.out.println("addUser 메소드 호출" + dto.getMyDate());
	}
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl 생성자!");
	}

}
