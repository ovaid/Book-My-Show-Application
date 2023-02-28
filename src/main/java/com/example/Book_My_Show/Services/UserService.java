package com.example.Book_My_Show.Services;

import com.example.Book_My_Show.Entities.UserEntity;
import com.example.Book_My_Show.EntryDtos.UserEntryDto;
import com.example.Book_My_Show.Repository.UserRepository;
import com.example.Book_My_Show.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}