import java.util.*;

public class GradeStatistic {
    static class Mark {
        String name;
        Integer score;

        Mark(String name, Integer score) {
            this.name = name;
            this.score = score;
        }

        public String toString() {
            return name + "\t" + score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mark> stuList = new ArrayList<>();
        while (true) {
            System.out.print("姓名：");
            String name = sc.next();
            if (name.equals("end")) break;
            System.out.print("成绩：");
            Integer score = sc.nextInt();
            stuList.add(new Mark(name, score));
        }
        sc.close();
        stuList.sort((s1, s2) -> Integer.compare(s2.score, s1.score));
        double sum = 0;
        for (Mark m : stuList) {
            sum += m.score;
        }
        double avg = sum / stuList.size();
        System.out.printf("平均分：%.2f\n", avg);
        System.out.printf("最高分：%d\n", stuList.getFirst().score);
        System.out.printf("最低分：%d\n", stuList.getLast().score);
        for (Mark s : stuList) {
            System.out.println(s);
        }

    }
}