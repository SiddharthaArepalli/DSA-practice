
import java.util.*;

public class StackIm {
    static class Stack {
       ArrayList<Integer> ls = new ArrayList<>();

        public  boolean isEmpty() {
            return ls.size() == 0;
        }

        public  void push(int data) {
            ls.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = ls.get(ls.size() - 1);
            ls.remove(ls.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return ls.get(ls.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
