class Node{
    int data;
    Node next;
    Node(int x ,Node next1){
         this.data =x;
         this.next = next1;

    }
    Node(int x){
        this.data = x;
    }


}


public class LL2 {

     private static  Node ArraytoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
              mover.next = temp;
              mover = temp;
        }
        return head;
    }
    // private static Node delNode(Node head){
    //     if(head ==null){
    //         return head;
    //     }
    //    head = head.next;
        
        
    //     return head;
    // }
    private static Node delTail(Node head)
    {
      
        if (head == null || head.next == null)
        return null;
    // Create a temporary pointer for traversal
    Node temp = head;
    // Traverse the list until the second-to-last node
    while (temp.next.next != null) {
        temp = temp.next;
    }
    // Nullify the connection from the second-to-last node to delete the last node
    temp.next = null;
    // Return the updated head of the linked list
    return head;
        
    }
   
    public static void main(String[] args) {
        int arr[] = { 23,34,45,56,78};
        // Node head = new Node(arr[0],null);
        Node head = ArraytoLL(arr);

        Node temp = head;
       
        head = delTail(head);
        while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
           
        }
    // head= delNode(head);
      
      

    }
}
