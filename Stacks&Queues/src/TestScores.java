import java.util.*;

public class TestScores {
    public static void main(String[] args) {
        Queue<Integer> z = new LinkedList<Integer>();
        z.add(1);
        z.add(2);
        z.add(3);
        System.out.println(stutter(z));

        int[] testscores = {100, 57, 100, 78, 100, 93, 100};
        printTestScores(testscores);
    }

    public static Queue<Integer> stutter(Queue<Integer> x) {
        Queue<Integer> y = new LinkedList<Integer>();
        while(!x.isEmpty()){
            int z = x.remove();
            y.add(z);
            y.add(z);
        }
        return y;
    }

    public static void printTestScores(int[] testscores) {
        Queue<Integer> a = new LinkedList<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        for (int x : testscores) {
            if(x < 100){
                a.add(x);
            }
            
        }
        

        while(!a.isEmpty()){
            b.push(a.remove());
        }

        while(!b.isEmpty()){
            System.out.print(b.pop() + " ");
        }
    }
}
