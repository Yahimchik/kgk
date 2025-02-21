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
public class PayerResponseDto {
    @JsonProperty("vunp")
    private String unp;
    @JsonProperty("vnaimp")
    private String fullName;
    @JsonProperty("vnaimk")
    private String shortName;
    @JsonProperty("vpadres")
    private String payerAddress;
    @JsonProperty("dreg")
    private String dateOfRegistration;
    @JsonProperty("nmns")
    private String mnsCode;
    @JsonProperty("vmns")
    private String mnsName;
    @JsonProperty("ckodsost")
    private String payerStatusCode;
    @JsonProperty("vkods")
    private String status;
    @JsonProperty(value = "dlikv")
    private String dateOfStatusChanged;

}
