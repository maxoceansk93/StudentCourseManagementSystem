package com.bkf.common;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelMappingUtility {

	@Autowired
    private ModelMapper modelMapper;
 
/*	
	private UserDto convertToUserDto(User obj) {
	    UserDto objDto = modelMapper.map(obj, UserDto.class);
	    return objDto;
	}
	
	
	private User convertToUserEntity(UserDto postDto) throws ParseException {
	    User user = modelMapper.map(postDto, User.class);
	    return user;
	}
*/	
	
	public Object convertToDto(Object entity, Object dto)
	{
		if(entity != null)
		{
			return modelMapper.map(entity, dto.getClass());
		}
		return null;
	}
	
	public Object convertToEntity(Object entity, Object dto)
	{
		if(dto!=null)
		{
			return modelMapper.map(dto, entity.getClass());
		}
		return null;
	}
	
	
}
