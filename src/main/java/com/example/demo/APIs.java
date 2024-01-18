package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIs {

	@GetMapping("/hello")
	public String greet() {
		return "Hello!";
	}
	@PostMapping("/calculateMaxProduct")
	public int calculateMaxProduct(@RequestBody NumsDto numsDto) {
		int[] nums = numsDto.getNums();
		int maxProduct = Integer.MIN_VALUE;
        int currentMax = 1;
        int currentMin = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
		
		
	}
}
