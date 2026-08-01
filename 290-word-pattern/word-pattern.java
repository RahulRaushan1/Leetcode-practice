class Solution {
    public boolean wordPattern(String pattern, String s) {
       String [] words = s.split(" ");
       if( pattern.length() != words.length){
          return false;
       }
       Map<Character,String> map = new HashMap<>();
       Map<String,Character> maps= new HashMap<>();
       for( int i=0;i<words.length;i++){
         
          char ch = pattern.charAt(i);
          String word = words[i];

          if(map.containsKey(ch)){
              if(! map.get(ch).equals(word)){
              return false;
              }
            
          }
          else map.put(ch,word);

          if(maps.containsKey(word)){
              if(! maps.get(word).equals(ch)){
              return false;
              }
            
          }
          else maps.put(word,ch);
       }
       return true;

    }
}