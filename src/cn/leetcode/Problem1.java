package cn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Problem1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (data.containsKey(target - nums[i])) {
                return new int[]{data.get(target - nums[i]), i};
            } else {
                data.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Problem1 twoSum = new Problem1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}