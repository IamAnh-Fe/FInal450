package LinkedList;

public class Occurence_of_an_integer_in_a_LinkedList {
  static  int count = 0;

  public static class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  // Brute Force
  public static int Solution1(Node head, int k){
    if(head == null){
      return 0;
    }
    Node temp = head;
    int count = 0;
    while (temp != null) {
      if(temp.data == k){
        ++count;
      }
      temp = temp.next;
    }
    return count;
  }
// Recursion
  public static int Solution2(Node head, int k){
    if(head == null){
      return count;
    }
    if(head.data == k){
      count++;
    }
    return Solution2(head.next, k);
  }
  
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(1);
    Node n4 = new Node(2);
    Node n5 = new Node(1);
    Node n6 = new Node(3);
    Node n7 = new Node(1);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    // System.out.println(Solution1(n1, 1));
    System.out.println(Solution2(n1, 1));
  }
}
