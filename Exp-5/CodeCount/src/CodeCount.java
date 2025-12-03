import java.io.*;

public class CodeCount {
    private static int fileCount = 0;
    private static long lineCount = 0;

    public static void main(String[] args) {
        File root = new File("d:/project/src");
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("目录不存在");
            return;
        }
        count(root);
        System.out.println("源文件数：" + fileCount);
        System.out.println("代码总行数：" + lineCount);
    }

    private static void count(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) {
                count(f);
            } else if (f.getName().endsWith(".java")) {
                fileCount++;
                lineCount += countLines(f);
            }
        }
    }

    private static long countLines(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            long lines = 0;
            while (br.readLine() != null) lines++;
            return lines;
        } catch (IOException e) {
            System.err.println("读取失败");
            return 0;
        }
    }
}