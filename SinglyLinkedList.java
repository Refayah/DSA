class SinglyLinked{
    //class - Node
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    //head
    private Node head = null;
    //insertAtBeg()
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //insertAtEnd();
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        newNode.next = null;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //display
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //deleteAtBeg()
    public void deleteAtBeg(){
        head = head.next;
    }
    //deleteAtEnd()
    public void deleteAtEnd(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
    }
    //insertAtMid()
    public void insertAtMid(int p,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int c = 1;
        while(c<p-1){
            temp = temp.next;
            c+=1;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
	
	public void deleteAtMid(int p){
		Node temp = head;
		int c = 1;
		while(temp!=null && c<p-1){
			temp = temp.next;
			c++;
		}
		temp.next = temp.next.next;
	}
}
public class SinglyLinkedList{
    public static void main(String[] args){
        SinglyLinked s = new SinglyLinked();
        s.insertAtBeg(8);
        s.insertAtBeg(7);
        s.insertAtBeg(6);
        s.insertAtBeg(5);
        s.insertAtBeg(4);
        s.display();
        s.insertAtEnd(9);
        s.display();
        s.insertAtMid(4,11);
        s.display();
        //s.deleteAtBeg();
        //s.display();
        //s.deleteAtEnd();
        //s.display();
        s.deleteAtMid(3);
		s.display();
    }
}
