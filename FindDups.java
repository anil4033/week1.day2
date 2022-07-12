package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,18,58,18,129,-19,45,0,45,37,140,3};
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len-1 ; i++) {
			
			if(nums[i]==nums[i+1]) {
				System.out.println("duplicates found"+ nums[i]);
			}
			
						
		}
	}

}

