package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Weight1 {
    public static void main(String[] args) {

    }
    //1 1 2 4 4 5 6 6
    public static void singleNumber(int[] nums) {
        ArrayList list = new ArrayList();
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(list.contains(i)){
                list.remove(i);
            }
        }

    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if(((n >> i) & 1) == 1){
                count++;
            }
        }
        return count;
    }

}
