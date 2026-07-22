class Solution {
    public int pivotIndex(int[] nums) {
        int[]ps=new int [nums.length];
        ps[0]=nums[0];
       
        for(int i=1;i<nums.length;i++){
            ps[i]=ps[i-1]+nums[i];

        }
         int ss[]=new int [nums.length];
        ss[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            ss[i]=ss[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(ss[i]==ps[i]){
                return i;
            }
        }
        return -1;
    }
}
