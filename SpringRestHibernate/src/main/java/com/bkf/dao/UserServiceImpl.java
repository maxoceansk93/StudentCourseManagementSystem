package com.bkf.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bkf.common.CommonUtility;
import com.bkf.common.Constants;
import com.bkf.common.ErrorCode;
import com.bkf.common.ModelMappingUtility;
import com.bkf.exceptions.UserException;
import com.bkf.model.LoginDto;
import com.bkf.model.UserDto;
import com.bkf.persistence.User;
import com.bkf.persistence.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ModelMappingUtility mapper;
	
	@Override
	public void createUser(UserDto userDto) {
		User user = (User) mapper.convertToEntity(new User(), userDto);
		user.setHashedPassword(CommonUtility.encodePassword(userDto.getPassword()));
		userRepo.save(user);		
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = userRepo.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		users.forEach(x -> userDtos.add( (UserDto) mapper.convertToDto(x, new UserDto())));
		return userDtos;
	}

	@Override
	public UserDto getUser(Integer id) {
		User user = userRepo.getOne(id);
		return (UserDto) mapper.convertToDto(user, new UserDto());
	}

	@Override
	public void updateUser(Integer id, UserDto userDto) {
		User user = userRepo.getOne(id);
		
		user.setAddress(userDto.getAddress());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setPrimaryContactNumber(userDto.getPrimaryContactNumber());
		user.setRole(userDto.getRole());
		
		userRepo.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}

	@Override
	public UserDto login(LoginDto loginDto) throws UserException {
		
		User user = userRepo.findByUserName(loginDto.getUserName());
		if(user == null)
		{
			throw new UserException();
		}
		String dtoPassword = loginDto.getPassword();
		String encodedDtoPassword = CommonUtility.encodePassword(dtoPassword);
		
		String storedHashedPassword = user.getHashedPassword();
		
		if(!storedHashedPassword.equals(encodedDtoPassword))
		{
			throw new UserException(ErrorCode.INVALID_PASSWORD, Constants.INVALID_PASSWORD_MSG);
		}
		
		return (UserDto) mapper.convertToDto(user, new UserDto());
	}

	
	
}
