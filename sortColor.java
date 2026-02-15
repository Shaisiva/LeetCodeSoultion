class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int s=0;
        int e=nums.length-1;

        while (mid<=e) {
            int temp=0;
            if(nums[mid]==2){
                temp=nums[e];
                nums[e]=nums[mid];
                nums[mid]=temp;
                e--;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                temp=nums[s];
                nums[s]=nums[mid];
                nums[mid]=temp;
                s++;
                mid++;
            }
        }

    }
}


//https://leetcode.com/problems/sort-colors/description/

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let l = nums.length-1;
        let s=0;
        let e=l;
        let m=0;
    while(s<=e){
        if(nums[s]==2){
            let temp=nums[s]; 
            nums[s]=nums[e];
            nums[e]=temp;
            e--;
        }else if(nums[s]==1){
            s++;
        }else{
            let temp=nums[s];
            nums[s]=nums[m];
            nums[m]=temp;
            s++;
            m++;
        }
    }
    console.log(nums)
};
