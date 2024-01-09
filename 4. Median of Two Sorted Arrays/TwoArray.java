public class TwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len%2==1) {
            len = len/2+1;
            int i=0,j=0;
            double mid=0;
            do {
                if (nums1[i]<nums2[j]) {
                    mid=nums1[i];
                    i++;
                } else {    
                    mid=nums2[j];
                    j++;
                }
            } while (i+j!=len);
            return mid;
        } else {
            len = len/2;  
            int i=0,j=0;
            double mid=0;
            while (i+j!=len) {
                if (nums1[i]<nums2[j]) {
                    i++;
                    mid=nums1[i];
                } else {    
                    j++;
                    mid=nums2[j];
                }
            } 
            System.out.println(mid);
            if (nums1[i]<nums2[j]) {
                mid=nums1[i];
            } else {    
                mid=nums2[j];
            }
            System.out.println(mid);
        }
        return 1.1;   
    }
    public static void main(String[] args) {
        TwoArray twoArray = new TwoArray();
        int nums1[] = {1,2}; 
        int nums2[] = {3,4};
        System.out.println(twoArray.findMedianSortedArrays(nums1, nums2));
    }
}
