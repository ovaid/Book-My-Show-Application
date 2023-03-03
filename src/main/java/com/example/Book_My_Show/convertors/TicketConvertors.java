package com.example.Book_My_Show.convertors;

import com.example.Book_My_Show.Entities.TicketEntity;
import com.example.Book_My_Show.EntryDtos.TicketEntryDto;

public class TicketConvertors {


    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}