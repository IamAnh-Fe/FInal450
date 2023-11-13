package LinkedList;

public class Reverse_LinkedList {
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
        }
    }
    // Iterative
   public static Node  Iterative(Node head){
     if(head == null) {
      return null;
     }
     Node prev = null;
     Node curr = head;
     Node next = null;
     while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
     }
     return prev;
  
   }
      // Recursive
    public static Node Recursive(Node head){
      if (head == null ){
        return head;
      }
      Node newHead = Recursive(head.next);
      head.next.next = head;
      head.next = null;
      return newHead;
      }
    
 
    /* Function to print linked list */
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
   n1.next = n2;
   n2.next = n3;
   n3.next = n4;
  // Node n0 = Iterative(n1);
  Node n0 = Recursive(n1);
   printLinkedList(n0);


  }
}
