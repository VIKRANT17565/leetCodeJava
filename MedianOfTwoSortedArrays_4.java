public class MedianOfTwoSortedArrays_4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[(nums1.length+nums2.length)];
        int i = 0;
        int j = 0;
        int k = 0;
        double median = 0;
        while (i < nums1.length || j < nums2.length) {
            int num1Val = 0;
            int num2Val = 0;
            
            if (i >= nums1.length){
                num1Val = 10000000;
            }else{
                num1Val = nums1[i];
            }
            if (j >= nums2.length){
                num2Val = 10000000;
            }else{
                num2Val = nums2[j];
            }

            if (num1Val < num2Val) {
                nums3[k] = num1Val;
                i++;
                k++;
            }
            else{
                nums3[k] = num2Val;
                j++;
                k++;
            }

        }

        // for (int k1 : nums3) {
        //     System.out.print(k1+" ");
        // }System.out.println();

        if (nums3.length%2 == 0) {
            int  mid = nums3.length/2;
            median = (nums3[mid-1]+nums3[mid])/2.0;
        }
        else{
            int mid = nums3.length/2;
            median = nums3[mid];
        }

        return median;
    }
}
