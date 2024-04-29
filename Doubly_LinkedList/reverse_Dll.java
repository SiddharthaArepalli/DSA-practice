import java.io.*;
import java.util.*;

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

public class reverse_Dll{
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

    private static Node reverseDll(Node head){
        Stack<Integer> st= new Stack<Integer>();
         Node temp = head;
         while(temp!=null){
             st.push(temp.data);
             temp = temp.next;
         }
         temp = head;
         while(temp!=null){
            temp.data=st.pop();
            temp = temp.next;
        }
        return head;
    }


    private static Node Middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
  return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node head = ArrayToDll(arr);
        // print(head);
        System.out.println("After the inversion");
        // head = reverseDll(head);
        Node slow = Middle(head);
        // print(head);

        
    }
}


 