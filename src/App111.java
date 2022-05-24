import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) throws Exception {
        int n;
        System.out.print("Nhập n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        LinkedList<Integer> LinkedInteger = new LinkedList<>();
        int tmp;
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            tmp = sc.nextInt();
            LinkedInteger.add(tmp);
        }

        int sum = 0, count = 0;
        for(int number : LinkedInteger) {
            if(number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        System.out.println("Trung bình cộng các số chẵn là: " + sum * 1.0 / count);
    }
}