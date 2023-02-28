package com.example.Book_My_Show.convertors;

import com.example.Book_My_Show.Entities.UserEntity;
import com.example.Book_My_Show.EntryDtos.UserEntryDto;

public class UserConvertor {

    //Static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                .build();

        return userEntity;

    }

}
