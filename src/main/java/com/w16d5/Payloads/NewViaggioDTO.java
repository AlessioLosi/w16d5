package com.w16d5.Payloads;

import com.w16d5.Entities.StatoViaggio;

import java.time.LocalDate;

public record NewViaggioDTO(
        String destinazione,
        LocalDate dataInizio,
        LocalDate dataFine,
        StatoViaggio statoViaggio) {
}
