public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0};

    Solution obj = new Solution();

    System.out.print(obj.singleNumber(arr));

    }
    
}

class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for(int i =1; i<nums.length; i++){
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }
}