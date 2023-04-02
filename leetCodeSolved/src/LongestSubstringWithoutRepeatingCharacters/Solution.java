package LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findCharacter(String s){
        Map<Character,Integer>characterMap=new HashMap<>();
        int maxLength = 0, start = 0;
        for(int i=0;i<=s.length()-1;i++){
            char sm=(s.charAt(i));
            if (characterMap.containsKey(sm)) {
                start = Math.max(start, characterMap.get(sm) + 1);
            }
            characterMap.put(sm, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return  maxLength;
    }
    public static  void main(String[]args){
        Solution solution=new Solution();
        String ss= "pwwkew";
        int lenght=solution.findCharacter(ss);
        System.out.println(lenght);
    }
}
