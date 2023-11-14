package LinkedList;

public class Check_If_Circular_LinkedList {
  
  public static class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static boolean Solution1(Node head){
    if(head == null){
      return true;
    }
    Node temp = head;
    while (temp != null && temp.next != null) {
      temp = temp.next;
      if(temp == head){
        return true;
      }
    }
    return false;

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

  public static boolean Solution2(Node head){
    if(head == null){
      return true;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
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
    n6.next = n1;
    // System.out.println(Solution1(n1));
    System.out.println(Solution2(n1));
  }
}
