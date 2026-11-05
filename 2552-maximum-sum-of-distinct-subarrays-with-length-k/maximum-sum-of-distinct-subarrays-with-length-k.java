class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0;
        long sum=0;
        int i=0;
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            sum+=nums[j];
            set.add(nums[j]);
            if(j-i+1==k){
                max=Math.max(max,sum);
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }
        return max;
    }
}