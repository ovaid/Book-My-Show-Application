package com.example.Book_My_Show.convertors;

import com.example.Book_My_Show.Entities.TheaterEntity;
import com.example.Book_My_Show.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}