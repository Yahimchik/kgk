package org.example.kgkservice.client.impl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.kgkservice.client.PayerClient;
import org.example.kgkservice.dto.PrepareResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Slf4j
@Component
@RequiredArgsConstructor
public class PayerClientImpl implements PayerClient {

    private final RestTemplate restTemplate;
    @Value("${external.payer-service.url}")
    private String URL;

    @Override
    public PrepareResponseDto getPayerInfo(String unp) {
        String url = collectURL(unp);
        log.info("Отправляем запрос к API: {}", url);
        return restTemplate.getForObject(url, PrepareResponseDto.class);
    }

    private String collectURL(String unp) {
        return UriComponentsBuilder
                .fromUriString(URL)
                .queryParam("unp", unp)
                .toUriString();
    }
}
