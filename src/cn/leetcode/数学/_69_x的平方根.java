package cn.leetcode.数学;

import java.lang.Math;

/**  
* @desc : https://leetcode-cn.com/problems/sqrtx/
* @author : cm  
* @createTime : 2020-7-2 16:40:20  
* @version : v1.0    
*/
public class _69_x的平方根 {

    public int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }

    public static void main(String[] args) {
        _69_x的平方根 p = new _69_x的平方根();
        System.out.println(p.mySqrt(8));
    }

}