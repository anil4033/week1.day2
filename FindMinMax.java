package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int[] nums = {3,33,58,18,129,-19,82,0,45,37,140};
		Arrays.sort (nums);
		int length = nums.length;
		
		System.out.println("The Min value is"+ nums[0]);
		System.out.println("The Max value is"+ nums[length-1]);
		
		}

	}


