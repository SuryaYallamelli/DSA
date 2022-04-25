// Program to implement LinkedList

class Llist {
 
  Node head;
  private int size;
 
  // constructor of practice class
  Llist(){
      size = 0;
    }

  class Node{
      String data;
      Node next;

      // Constructor of Node class.
      Node(String data){
          this.data = data;
          this.next = null;
          size++;
      }
  }

  // Method to add elements at first.
  public void addFirst(String data){
      Node newNode = new Node(data);
      
      newNode.next = head;
      head = newNode;
  }

  // Method to add elements ar last.
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

  // Method to print Linked list.
  public void printList(){
      Node currNode = head;

      while (currNode != null){
          System.out.print(currNode.data + " -> ");
          currNode = currNode.next;
      }
      System.out.println("null");
  }
 
    // Method to implement remove First element
    public void removeFirst(){
  
      if(head == null){
        System.out.println("There is no data in the list!");
        return;
      }
  
      head = this.head.next;
      size--;
    }
 
    // Method to implement remove last element
    public void removeLast(){
  
      if(head == null){
        System.out.println("There is no data in the list!");
        return;
      }
  
      size--;
  
      if(head.next == null){
        head = null;
        return; 
      }
  
      Node currNode = head;
      Node lastNode = head.next;
  
      while(lastNode.next != null){
        currNode = currNode.next;
        lastNode = lastNode.next;
      }
      currNode.next = null;
    }
 
    // Method to print size of the list
    public int getSize(){
      return size;
    }
  
  // Main Method.
  public static void main(String args[]) {
    Llist list = new Llist();
    list.addFirst("Surya");
    list.addFirst("Here");
    list.printList();
  }

}      
