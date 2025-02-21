package org.example.kgkservice.client;

import org.example.kgkservice.dto.PrepareResponseDto;

public interface PayerClient {
    PrepareResponseDto getPayerInfo(String unp);
}
