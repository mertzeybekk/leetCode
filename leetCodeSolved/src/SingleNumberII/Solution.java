package SingleNumberII;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>integerHashMap=new HashMap<>();
        int keyy=0;
        Arrays.sort(nums);
        for (int num : nums) {
            integerHashMap.put(num, integerHashMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(integerHashMap);
        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {
            int key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
            if(value==1){
                keyy=key;
            }
        }
        return keyy;
    }
    public static void main(String[] args) {
     Solution solution=new Solution();
     int [] nums={30000,500,100,30000,100,30000,100};
        System.out.println(     solution.singleNumber(nums));

    }
}
