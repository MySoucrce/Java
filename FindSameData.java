package Test;

import java.util.Arrays;

public class FindSameData {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,4,8};
        intersection(n1, n2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] temp =  new int[min];
        int i = 0;
        int j = 0;
        int k = 0;
        int count  = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                temp[k] = nums1[i];
                k++;
                count++;
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }
}
