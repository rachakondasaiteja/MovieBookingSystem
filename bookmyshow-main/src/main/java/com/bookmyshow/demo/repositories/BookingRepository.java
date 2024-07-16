package com.bookmyshow.demo.repositories;

import com.bookmyshow.demo.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
