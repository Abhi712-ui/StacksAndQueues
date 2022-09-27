import java.util.*;
public class Duplicator {
    public static void main(String[] args) {
        Stack<Integer> u = new Stack<Integer>();
        u.push(10);
        u.push(20);
        u.push(30);
        System.out.println(twoCopies(u));
    }

    public static Stack<Integer> reversal(Stack<Integer> x){
        Stack<Integer> y = new Stack<>();
        while(!x.isEmpty()){
            y.push(x.peek());
            x.pop();
        }
        return y;
    }

    public static Stack<Integer> twoCopies(Stack<Integer> x) {
        Stack<Integer> z = new Stack<Integer>();
        while (!x.isEmpty()) {
            Integer y = x.peek();
            z.push(y);
            z.push(y);
            x.pop();
        }
        Stack<Integer> zed = reversal(z);
        return zed;
    }
}
