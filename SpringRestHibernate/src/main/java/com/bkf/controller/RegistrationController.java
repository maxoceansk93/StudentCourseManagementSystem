package com.bkf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bkf.dao.UserService;
import com.bkf.model.UserDto;

@RestController
@RequestMapping(value = "/register")
public class RegistrationController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user", produces="application/json", consumes="application/json", method = RequestMethod.POST)
	public void registerUser(@RequestBody UserDto userDto)
	{
		userService.createUser(userDto);
	}
	
	
}
