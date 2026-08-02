class Solution {
    public int longestConsecutive(int[] nums) {
    Set <Integer> dp = new HashSet<>();
    for(int num : nums){
        dp.add(num);
    }
int res =0;
    for(int num : nums ){
        
        if(!dp.contains(num-1)){
            int len =1;

            while(dp.contains(num+len)){
                
              len++;
            }
            res  = Math.max(res,len);
        }
       
    }

    return res;
    
    }
}