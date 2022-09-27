import java.util.*;
public class StringStack {
    public static void main(String[] args) {
        System.out.println(StackStringReversal("Hello"));
    }

    public static String StackStringReversal(String i) {
        Stack<Character> s = new Stack<Character>();
        for (char c: i.toCharArray() ) {
            s.push(c);
        }
        String x = "";
        while(!s.isEmpty()){
            x += s.pop();
        }

        return x;
    }
}
