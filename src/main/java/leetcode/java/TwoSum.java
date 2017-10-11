package leetcode.java;

import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0, len = nums.length; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == target - nums[i])
                    return new int[] { i, j };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}