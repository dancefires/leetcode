package cn.leetcode.数组;

/**
 * @desc : https://leetcode.cn/problems/missing-number/
 * @author : cm
 * @createTime : 2023-05-29 10:46:24
 * @version : v1.0
 */
public class _268_丢失的数字 {

    public int missingNumber(int[] nums) {
        //解法一 排序 复杂度：O(nlogn)
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != i) return i;
        // }
        // return nums.length;

        //解法二 哈希表 复杂度：O(n)
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++) set.add(nums[i]);
        // for(int i = 0; i <= nums.length; i++)
        //     if(!set.contains(i)) return i;
        // return -1;

        //解法三 位运算 复杂度：O(n)
        // int res = nums.length;
        // for(int i = 0; i < nums.length; i++){
        //     res ^= nums[i] ^ i;
        // }
        // return res;

        //解法四 数学(高斯公式) 复杂度：O(n)
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }

}