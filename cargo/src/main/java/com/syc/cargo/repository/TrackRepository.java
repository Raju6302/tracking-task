package com.syc.cargo.repository;

import com.syc.cargo.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, String> {
    List<Track> findAllByTrackingNumber(String trackingNumber);
}
