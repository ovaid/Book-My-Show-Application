package com.example.Book_My_Show.EntryDtos;


import com.example.Book_My_Show.Enums.Genre;
import com.example.Book_My_Show.Enums.Language;
import lombok.Builder;
import lombok.Data;

@Data
public class MovieEntryDto {
    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;
}
