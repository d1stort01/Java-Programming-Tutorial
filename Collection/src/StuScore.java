import java.util.*;

public class StuScore {
    static String[] name_ = {"王秀珍", "张 军", "王 莲", "王义杰", "张玉菁", "王慧薇",
            "李文泽", "李 山", "李 琳", "王娥凡", "李娜嘉", "李嘉朗", "王 华", "张 燕",
            "李 淑", "王 环", "王 兴", "王峰杰", "王 美", "王毅信", "王伟志", "王刚星",
            "张 欣", "张洁贞", "李 环", "李 德", "王 嘉", "王 秀", "李洁莺", "李龙和"};

    static class Student {
        private String id;
        private String name;
        private char gender;
        private int score;

        Student(String id, String name, char gender, int score) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String toString() {
            return id + "\t" + name + "\t" + gender + "\t" + score;
        }
    }

    public static void main(String[] args) {
        Map<Object,Student> stuMap = new TreeMap();
        List<Student> stuList = new ArrayList<>();

        Random rand = new Random();
        for (int i = 1; i <= 30; i++) {
            String id = String.format("200703%02d", i);
            String name = name_[i - 1];
            char gender = (rand.nextInt(2) == 0) ? '男' : '女';
            int score = 60 + rand.nextInt(41);

            stuList.add(new Student(id, name, gender, score));
            stuMap.put(-score, new Student(id, name, gender, score));
        }

        stuList.sort((s1, s2) -> s2.getScore() - s1.getScore());

        System.out.println("List:");
        for (Student student : stuList) {
            System.out.println(student);
        }

        System.out.println("Map:");
        for (Object key : stuMap.keySet()) {
            System.out.println(stuMap.get(key));
        }
    }
}