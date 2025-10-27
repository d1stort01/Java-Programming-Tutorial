import java.util.*;

public class DistinctWithSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("The number of distinct numbers is " + set.size());
        System.out.print("The distinct numbers are:");
        for (int n : set) System.out.print(" " + n);
        System.out.println();
    }
}