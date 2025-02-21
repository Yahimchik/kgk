package org.example.kgkservice.validation.impl;

import org.example.kgkservice.validation.UnpValidator;
import org.springframework.stereotype.Component;

@Component
public class DefaultUnpValidator implements UnpValidator {
    @Override
    public boolean isValid(String unp) {
        return unp != null && unp.matches("\\d{9}");
    }
}
