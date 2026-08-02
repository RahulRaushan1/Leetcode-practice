class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        char [] arr= s.toCharArray();
        char [] nums= t.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(! map.containsKey(arr[i])){
               if(map.containsValue(nums[i])){
                return false;
               }
               else{
                map.put(arr[i],nums[i]);
               }
            }
            else{
                if(map.get(arr[i]) == nums[i]);
                else return false;
            }
            
        }
        return true;

    }
}