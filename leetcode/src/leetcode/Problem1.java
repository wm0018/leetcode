package leetcode;

/**
 * 1. Two Sum
 * @author Wu
 * 2018年3月23日
 */
public class Problem1 {
	
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int m=0;
	        int n=0;
	        for(int i=0;i<nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    m=i;
	                    n=j;
	                }
	            }
	        }
	        return new int[]{m,n};
	    }
	}
}
