package com.peter.coin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ticker", schema="peter_coin_schema")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticker_sequence")
    @SequenceGenerator(name = "ticker_sequence", sequenceName = "ticker_seq",
            schema="peter_coin_schema")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private BigDecimal buy;

    @Column(nullable = false)
    private BigDecimal high;

    @Column(nullable = false)
    private BigDecimal last;

    @Column(nullable = false)
    private BigDecimal low;

    @Column(nullable = false)
    private BigDecimal sell;

    @Column(name = "trades_quantity", nullable = false)
    private Integer tradesQuantity;

    @Column(nullable = false)
    private BigDecimal volume;

    @Column(nullable = false)
    private LocalDateTime date;

}