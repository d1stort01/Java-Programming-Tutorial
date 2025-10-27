import java.util.*;

public class MergeArrays {
    public static int[] merge(int[] array1, int[] array2) {
        int[] res = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, res, 0, array1.length);
        System.arraycopy(array2, 0, res, array1.length, array2.length);
        return res;
    }

    public static int[] sortAndUnique(int[] arr) {
        if (arr.length == 0) return arr;
        Arrays.sort(arr);
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[unique++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, unique);
    }

    private static int[] readArray(Scanner sc, String prompt) {
        System.out.println(prompt);
        String[] tokens = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = readArray(sc, "数组1：");
        int[] a2 = readArray(sc, "数组2：");

        int[] merged = merge(a1, a2);
        int[] result = sortAndUnique(merged);

        System.out.println(Arrays.toString(result));
    }
}