public class CustomLinkedList{
    Node head;

    void printData(){
        Node current = head;
        while(current != null){
            if(current.next != null){
            System.out.print(current.data + "==>");
            }else{
            System.out.print(current.data);
            }
            current = current.next;
        }
        System.out.println();
    }

    void deleteHalfBack(){
        if(head == null || head.next == null){
            head = null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;
        
        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
    }
}