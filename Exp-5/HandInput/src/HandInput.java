import java.io.*;

public class HandInput {
    public static void main(String[] args) {
        String path = "d:/mytext.txt";
        File f = new File(path);
        if (f.exists()) {
            System.out.println("文件已存在，请重新指定保存的文件！");
            return;
        }
        try {
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(path));
            String input = null;
            while (!(input = bufReader.readLine()).equals("end#")) {
                bufWriter.write(input);
                bufWriter.newLine();
            }
            bufWriter.close();
            bufReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
