import java.io.*;
import java.util.*;

public class SortStudents {
    private static class Student {
        String name;
        int java;
        int cpp;
        int math;
        int total;

        Student(String name, int java, int cpp, int math) {
            this.name = name;
            this.java = java;
            this.cpp = cpp;
            this.math = math;
            this.total = java + cpp + math;
        }

        @Override
        public String toString() {
            return String.format("name:%s java:%d cpp:%d math:%d", name, java, cpp, math);
        }
    }

    public static void main(String[] args) {
        String filePath = "score.txt";
        List<Student> students = new ArrayList<>();
        System.out.println("请输入：姓名 Java成绩 Cpp成绩 数学成绩");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while (!(input = br.readLine()).equals("end#")) {
                String[] str = input.split(" ");
                students.add(new Student(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("格式错误");
        }

        students.sort((A, B) -> Integer.compare(B.total, A.total));


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Student stu : students) {
                bw.write(stu.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
