
class Node {
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

public class reverse {
    private static Node print(Node head){
        Node temp = head;
        while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
        }
        return head;
    }

    
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

   private static Node reverseList(Node head){
    if(head == null || head.next == null){
        return head;
    }
     
    Node newHead = reverseList(head.next);
     
    Node front = head.next;
    front.next = head;
    head.next = null;

     return newHead;
   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = ArrayToLL(arr);
         print(head);
        System.out.println("------------------");
        head =  reverseList(head);
        print(head);
        }
    }

