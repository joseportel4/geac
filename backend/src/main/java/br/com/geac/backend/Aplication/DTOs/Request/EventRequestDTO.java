package br.com.geac.backend.Aplication.DTOs.Request;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record EventRequestDTO(
    @NotNull String title,
    @NotNull String description,
    String onlineLink,
    @NotNull LocalDateTime startTime,
    @NotNull LocalDateTime endTime,
    @NotNull Integer workloadHours,
    @NotNull Integer maxCapacity,
    @NotNull Integer categoryId,
    Integer locationId
) {}
