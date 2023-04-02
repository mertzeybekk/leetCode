package ReverseInteger;

public class Solution {
    public int reverse(int number){
        int nums=0;
       while (number!=0){
           int digit=number%10;
          int  numss=nums*10+digit;
           if ((numss - digit) / 10 != nums) {
               return 0;
           }
           nums=numss;
           number/=10;
        }

        return  nums;
    }
    public static void main(String[] args) {
        int a=125;
        int k=a%10;
        int c=a/10;
        Solution solution=new Solution();
       int num= solution.reverse(a);
        System.out.println(num);
    }
}
