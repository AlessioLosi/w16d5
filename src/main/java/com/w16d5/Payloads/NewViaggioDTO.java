package com.w16d5.Payloads;

import com.w16d5.Entities.StatoViaggio;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;

public record NewViaggioDTO(@NotEmpty(message = "La destinazione è obbligatoria!")
                            String destinazione,
                            LocalDate data,
                            StatoViaggio statoViaggio) {
}
