package com.w16d5.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Prenotazione {
    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    Dipendente dipendente;
    @ManyToOne
    @JoinColumn(name = "viaggio_id")
    Viaggio viaggio;
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;
    private String note;
    private LocalDate datarichiesta;

    public Prenotazione(String note, LocalDate datarichiesta, Dipendente dipendente, Viaggio viaggio) {
        this.note = note;
        this.datarichiesta = datarichiesta;
        this.dipendente = dipendente;
        this.viaggio = viaggio;
    }
}
