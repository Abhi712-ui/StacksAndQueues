import java.util.*;
public class postfixer {
    public static void main(String[] args) {
      int z = postfixEvaluate("5 2 4 * + 7 -");
      System.out.println(z);
    }

    public static int postfixEvaluate(String A) {
        Stack<Integer> B = new Stack<Integer>();
        Scanner C = new Scanner(A);
        while (C.hasNext()) {
            if (C.hasNextInt()) {    // an operand (integer)
                B.push(C.nextInt());
            } else {                     // an Operation
                String Operation = C.next();
                int Num1 = B.pop();
                int Num2 = B.pop();
                if (Operation.equals("+")) {
                    B.push(Num1 + Num2);
                } else if (Operation.equals("-")) {
                    B.push(Num1 - Num2);
                } else if (Operation.equals("*")) {
                    B.push(Num1 * Num2);
                } else {
                    B.push(Num1 / Num2);
                }
            }
        }
        return B.pop();
    
    }
}
