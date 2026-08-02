class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        if(s.length()!= t.length()) return false;

        for(Character ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Character ch: t.toCharArray()){
            if(! map.containsKey(ch)) return false;
            else {
            int freq= map.get(ch);
               freq--;

              if(freq==0){
              map.remove(ch);
              }
              else{
              map.put(ch,freq);
              }
                
            }
            
    
        }
        if(map.isEmpty()) return true;
        return false;

        
    }
}