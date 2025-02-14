package com.roomtal.roomtal_backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.roomtal.roomtal_backend.entity.Room;
import com.roomtal.roomtal_backend.entity.User;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;

}
