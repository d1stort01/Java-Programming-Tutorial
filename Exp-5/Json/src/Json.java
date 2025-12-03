import java.io.*;
import java.util.*;

public class Json {
    private static class Student {
        String stuid;
        String name;
        String courseName;
        int score;

        public Student(String stuid, String name, String courseName, int score) {
            this.stuid = stuid;
            this.name = name;
            this.courseName = courseName;
            this.score = score;
        }

        String toJsonString() {
            return "  {\n" +
                    "    \"stuid\": \"" + stuid + "\",\n" +
                    "    \"name\": \"" + name + "\",\n" +
                    "    \"courseName\": \"" + courseName + "\",\n" +
                    "    \"score\": " + score + "\n" +
                    "  }";
        }
    }

    public static void main() {
        List<Student> students = new ArrayList<Student>();
        try (BufferedReader br = new BufferedReader(new FileReader("javascore.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                students.add(new Student(str[0], str[1], str[2], Integer.parseInt(str[3])));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("javascore.json"))) {
            bw.write("[");
            bw.newLine();
            for (Student stu : students) {
                bw.write(stu.toJsonString());
                if(stu!=students.getLast()) {
                    bw.write(",");
                }
                bw.newLine();
            }
            bw.write("]");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
