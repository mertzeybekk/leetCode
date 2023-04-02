package MultiplyStrings;

import java.math.BigInteger;

public class Solution {
    public String multiply(String num1,String num2){
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);
        return result.toString();

    }
    public static void main(String[]args){
        Solution solution=new Solution();
        String total=solution.multiply("2","3");
        System.out.println(total);
    }
}
