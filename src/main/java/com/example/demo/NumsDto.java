package com.example.demo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NumsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("nums")
    private int[] nums;

    @JsonCreator
    public NumsDto(@JsonProperty("nums") int[] nums) {
        this.nums = nums;
    }

	public int[] getNums() {
		// TODO Auto-generated method stub
		return this.nums;
	}
}

