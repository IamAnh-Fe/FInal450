package LinkedList;

public class LinkedList_Basic {
  public static class Node {
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }   
  }
  
  // Insert a Node at the Front
  public static Node addToHead(Node head, int value){
    if(head == null){
      return null;
    }
    Node newHead = new Node(value);
    newHead.next = head;
    head  = newHead;
    return newHead;
  }
  
  //  Insert a node after a given node
  public static Node insertAfter(Node prev, int value){
    if(prev == null){
      System.out.println("The given previous node cannot be null");
    }
    Node newNode  = new Node(value);
    newNode.next = prev.next;
    prev.next = newNode;
    return prev;

  }
  // Insert a node at the end
  public static Node addtoTail(Node head, int value){
    Node newNode = new Node(value);
    if(head == null){
      return newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
      temp = temp.next;
      }
      temp.next  = newNode;

    }
    return head;
  }
  // Delete a Node at the head
  public static Node removeAtHead(Node head){
    while (head != null) {
      return head.next;
    }   
    return head; 
  }

  
  // Delete a Node at the end
  public static Node removeAtEnd(Node head){
    if(head == null){
      return null;
    }
    Node last = head;
    Node prev = null;
    while (last.next != null) {
      prev = last;
      last = last.next;
    }

    if(prev == null){
      return null;
    } else {
      prev.next  = last.next;
    }
    return head;

  }

  public static Node removeAtIndex(Node head, int index){
    if(head == null || index < 0){
      return null;
    }
    if(index == 0){
      return removeAtHead(head);
    }
   Node temp = head;
   for (int i = 0; temp != null && i < index - 1;
             i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return null;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
        temp.next
        = next;
 
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
    Node n3 = new Node(3);
    n1.next = n2;
    n2.next = n3;
    Node n0 = addToHead(n1, 0);
    addtoTail(n0, 4);
    insertAfter(n2, 6);
    // n0 = removeAtHead(n0);
    n0 = removeAtEnd(n0);
     removeAtIndex(n0, 3);
    printLinkedList(n0);

  }
}
