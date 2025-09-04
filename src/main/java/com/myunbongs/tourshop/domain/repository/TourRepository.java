package com.myunbongs.tourshop.domain.repository;

import com.myunbongs.tourshop.domain.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Long> {
}
