package com.w16d5.Payloads;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;

public record NewPrenotazioneDTO(
        String note,
        @NotEmpty(message = "La data di riciesta è obbligatoria")
        LocalDate data_di_richiesta) {
}
