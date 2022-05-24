import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class App110 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, x, number, max;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the number of list: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number[" + (i + 1) + "]: ");
            x = sc.nextInt();
            list.add(x);
        }
        Iterator<Integer> itr = list.iterator();
        max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            number = itr.next();
            if (number > max)
                max = number;
        }
        System.out.println("Max number: " + max);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println("Number need to remove: ");
        number = sc.nextInt();
        list2.add(number);
        list.removeAll(list2);
        System.out.println("List after remove: " + list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("List after sort: " + list);
    }
}
