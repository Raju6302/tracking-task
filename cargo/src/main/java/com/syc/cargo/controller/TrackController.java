package com.syc.cargo.controller;

import com.syc.cargo.model.Track;
import com.syc.cargo.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class TrackController {

    @Autowired
    private TrackRepository trackRepository;

    @GetMapping("/track/{trackingNumber}")
    public List<Track> getTrackByTrackingNumber(@PathVariable String trackingNumber) {
        return trackRepository.findAllByTrackingNumber(trackingNumber);
    }
}
