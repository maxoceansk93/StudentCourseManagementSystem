package com.bkf.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bkf.exceptions.UserException;
import com.bkf.model.LoginDto;
import com.bkf.model.UserDto;

@Service
public interface UserService {
	
	public void createUser(UserDto userDto);
	
	public List<UserDto> getAllUsers();
	
	public UserDto getUser(Integer id);
	
	public void updateUser(Integer id, UserDto userDto);
	
	public void deleteUser(Integer id);
	
	public UserDto login(LoginDto loginDto) throws UserException;
	
	
}
