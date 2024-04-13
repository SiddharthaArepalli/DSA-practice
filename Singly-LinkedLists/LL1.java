// import Trees.Node;

class Node{
    int data;
    Node next;
    Node(int x, Node next1)
    {
        this.data = x;
        this.next = next1;
    }
    Node(int s){
        this.data =s;
        this.next = null;
    }
    Node(Node next1){
       this.next = null;
    }

   

}
class LL1{
         private static int  llLength(Node head){
            int count =0;
            Node temp = head;
     while(temp!=null){
       
        temp = temp.next;
        count++;
     }
            return count;
         }

         private static int check(Node head, int value){
            Node temp = head;
           
              
            while(temp!=null)
            {
               // System.out.println(temp.data);
               if(temp.data == value)
            {
                return 1;
            }
                temp = temp.next;
            }
            return 0;

        
        
         }
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
public static void main(String[] args) {

    
     int arr[] = {1,2,3,4,5};
     Node head = ArraytoLL(arr);
     
     Node temp = head;
     while(temp!=null){
        // System.out.println(temp.data);
        temp = temp.next;
     }
     System.out.println("Length of Linked List is : "+llLength(head));
    int s = check(head, 4);
    System.out.println(s);
    }
}


