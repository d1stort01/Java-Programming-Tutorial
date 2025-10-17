public class Birth {
    public int year;
    public int month;
    public int day;

    public Birth() {
        year = 2000;
        month = 1;
        day = 1;
    }

    public Birth(int year, int month, int day) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", year, month, day);
    }
}
