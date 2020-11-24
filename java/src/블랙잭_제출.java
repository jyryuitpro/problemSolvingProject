import java.util.Scanner;

public class 블랙잭_제출 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //카드의 개수
        int n = stdIn.nextInt();
        int[] data = new int[n];

        //기준 합
        int m = stdIn.nextInt();

        //카드 숫자
        for (int i = 0; i < data.length; i++) {
            data[i] = stdIn.nextInt();
        }

        //카드 합
        int cardSum = 0;

        //출력 결과
        int result = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    cardSum = data[i] + data[j] + data[k];
                    if (cardSum <= m) {
                        result = Math.max(cardSum, result);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
