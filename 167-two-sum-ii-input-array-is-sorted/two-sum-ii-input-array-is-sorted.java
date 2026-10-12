class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int st=0;
        int lt=numbers.length-1;
        while(st<lt){
            if(numbers[st]+numbers[lt]==target){
                ans[0]=st+1;
                ans[1]=lt+1;
                return ans;
            }
            else if(numbers[st]+numbers[lt]>target) lt--;
            else st++;
        }
        return ans;
    }
}