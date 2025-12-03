import java.io.*;

public class RecordScore {
    public static void main() {
        String filePath = "score.txt";
        int sum = 0;
        int n = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            String input = null;
            while (!(input = br.readLine()).equals("end#")) {
                bw.write(input);
                bw.newLine();
                String[] stu = input.split(" ");
                if (stu.length > 2) {
                    System.out.println("格式错误");
                    return;
                }
                sum += Integer.parseInt(stu[1]);
                n++;
            }
            int avg = sum / n;
            bw.write("平均成绩：" + avg);
            br.close();
            bw.close();
        } catch (NumberFormatException e) {
            System.out.println("格式错误");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
