package LinkedList;
public class Middle_of_the_LinkedList {
  public static class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node solution1(Node head){
    Node temp = head;
    int mid;
    int length = 0;
    while (temp != null) {
      temp = temp.next;
      length++;
    }
    mid = length/2;
   for (int i = 0; i < mid; i++) {
       head = head.next;
   }
    return head;
  }

  public static Node solution2(Node head){
    if(head == null){
      return null;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;

  }
  public static void printLinkedList(Node head){
        if(head == null){
          System.out.println("List is empty");
        } else {
          Node temp = head;
          while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
              System.out.print(" -> ");
            } else {
              System.out.println();
            }
          }
        }
    
      }
  public static void main(String[] args) {
    
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    Node n0 = solution1(n1);
        // Node n0 = solution2(n1);

    printLinkedList(n0);
  }
}
