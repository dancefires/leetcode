package cn.leetcode.数学;

import java.util.HashSet;
import java.util.Set;

/**
 * @desc : https://leetcode-cn.com/problems/happy-number/
 * @author : cm
 * @createTime : 2020-7-2 16:43:35
 * @version : v1.0
 */
public class _202_快乐数 {

    private final Set<Integer> result = new HashSet<>();

    public boolean isHappy(int n) {
        int temp = 0;
        while (n != 0) {
            temp = (n % 10) * (n % 10) + temp;
            n /= 10;
        }
        if (temp == 1) {
            return true;
        }
        if (result.contains(temp)) {
            return false;
        } else {
            result.add(temp);
            return isHappy(temp);
        }
    }

    public static void main(String[] args) {
        _202_快乐数 p = new _202_快乐数();
        System.out.println(p.isHappy(29));
    }

}