import java.util.Calendar;

public class TestBirth {
    public static void main(String[] args) {
        Birth b1 = new Birth();
        Birth b2 = new Birth(2005, 10, 2);
        int now = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(b1 + " Age: " + (now - b1.year));
        System.out.println(b2 + " Age: " + (now - b2.year));
    }
}
