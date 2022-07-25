package LinkedList.SinglyLinkedList;

public class B_CreateSinglyLinkedList {
    //  created head refrence for ListNode class to store value of First element of List
    private ListNode head;

    private static class ListNode {

        private int data;    // data is use to store taking value from user or statically
        private ListNode next;  // ListNode next use to traverse a list

//    created constructor and pass int data to it (means user value or static value) and manipulate it later in program
//    we don't want ListNode next in constructor because we don't pass any value from other class or from user or statically
//    ListNode next just use to manipulations in traverse
//    ListNode next == null because, List always ends with Null

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }


    public static void main(String[] args) {
        B_CreateSinglyLinkedList sll = new B_CreateSinglyLinkedList();

//      created List Nodes
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

//        now connect nodes together to form chain

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println(sll.head + " --> " + sll.head.next + " --> " + second.next + " --> " + third.next);
    }
}
