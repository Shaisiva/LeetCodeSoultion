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
