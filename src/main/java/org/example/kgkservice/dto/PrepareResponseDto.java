package org.example.kgkservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrepareResponseDto {
    @JsonProperty("row")
    private PayerResponseDto payerResponseDto;
}
