package com.barber.api.repository;

import com.barber.api.model.Booking;
import com.barber.api.model.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByBarberIdAndBookingTimeBetween(Long barberId, LocalDateTime start, LocalDateTime end);
    List<Booking> findByStatus(BookingStatus status);
}
