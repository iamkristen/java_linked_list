public class LinkedListAlgorithm {
   

    public static void main(String[] args) {
    CustomLinkedList list = new CustomLinkedList();
    Node firstNode = new Node(3);
    Node seconNode = new Node(5);
    Node thirdNode = new Node(8);
    Node fourthNode = new Node(9);

    list.head = firstNode;
    firstNode.next = seconNode;
    seconNode.next = thirdNode;
    thirdNode.next = fourthNode;

    list.printData();
    list.deleteHalfBack();
    list.printData();
    
    
    }
}
