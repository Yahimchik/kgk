package org.example.kgkservice.client.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.kgkservice.client.PayerClient;
import org.example.kgkservice.dto.PrepareResponseDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

@Slf4j
@Component
@Primary
@RequiredArgsConstructor
public class PayerClientDecorator implements PayerClient {

    private final PayerClient payerClient;

    @Override
    public PrepareResponseDto getPayerInfo(String unp) {
        try {
            return payerClient.getPayerInfo(unp);
        } catch (HttpClientErrorException.BadRequest e) {
            log.warn("Некорректный УНП: {}", unp);
            throw new IllegalArgumentException("Такого УНП нет.");
        } catch (Exception e) {
            log.error("Ошибка при запросе данных о плательщике", e);
            throw new RuntimeException("Ошибка при запросе данных. Попробуйте позже.");
        }
    }
}
