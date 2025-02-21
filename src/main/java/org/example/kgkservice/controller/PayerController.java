package org.example.kgkservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.kgkservice.dto.PrepareResponseDto;
import org.example.kgkservice.service.PayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PayerController {
    private final PayerService payerService;

    @GetMapping("/search")
    public String search(@RequestParam(name = "unp", required = false) String unp, Model model) {
        if (unp != null && !unp.isEmpty()) {
            try {
                PrepareResponseDto response = payerService.send(unp);
                model.addAttribute("payer", response);
            } catch (IllegalArgumentException e) {
                model.addAttribute("errorMessage", e.getMessage());
            }
        }
        return "search";
    }

}
