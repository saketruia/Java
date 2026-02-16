class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=right+1 /2;
        while(left<right){
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
            mid=left + (right-left)/2;
        }
        return nums[left];
    }
}