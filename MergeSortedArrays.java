public class MergeSortedArrays {
    
    public static void main(String[] args){

        int arr1[] = {1,2,3,0,0,0};
        int m = 3;
        int arr2[] = {2,5,6};
        int n =3;

        MergeSortedArraySolution obj = new MergeSortedArraySolution();

        obj.merge(arr1,m,arr2,n);

        for(int i=0; i<arr1.length; i++)
            System.out.print(arr1[i]+" ");
    }
}

class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr1 = nums1.length-n-1;
        int curr2 = n-1;
        int end = nums1.length-1;

        while( curr1 >=0 && curr2 >=0){

            if(nums1[curr1] > nums2[curr2]){
                nums1[end] = nums1[curr1];
                curr1--;
            }
            else if(nums1[curr1] <= nums2[curr2]){
                nums1[end] = nums2[curr2];
                curr2--;
            }
            end--;
        }

        if(curr1 < 0){
            while(curr2 >= 0 && end >= 0){
                nums1[end] = nums2[curr2];
                end--;
                curr2--;
            }
        }
        
    }
}
