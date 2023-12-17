package com.cricket.project.controllers;

import com.cricket.project.entities.Cricket;
import com.cricket.project.services.CricketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cricket")
@CrossOrigin("*")
public class CricketController {

    private CricketService cricketService;

    public CricketController(CricketService cricketService) {
        this.cricketService = cricketService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Cricket>> getLiveMatches() {
        return new ResponseEntity<>(this.cricketService.getLiveMatches(), HttpStatus.OK);
    }
    @GetMapping("/matches")
    public ResponseEntity<List<Cricket>> getAllMatches(){
        return new ResponseEntity<>(this.cricketService.getAllMatches(),HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.cricketService.getPointTable(),HttpStatus.OK);

    }
}
