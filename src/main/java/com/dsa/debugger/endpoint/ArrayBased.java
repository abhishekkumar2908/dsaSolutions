package com.dsa.debugger.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.NumsDto;

@RestController
public interface ArrayBased {

    @GetMapping("/calculateMaxProduct")
    public int maxProduct(NumsDto numsDto);
}
