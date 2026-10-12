class Solution {
    public int trap(int[] height) {
        int s=0,e=height.length-1;
        int leftH=-1,rightH=-1;
        int totalWater=0;
        while(s<e){
            if(height[s]<=height[e]){
                if(leftH>height[s]){
                    totalWater+=leftH-height[s];
                }
                else{
                    leftH=height[s];
                }
                s++;
            }
            else{
                if(rightH>height[e]){
                    totalWater+=rightH-height[e];
                }
                else{
                    rightH=height[e];
                }
                e--;
            }
        }
        return totalWater;
    }
}