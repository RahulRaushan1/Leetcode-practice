class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()> nums.length/3){
                list.add( entry.getKey());
            }
        }
        return list;
    }
}