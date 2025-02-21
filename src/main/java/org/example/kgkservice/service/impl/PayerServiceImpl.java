package org.example.kgkservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.kgkservice.client.PayerClient;
import org.example.kgkservice.dto.PrepareResponseDto;
import org.example.kgkservice.service.PayerService;
import org.example.kgkservice.validation.UnpValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayerServiceImpl implements PayerService {

    private final PayerClient payerClient;
    private final UnpValidator unpValidator;

    @Override
    public PrepareResponseDto send(String unp) {
        if (!unpValidator.isValid(unp)) {
            throw new IllegalArgumentException("Некорректный УНП. Должно быть 9 цифр.");
        }
        return payerClient.getPayerInfo(unp);
    }
}
