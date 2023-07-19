package cn.leetcode.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc : https://leetcode-cn.com/problems/two-sum/
 * @author : cm
 * @createTime : 2020-7-2 16:25:24
 * @version : v1.0
 */
public class _1_两数之和 {

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
        _1_两数之和 twoSum = new _1_两数之和();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}