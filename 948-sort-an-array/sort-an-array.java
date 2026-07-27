class Solution {
    public int[] sortArray(int[] nums) {
        int left=0;
        int right= nums.length-1;
        mergeSort(nums , left , right);
        return nums;
    }
    public void mergeSort(int [] nums,int left,int right){
        if(left==right) return;
        int mid = left + (right-left)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public void merge(int [] nums,int left,int mid, int right){
        int i=left; int j = mid+1; int k=0;
        int [] temp = new int [right-left+1];
        while(i<=mid && j<=right){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }
            else{
                temp[k++]= nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=right){
            temp[k++] = nums[j++];
        }
        for(int x = 0;x<temp.length;x++){
            nums[left+x] = temp[x];
        }
    }
}