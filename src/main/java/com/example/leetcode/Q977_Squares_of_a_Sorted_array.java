package com.example.leetcode;

public class Q977_Squares_of_a_Sorted_array {
    //Given an integer array nums sorted in non-decreasing order, return an array
//of the squares of each number sorted in non-decreasing order.
//
//
// Example 1:
//
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
//
//
// Example 2:
//
//
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁴
// -10⁴ <= nums[i] <= 10⁴
// nums is sorted in non-decreasing order.
//
//
//
//Follow up: Squaring each element and sorting the new array is very trivial,
//could you find an
//O(n) solution using a different approach?
//
// Related Topics Array Two Pointers Sorting 👍 9124 👎 231


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
//return Arrays.stream(nums).map(x->x*x).sorted().toArray();
            int len = nums.length;
            int l = 0;
            int r= len-1;
            int[] output = new int[len];

            for(int i=r;i>=0;i--)
            {
                if(Math.abs(nums[l])>Math.abs(nums[r])){
                    output[i]=nums[l]*nums[l];
                    l++;
                }
                else{
                    output[i]=nums[r]*nums[r];
                    r--;
                }
            }
            return output;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
