package dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class NumsDto implements Serializable {

	 private static final long serialVersionUID = 1L;

    @JsonProperty("nums")
    private int[] nums;

    public NumsDto(int[] nums) {
        this.nums = nums;
    }

    // Getter
    public int[] getNums() {
        return this.nums;
    }

    // Setter
    public void setNums(int[] nums) {
        this.nums = nums;
    }

    // Constructors, getters, setters, etc. can be added as needed
}
