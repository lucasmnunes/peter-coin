package com.peter.coin.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

import com.peter.coin.model.Ticker;

@Service
public class TickerService {

    private final RestTemplate restTemplate;

    private final String uri;

    public TickerService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
        this.uri = "https://api.bitcointrade.com.br/v3/public/BRLBTC/ticker";
    }

    private Ticker getCurrentTicker() {
        return this.restTemplate.getForObject(this.uri, Ticker.class);
    }

    public Ticker getTicker() {
        return this.getCurrentTicker();
    }

    public BigDecimal getCurrentBitcoinValue() {
        return this.getCurrentTicker().getLast();
    }

}

