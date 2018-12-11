package Test;

import java.util.Arrays;

public class Numone {
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,3,3,3,3,3};
        System.out.println(singleNumber(num));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
