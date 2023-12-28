import java.io.*;
import java.util.*;
import java.util.stream.*;

class EquilibriumPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        
        if(arr.length == 1)
        return 1;
        
        if(arr.length == 0)
        return -1;
        
        int start = 0;
        int end = arr.length-1;
        long leftSum = arr[start];
        long rightSum = arr[end];
        
        int equilibriumPoint = -1;
        
        while(start <= end)
        {
            if(start == end && leftSum == rightSum)
            {
            equilibriumPoint = start+1;
            break;
            }
            
            if(start == end && leftSum != rightSum)
            {
            equilibriumPoint = -1;
            break;
            }
            
            if(leftSum > rightSum)
            {
                end--;
                rightSum = rightSum + arr[end];
            }
            
            if(rightSum > leftSum)
            {
                start++;
                leftSum = leftSum + arr[start];
            }
            
            if(rightSum == leftSum && start != end)
            {
               start++;
               end--;
               leftSum = leftSum + arr[start];
               rightSum = rightSum + arr[end];
               
            }
            
        }
        return equilibriumPoint;
        
    }
}
