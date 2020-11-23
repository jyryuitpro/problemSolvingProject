import java.util.Scanner;

public class 음계_제출 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[] data = new int[8];

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < data.length; i++) {
            data[i] = stdIn.nextInt();
        }

//        1 2 3 4 5 6 7 8
        for (int j = 1; j < data.length; j++) {
            if (data[j - 1] < data[j]) {
                descending = false;
            } else {
                ascending = false;
            }
        }

        if (ascending == true && descending == false) {
            System.out.println("ascending");
        } else if (descending == true && ascending == false) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
