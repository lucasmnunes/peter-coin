package com.peter.coin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peter.coin.model.Ticker;
import com.peter.coin.service.TickerService;

@RestController
@RequestMapping("/api/v1/tickers")
public class TickerController {

    private TickerService service;

    @Autowired
    public TickerController(TickerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Ticker> retrieveTicker() {
        return new ResponseEntity<>(service.getTicker(), HttpStatus.OK);
    }

}