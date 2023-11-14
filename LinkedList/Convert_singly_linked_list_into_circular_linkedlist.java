package LinkedList;

public class Convert_singly_linked_list_into_circular_linkedlist {
  public static class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node Solution1(Node head){
    if(head == null){
      return null;
    }
    Node temp = head;
    while (temp != null && temp.next != null) {
      temp = temp.next;
    }
    if(temp.next == null){
      temp.next = head;
    }
    return head;
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
    Node n3 = new Node(1);
    Node n4 = new Node(2);
    Node n5 = new Node(1);
    Node n6 = new Node(3);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    Node n0 = Solution1(n1);
    printLinkedList(n0);

    
}  
}
