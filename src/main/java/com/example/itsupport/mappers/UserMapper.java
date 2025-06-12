package com.example.itsupport.mappers;


import com.example.itsupport.dto.UserDto;
import com.example.itsupport.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto toUserDto(User user);
    User toUserEntity(UserDto userDto);

}
