class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0;
        int r=0;
        int max=0;
        
        Set<Character> res = new HashSet<>();
        

        while(r<s.length()){
if(!res.contains(s.charAt(r))){
    res.add(s.charAt(r));
    r++;
    max =Math.max(max,r-l);
}else{
    res.remove(s.charAt(l));
                l++;
    
}
        }
        return max;
    }
}
