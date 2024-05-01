

import java.util.HashMap;
import java.util.Map;

// Node class represents a
// node in a linked list
class Node {
    // Data stored in the node
    public int data;   
    // Pointer to the next node in the list
    public Node next;  

    // Constructor with both data
    // and next node as parameters
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class problems {
    // Function to detect a
    // loop in a linked list
    public static boolean detectLoop(Node head) {
        // Initialize a pointer 'temp'
        // at the head of the linked list
        Node temp = head;
        
        // Create a map to keep track
        // of encountered nodes
        HashMap<Node, Integer> nodeMap = new HashMap<>();

        // Step 2: Traverse the linked list
        while (temp != null) {
            // If the node is already in
            // the map, there is a loop
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            // Store the current node in the map
            nodeMap.put(temp, 1);
            // Move to the next node
            temp = temp.next;
        }

        // Step 3: If the list is successfully
        // traversed without a loop, return false
        return false;
    }

    private static Node detectCycle(Node head) {
        Node temp = head;
        HashMap<Node, Integer> map = new HashMap<>();
        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        return null;
    }
    private static Node print(Node head){
        Node temp = head;
        while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
        }
        return head;
    }  
    private static int  LoopLength(Node head) {
        Node temp = head;
        int count = 0;
        HashMap<Node, Integer> map = new HashMap<>();
        while(temp!=null){
            if(map.containsKey(temp)){
                int value = map.get(temp);
                return count - value ;
            }
            map.put(temp,count);
            count = count+1;
            temp = temp.next;
        }
        return 0;
    }
   
     

    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        // Create a loop
        sixth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        Node x = detectCycle(head);
        System.out.println(x.data); 

        int loopLength = LoopLength(head);
        System.out.println("length of the loop is "+loopLength);
        // No need to explicitly free memory
        // in Java; the garbage collector handles it
    }
}

