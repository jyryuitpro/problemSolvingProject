import java.util.ArrayList;
import java.util.Scanner;

public class 스택수열_제출 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // n = 8
        int n = stdIn.nextInt();

        ArrayList<Integer> stack = new ArrayList<>();
//        int[] stack = new int[n];

        int count = 1;
        ArrayList<Character> result = new ArrayList<>();
//        char[] result = new char[];

        // 0 1 2 3 4 5 6 7 : array
        // 1 2 3 4 5 6 7 8 : count / stack
        // 4 3 6 8 7 5 2 1 : input
        for (int i = 0; i < n; i++) {
            int data = stdIn.nextInt();
            while (count <= data) {
                stack.add(count);
                count++;
                result.add('+');
            }

            if (stack.get(stack.size() - 1) == data) {
                stack.remove(stack.size() - 1);
                result.add('-');
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }

        for (char v : result) {
            System.out.println(v);
        }
    }
}
