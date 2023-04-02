package DivideTwoIntegers;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) { // sayılar en küçük değerlerse aşım oluşur
            return Integer.MAX_VALUE;
        }
        if (dividend < 0 && divisor < 0) { // ikisi de negatif ise 1 döndür
            return divide(-dividend, -divisor);
        }
        if (dividend < 0 || divisor < 0) { // sadece birisi negatif ise -1 döndür
            return -divide(Math.abs(dividend), Math.abs(divisor));
        }
        int remainder = 0;
        int total = 0;
        int count = divisor;
        if (divisor < 0) {
            divisor = Math.abs(divisor);
        }
        while (dividend >= divisor) { // şart değiştirildi
            remainder = dividend - divisor;
            dividend = remainder;
            total++;
        }
        if (count < 0) {
            total *= -1;
        }
        return total;
    }
    public static void main(String[] args) {
Solution solution=new Solution();

int total=solution.divide(-1,1);
        System.out.println(total);
    }
}
