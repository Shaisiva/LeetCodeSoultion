class Solution {
    public int maxSubArray(int[] nums) {

        int sum=0;
        int max=nums[0];

        if(nums.length>1){

        for(int i=0;i<=nums.length-1;i++){
                sum=sum+nums[i];

                if(max<sum){
                    max=sum;
                }

                if(sum<0){
                    sum=0;
                }
            }
        }
        else{
            max=nums[0];
        }
        return max;        
    }
}
