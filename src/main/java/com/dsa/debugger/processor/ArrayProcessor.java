package com.dsa.debugger.processor;

import dto.NumsDto;

public class ArrayProcessor {

	public int maxProduct(int[] nums) {
        
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
