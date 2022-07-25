package LinkedList.SinglyLinkedList;

public class D_FindLenghtSSL {

    private ListNode head;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode (int data)
        {
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
        System.out.println("null");
    }

    public int lenght(){
//        First check weather head is null or not
        if (head == null){
            return 0;
        }

//        Now initialize count for counting iteration
        int count = 0;
        ListNode current = head;
        while(current != null)
        {
            count++;
            current = current.next;
        }

        return count;

    }

    public static void main(String[] args) {

        D_FindLenghtSSL sll = new D_FindLenghtSSL();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

//        Now connect them to form a chain

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Elements are : ");
        sll.display();

        System.out.println("Lenght is " +sll.lenght());


    }
}
