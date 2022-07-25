package LinkedList.SinglyLinkedList;

public class G_InsertAtPosition {

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

    public void insertAtPosition(int position, int value)
    {
        ListNode newNode = new ListNode(value);

        if (position == 1){
            newNode.next = head;
            head = newNode;
        }
        else
        {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1 ){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    public static void main(String[] args) {
        G_InsertAtPosition sll = new G_InsertAtPosition();

        sll.insertAtPosition(1, 1);
        sll.insertAtPosition(2, 2);
        sll.insertAtPosition(3, 35);
        sll.insertAtPosition(4, 4);

        sll.display();
    }
}
