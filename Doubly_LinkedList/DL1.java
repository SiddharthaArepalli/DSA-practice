
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




public class DL1 {
     
    // printing the linked list
    private static Node print(Node head){
        Node temp = head;
        while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
        }
        return head;
    }

    // Array to linked Doubly linked list

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
    
    //

    // deletion of an element

    private static Node DeleteHead(Node head){
    if(head == null || head.next == null ){
    return head;
    
}
    Node ulta = head;
      head = head.next;
      head.prev=null;
      ulta.next=null;
      return head;
    }

    // deleting tail 
    // private static Node DeleteTail(Node head){
    //     if(head == null || head.next == null){
    //         return null;
    //     }
        
    //     Node tail = head;
    //     while(tail.next.next != null){ // Change condition here
    //         tail = tail.next;
    //     }
        
    //     Node back = tail;
    //     tail = tail.next;
    //     back.next = null; // Severing the link between back and tail
    //     tail.prev = null;
        
    //     return head;
    // }
    private static Node DeleteK(Node head, int k) {
        if (head == null || k <= 0) // Check for invalid inputs
            return head;
    
        Node temp = head;
        int count = 1; // Start from 1 because we are deleting the kth node
    
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
    
        if (temp == null || temp.next == null) // If k is greater than the number of nodes
            return head;
    
        Node back = temp.prev;
        Node front = temp.next;
    
        if (back == null) { // If temp is the head node
            front.prev = null;
            return front;
        } else {
            back.next = front;
            if (front != null) // If temp is not the last node
                front.prev = back;
        }
    
        temp.prev = null;
        temp.next = null;
        return head;
    }
    

    

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
        Node head = ArrayToDll(arr);
        // head = DeleteHead(head);
        // head = DeleteTail(head);
        head = DeleteK(head, 3);
        print(head);
        
    }


}
