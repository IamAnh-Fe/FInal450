package LinkedList;

public class Count_nodes_in_Circular_linkedlist {
  static int count = 0;
  public static class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }

  public static int Solution1(Node head){
    if(head == null){
      return count;
    }
    Node temp = head;
    while (temp != null && temp.next != null) {
      count++;
      temp = temp.next;
      if(temp == head){
        return count;
      }
    }
    return count;
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
    System.out.println(Solution1(n1));
  }
}
