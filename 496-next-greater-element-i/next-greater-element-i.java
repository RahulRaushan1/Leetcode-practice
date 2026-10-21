class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack <Integer> stack = new Stack<>();

        for(int ele : nums2){
            while( !stack.isEmpty() && ele > stack.peek()){
                map.put(stack.pop(),ele);
            }
            stack.push(ele);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }

        int [] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}