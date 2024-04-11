


class Node{
    int data;
    Node next;


    Node(int x,Node next1){
    this.data = x;
    this.next = next1;
    }

    Node(int x){
        this.data = x;
    }

}




public class Insertion {

    private static Node ArrayToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length-1;i++){
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
        }
            return head;
    }

  private  static Node InsertST (int val, Node head){
    Node temp = new Node(val,head);
    temp.next =head;
    return temp;
    // return new Node(val, head);
  }
  
// insertion at end :
private static Node InsertED(int val, Node head){
    Node insrt = new Node(val); 
    Node temp = head;
  while(temp.next!= null) {
       temp = temp.next;
      
  }
  temp.next = insrt;
  return head;
}

// insert at position :
  private static Node InsertPOS(int val , Node head){


    return head;
  }


   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    Node head = ArrayToLL(arr);
    // head = new Node(0, head);
    Node tem =InsertST(0,head);
    
    Node ins =InsertED(100,head);

    while(ins!= null){
      System.out.println(ins.data);
         ins = ins.next;
        
     }

     System.out.println("---------------******---------------");

    while(tem!= null){
        System.out.println(tem.data);
           tem = tem.next;
          
       }
    Node temp = head;

    System.out.println("---------------******---------------");

   while(temp!= null){
    System.out.println(temp.data);
       temp = temp.next;
      
   }
   System.out.println("---------------******---------------");
   }
}
