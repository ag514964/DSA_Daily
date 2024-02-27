import java.util.Arrays;

public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0,2};

    Solution obj = new Solution();

    System.out.print(obj.containsDuplicate(arr));

    }
    
}


class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1)
        return false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
        
    }
}