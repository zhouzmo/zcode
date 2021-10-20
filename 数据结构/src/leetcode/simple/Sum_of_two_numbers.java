package leetcode.simple;


import java.util.HashMap;
import java.util.Map;

/*
给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出
和为目标值 target 的那两个整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。
但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。


示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]

 */
public class Sum_of_two_numbers {
    public static void main(String[] args) {
        int[] nums= new int[]{2,9,11,15};
        int[] ints = twoSum(nums, 17);



    }


    public static int[] twoSum(int[] nums, int target) {
        //暴力，双重for循环

        //map方法解
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }



}
