package org.example.kgkservice.service;

import org.example.kgkservice.dto.PrepareResponseDto;

public interface PayerService {

    PrepareResponseDto send(String unp);
}
