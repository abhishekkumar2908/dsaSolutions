package com.dsa.debugger.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.dsa.debugger.endpoint.ArrayBased;
import com.dsa.debugger.processor.ArrayProcessor;

import dto.NumsDto;

public class ArrayBasedController implements ArrayBased{

	@Autowired
	ArrayProcessor arrayProcessor;
	
	@Override
	public int maxProduct(NumsDto numsDto) {
		int[] numbers = numsDto.getNums();
		
		return arrayProcessor.maxProduct(numbers);
	}
	

}
