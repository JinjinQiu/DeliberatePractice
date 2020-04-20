package easy;

import java.util.HashMap;

public class RotateArray {
    public static void main(String[] args) {

        int[] a = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] b = rotateArray(a, 3);
        for (int ab : b) {
            System.out.println(ab);
        }
        int[] aa = new int[]{};
        System.out.println(containsDuplicate1(aa));


    }

    public static int[] rotateArray(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            int current = nums[0];
            int next;
            for (int j = 0; j < nums.length - 1; j++) {
                next = nums[j + 1];
                nums[j + 1] = current;
                current = next;
            }
            nums[0] = current;
        }
        return nums;
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int now = nums[i];
            for (int j = i + 1; j <= nums.length; j++) {
                if (now == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return true;
            }else {
                map.putIfAbsent(nums[i],i);
            }
        }
        return false;
    }
}
