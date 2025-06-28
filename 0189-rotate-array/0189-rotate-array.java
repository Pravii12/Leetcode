class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int []b=new int[n];
        k=k%n;
        for(int i=0;i<k;i++){
            b[i]=nums[(n-k)+i];
        }
        for(int j=0;j<n-k;j++){
            b[k+j]=nums[j];
        }
        for(int a=0;a<b.length;a++){
            nums[a]=b[a];
        }
        
            System.out.println(Arrays.toString(nums));
        
    
    }
}