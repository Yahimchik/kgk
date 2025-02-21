package org.example.kgkservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payer {
    private String unp;
    private String fullName;
    private String shortName;
    private String dateOfRegistration;
    private String mnsCode;
    private String mnsName;
    private String payerStatusCode;
    private String dateOfStatusChanged;
    private String payerAddress;
}
