class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, null);
        l1.next = new ListNode(4, null);
        l1.next.next = new ListNode(3, null);
        // System.out.println(l1.val);

        ListNode l2 = new ListNode(5, null);
        l2.next = new ListNode(6, null);
        l2.next.next = new ListNode(4, null);
        // System.out.println(l2.val);


        ListNode l3 =  addTwoNumbers(l1,l2);

        System.out.println(l3.val);
        System.out.println(l3.next.val);
        System.out.println(l3.next.next.val);
        System.out.println(l3.next.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode l3 = head; 

        System.out.println("l3 : "+l3.val);


        int carry = 0;
        while((l1 != null) || (l2 != null)){
            int l1Val = (l1 == null) ? 0:l1.val;
            int l2Val = (l2 == null) ? 0:l2.val;

            int currSum = l1Val+l2Val+carry;
            carry = currSum/10;
            int lastDigit = currSum%10;

            System.out.println("sum : "+lastDigit);
            


            ListNode node =  new ListNode(lastDigit);
            l3.next = node;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            l3 = l3.next;
        }

        if (carry > 0) {
            ListNode node =  new  ListNode(carry);
            l3.next = node;
            l3 = l3.next;
        }

        return head.next;
    }
}