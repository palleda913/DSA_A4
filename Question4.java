package in.ineuron;

import java.util.Arrays;

public class Question4 {

	 public static int pairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum = 0;

	        for (int i = 0; i < nums.length; i += 2) {
	            sum += nums[i];
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 4, 3, 2};

	        int maxSum = pairSum(nums);
	        System.out.println(maxSum);  // Output: 4
	    }
	}
