package LinkedList.SinglyLinkedList;

public class F_InsertAtLast {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtLast(int value){
        ListNode lastNode = new ListNode(value);

        if (head == null){
            head = lastNode;
            return;
        }

        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = lastNode;

    }
    
    public static void main(String[] args) {
        F_InsertAtLast sll = new F_InsertAtLast();

        sll.insertAtLast(1);
        sll.insertAtLast(2);
        sll.insertAtLast(3);
        sll.insertAtLast(4);

        sll.display();
    }
}
