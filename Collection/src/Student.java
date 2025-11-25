import java.util.*;

class Student {
    private final int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }

    public String toString() {
        return "id:" + id;
    }

    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        map.put(new Student(1003), "成都");
        map.put(new Student(1001), "北京");
        map.put(new Student(1004), "上海");
        map.put(new Student(1002), "广州");

        List<Map.Entry<Student, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey(Comparator.comparingInt(Student::getId)));

        for (Map.Entry<Student, String> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }


}