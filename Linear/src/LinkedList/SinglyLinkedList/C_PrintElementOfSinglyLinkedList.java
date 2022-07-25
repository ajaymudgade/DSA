package LinkedList.SinglyLinkedList;

public class C_PrintElementOfSinglyLinkedList {
    
    private ListNode head;

    private static class ListNode {

        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        C_PrintElementOfSinglyLinkedList sll = new C_PrintElementOfSinglyLinkedList();

//      created List Nodes
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

//        now connect nodes together to form chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

    }
}
