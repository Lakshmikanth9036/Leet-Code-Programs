package com.leetcode.array;

import java.util.HashMap;

public class TwoSum {
	  public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> numberIndex = new HashMap<>();
	        int[] result = new int[2];
	        for (int i = 0; i < nums.length; i++) {
	        	int diff = target - nums[i];
				if(numberIndex.containsKey(diff)) {
					result[1] = i;
					result[0] = numberIndex.get(diff);
					return result;
				}
				numberIndex.put(nums[i], i);
			}
	        return result;
	    }
	  
	  public static void main(String[] args) {
		int[] value = twoSum(new int[] {8,-2,3,3,1,4,2}, 6);
		System.out.println(value[0]+" , "+ value[1]);
	}
}
