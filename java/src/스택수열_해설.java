import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열_해설 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, cnt = 1;
        Stack<Integer> s = new Stack<>();
        ArrayList<Character> result = new ArrayList<>();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            while (cnt <= x) {
                s.push(cnt);
                cnt++;
                result.add('+');
            }
            if (s.peek() == x) {
                s.pop();
                result.add('-');
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
