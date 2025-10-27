import java.util.Arrays;

public class WordStats {

    public static int countStartWithH(String[] arr) {
        int cnt = 0;
        for (String w : arr) {
            if (w != null && w.toLowerCase().startsWith("h")) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int countContainOr(String[] arr) {
        int cnt = 0;
        for (String w : arr) {
            if (w != null && w.toLowerCase().contains("or")) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int countLength3(String[] arr) {
        int cnt = 0;
        for (String w : arr) {
            if (w != null && w.length() == 3) {
                cnt++;
            }
        }
        return cnt;
    }

    public static String[] sortIgnoreCase(String[] arr) {
        String[] tmp = arr.clone();
        Arrays.sort(tmp, String::compareToIgnoreCase);
        return tmp;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "welcome", "hi", "hey", "Hour", "door", "or", "air", "Hi"};

        System.out.println("原始数组: " + Arrays.toString(words));
        System.out.println("以 h 开头的单词数: " + countStartWithH(words));
        System.out.println("包含 \"or\" 的单词数: " + countContainOr(words));
        System.out.println("长度为 3 的单词数: " + countLength3(words));

        String[] sorted = sortIgnoreCase(words);
        System.out.println("排序后数组: " + Arrays.toString(sorted));
    }
}