package com.example.Book_My_Show.convertors;

import com.example.Book_My_Show.Entities.MovieEntity;
import com.example.Book_My_Show.EntryDtos.MovieEntryDto;

public class MovieConvertors {


    public static MovieEntity convertEntryDtoToEntity(MovieEntryDto movieEntryDto) {


        MovieEntity movieEntity = MovieEntity.builder()
                .movieName(movieEntryDto.getMovieName())
                .genre(movieEntryDto.getGenre())
                .language(movieEntryDto.getLanguage())
                .duration(movieEntryDto.getDuration())
                .ratings(movieEntryDto.getRatings())
                .build();

        return movieEntity;
    }


}
