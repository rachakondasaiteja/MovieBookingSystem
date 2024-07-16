package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    /*
      ShowSeat Show
         1      1
         M      1
         showseat table
         1 | A1 | BOOKED
         1 | A2 | BOOKED
     */
    @ManyToOne
    private Show show;
    /*
       ShowSeat Seat
         1       1
         M       1

       showseat table
         1 | A1 | BOOKED
         1 | A2 | BOOKED
         2 | A1 | BOOKED
     */
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;

    private Date lockedAt;
}
