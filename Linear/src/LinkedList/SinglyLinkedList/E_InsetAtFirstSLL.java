package LinkedList.SinglyLinkedList;

public class E_InsetAtFirstSLL {
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

    public void insertAtFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {

        E_InsetAtFirstSLL sll = new E_InsetAtFirstSLL();

        System.out.println("Newly inserted Elements are : ");

        sll.insertAtFirst(1);
        sll.insertAtFirst(2);
        sll.insertAtFirst(3);
        sll.insertAtFirst(4);

        sll.display();

    }

}
