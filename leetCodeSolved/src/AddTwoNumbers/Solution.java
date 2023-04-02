package AddTwoNumbers;
import java.util.*;

public class Solution {
    public static void main(String[]args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode sonuc = addTwoNode(l1, l2);

        while (sonuc != null) {
            System.out.print(sonuc.val + " ");
            sonuc = sonuc.next;
        }

}
public static ListNode addTwoNode(ListNode l1 ,ListNode l2){
    ListNode sonuc = new ListNode(0);
    ListNode current = sonuc;
    int carry = 0;

    while (l1 != null || l2 != null) {
        int x = l1 != null ? l1.val : 0;
        int y = l2 != null ? l2.val : 0;
        int toplam = carry + x + y;
        carry = toplam / 10;
        current.next = new ListNode(toplam % 10);
        current = current.next;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }

    if (carry > 0) {
        current.next = new ListNode(carry);
    }

    return sonuc.next;

}
}

