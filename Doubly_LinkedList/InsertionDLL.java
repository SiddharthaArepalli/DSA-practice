
class Node {
    int data;
    Node next;
    Node prev;
   
    // Constructor with three parameters
    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
    // Constructor with one parameter
    Node(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}


public class InsertionDLL {


    private static Node print(Node head){
        Node temp = head;
        while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
        }
        return head;
    }
     

    private static Node ArrayToDll(int arr[]){
        Node head = new Node(arr[0]);
        Node back = head;
        for(int i =1;i<arr.length;i++){
           Node temp = new Node(arr[i],null,back);
           back.next = temp;
           back = temp;
        }
        return head;
    }

    private static Node InsertHead(Node head , int val){
        Node ins = new Node(val, head,null);
        head.prev = ins;
        return ins;
    }
    private static Node InsertTail(Node head , int val){
          // Traverse to the last node (tail)
          Node temp = head;
          while (temp.next != null) {
            temp = temp.next;
          }
        
          // Create new node and link it
          Node newNode = new Node(val, null, temp);
          temp.next = newNode;
        
          return head; 
          

    }
      
    private static Node InsertTailBefore(Node head , int val){
        // Traverse to the last node (tail)
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
      Node back = temp.prev;
        // Create new node and link it
        Node nN = new Node(val, temp, back);
        back.next=nN;
        temp.prev=nN;
        
        return head;  
        
  }


     


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = ArrayToDll(arr);
        head = InsertHead(head,100);
        // head = InsertTail(head , 234);
        head =InsertTailBefore(head , 34);
        head = InsertTail(head , 234);
        print(head);
    }



}
