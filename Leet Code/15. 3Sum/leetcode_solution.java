class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int a=-1*nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]==a){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[left]);
                    l.add(nums[right]);
                    l.add(nums[i]);
                    list.add(l);
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]>a){
                    right--;
                }else{
                    left++;
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> x: list){
            set.add(x);
        }
        return new ArrayList<>(set);
    }
}