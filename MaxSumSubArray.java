public class MaxSumSubArray {

    public static void main(String[] args){

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        Solution obj = new Solution();

        System.out.println(obj.maxSubArray(arr));


    }

    
    
}

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        int current = 0;

        while(current < nums.length)
        { 
            sum = sum + nums[current];
            if(maxSum < sum){
                    maxSum = sum;
                }

            if(sum < 0){
                
                sum = 0;
            }
            current++;
        }

        return maxSum;
        
    }
}
