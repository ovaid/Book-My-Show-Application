package com.example.Book_My_Show.Services;

import com.example.Book_My_Show.Entities.UserEntity;
import com.example.Book_My_Show.EntryDtos.UserEntryDto;
import com.example.Book_My_Show.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto){

        //instead of creating object and setting its values we will use @Builder annotation in the entity class of this Dto.

        UserEntity userEntity = UserEntity.builder()
                                   .age(userEntryDto.getAge())
                                   .name(userEntryDto.getName())
                                   .email(userEntryDto.getEmail())
                                   .mobNo(userEntryDto.getMobNo())
                                   .address(userEntryDto.getAddress()).build();

        userRepository.save(userEntity);
    }
}
