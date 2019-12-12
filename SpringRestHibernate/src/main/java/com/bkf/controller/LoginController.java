package com.bkf.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bkf.model.LoginDto;
import com.bkf.model.UserDto;

@RestController
public class LoginController {

	@RequestMapping(value = "login", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public UserDto login(@RequestBody LoginDto loginDto)
	{
		
		return null;
	}
	
}
