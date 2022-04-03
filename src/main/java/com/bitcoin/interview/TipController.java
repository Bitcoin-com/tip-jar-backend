package com.bitcoin.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class TipController {

    @Autowired
    TipRepository tipRepository;

    @PostMapping("/save/{userId}")
    public TipJar savePayment(@PathVariable(value = "userId") Long userId,
            @DefaultValue(value = "100.0") double totalAmount,
            @DefaultValue(value = "1") Integer noOfPerson,
            @DefaultValue(value = "10.0") double tipPercentage) {
        TipJar tipJar = new TipJar(userId, totalAmount, noOfPerson, tipPercentage);
        return tipRepository.save(tipJar);
    }

    @PostMapping("/save2/{userId}")
    public TipJar save2(@PathVariable(value = "userId") Long userId,
                         @RequestBody TipJar tipJar) throws Exception {
        if (tipJar == null || tipJar.getTotalAmount() == null || tipJar.getNoOfPerson() == null || tipJar.getTipPercentage() == null) {
            throw new Exception("Request body is not properly set.");
        }
        return tipRepository.save(new TipJar(userId, tipJar.getTotalAmount(), tipJar.getNoOfPerson(), tipJar.getTipPercentage()));
    }

    @GetMapping("/getTip/{userId}/all")
    public List<TipJar> getAllTipHistoryForUser(@PathVariable(value = "userId") Long userId) {
        return tipRepository.findByUserId(userId);
    }

    @GetMapping("/getTip/{userId}/latest")
    public TipJar getLatestTipHistoryForUser(@PathVariable(value = "userId") Long userId) {
        return tipRepository.findFirstByUserIdEqualsOrderBySavedOnDesc(userId);
    }
}
