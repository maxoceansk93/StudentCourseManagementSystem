package com.bkf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bkf.dao.UserService;
import com.bkf.dao.UserServiceImpl;
import com.bkf.model.UserDto;
import com.bkf.persistence.User;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/create", produces="application/json", consumes="application/json", method = RequestMethod.POST)
	public void createUser(@RequestBody UserDto userDto)
	{
		userService.createUser(userDto);
	}
	
	@RequestMapping(value = "/get-all", produces = "application/json", consumes = "application/json", method = RequestMethod.GET)
	public List<UserDto> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "update", produces = "application/json", consumes = "application/json", method = RequestMethod.PUT)
	public void updateUser()
	{
		
	}
	
	@RequestMapping(value = "delete", produces = "application/json", consumes = "application/json", method = RequestMethod.DELETE)
	public void deleteUser()
	{
		
	}
	
	@RequestMapping(value = "get", produces = "application/json", consumes = "application/json", method = RequestMethod.GET)
	public UserDto getUser()
	{
		return null;
	}
	
	

}
