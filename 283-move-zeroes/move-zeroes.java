class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int lp=0;
        int rp=0;
        while(rp!=n){
            if(arr[rp]!=0){
                int temp=arr[lp];
                arr[lp]=arr[rp];
                arr[rp]=temp;
                lp+=1;
            }
            rp+=1;
        }
    }
}