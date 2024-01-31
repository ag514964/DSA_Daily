
public class SortColors {
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0,2};

    Solution obj = new Solution();

    obj.sortColors(arr);

    for(int i=0; i<arr.length; i++)
    System.out.print(arr[i]+" ");

    }
}

class Solution {
    public void sortColors(int[] nums) {
        int current = 0;
        int start = 0;
        int end = nums.length-1;

        while(current <= end){
            if(nums[current] == 0)
            {
                int temp = nums[current];
                nums[current] = nums[start];  
                nums[start] = temp;
                start++;
                current++;
            }
            else if(nums[current] == 2)
            {
                int temp = nums[current];  
                nums[current] = nums[end];
                nums[end] = temp;
                end--;
            }  
            else if(nums[current] == 1)
            {
               current++;
            }  
        }
        
    }
}
