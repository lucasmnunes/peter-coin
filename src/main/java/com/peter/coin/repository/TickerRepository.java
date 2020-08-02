package com.peter.coin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peter.coin.model.Ticker;

@Repository
public interface TickerRepository extends JpaRepository<Ticker, Long> {
}
