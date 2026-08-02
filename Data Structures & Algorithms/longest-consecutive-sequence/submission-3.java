class Solution {
    public int longestConsecutive(int[] nums) {
    Set <Integer> dp = new HashSet<>();
    for(int num : nums){
        dp.add(num);
    }
int res =0;
    for(int num : nums ){
        int streak =0; int curr=num;
        if(!dp.contains(num-1)){

            while(dp.contains(curr)){
                streak++;
                curr++;
            }
            res  = Math.max(res,streak);
        }
       
    }

    return res;
    
    }
}
