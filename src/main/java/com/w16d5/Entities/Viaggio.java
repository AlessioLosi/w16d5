package com.w16d5.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "viaggio")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Viaggio {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;
    private String destinazione;
    private LocalDate data;
    private StatoViaggio statoViaggio;

    public Viaggio(String destinazione, LocalDate data, StatoViaggio statoViaggio) {
        this.destinazione = destinazione;
        this.data = data;
        this.statoViaggio = statoViaggio;
    }
}
