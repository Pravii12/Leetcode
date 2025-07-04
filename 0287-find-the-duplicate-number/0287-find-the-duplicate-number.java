class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(freq.get(num)>=2){
                return num;
            }
        }
        return -1;
        
    }

}