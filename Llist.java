// Program to implement LinkedList

class Llist {
 
  Node head;

  class Node{
      String data;
      Node next;

      // Constructor
      Node(String data){
          this.data = data;
          this.next = null;
      }
  }

  // Method to create addFirst elements.
  public void addFirst(String data){
      Node newNode = new Node(data);
      
      newNode.next = head;
      head = newNode;
  }

  // Method to create addLast elements.
  public void addLast(String data){
      Node newNode = new Node(data);

      if(head == null){
          head = newNode;
          return;
      }

      Node currNode = head;
      while (currNode.next != null){
          currNode = currNode.next;
      }
      currNode.next = newNode;
  }

  // method to print.
  public void printList(){
      Node currNode = head;

      while (currNode != null){
          System.out.print(currNode.data + " -> ");
          currNode = currNode.next;
      }
      System.out.println("null");
  }

  public static void main(String args[]) {
    Llist list = new Llist();
    list.addFirst("Surya");
    list.addFirst("Here");
    list.printList();
  }

}      
