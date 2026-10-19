class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indx1= m-1;
        int indx2 = n-1;
        int indx3 = m+n-1;

        while(indx2>=0){
            if(indx1 >= 0 && nums1[indx1] >= nums2[indx2]){
                nums1[indx3--] = nums1[indx1--];
            } else{
                nums1[indx3--] = nums2[indx2--];
            }
        }
        
    }
}