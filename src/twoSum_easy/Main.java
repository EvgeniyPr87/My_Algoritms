package twoSum_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Тестовые данные
        int[] nums={2,7,11,15};
        int target=9;
        int[]result=TwoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }

    //FIXME Brute Force O(N2)

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    //FIXME Hash Map O(N) Самое отличное решение через справочник

    public static int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int neededNumber = target - currentNumber;

            if (map.containsKey(neededNumber)) {
                return new int[]{map.get(neededNumber), i};
            }
            map.put(currentNumber, i);
        }
        return new int[]{};
    }



}
