import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        String myDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = getParse(myDate);
        System.out.println(dateTime);
        // get the year
        int year = getYear(dateTime);
        Month month = getMonth(dateTime);
        int day = getDayOfMonth(dateTime);
        String week = getWeek(dateTime);
        System.out.println(year + " " + month + " "  + day + " " + week);

    }

    public static String getWeek(OffsetDateTime dateTime) {
        return String.valueOf(dateTime.getDayOfWeek());
    }

    public static int getDayOfMonth(OffsetDateTime dateTime) {
        return dateTime.getDayOfMonth();
    }

    public static Month getMonth(OffsetDateTime dateTime) {
        return dateTime.getMonth();
    }

    public static int getYear(OffsetDateTime dateTime) {
        return dateTime.getYear();
    }

    public static OffsetDateTime getParse(String myDate) {
        return OffsetDateTime.parse(myDate);
    }
}
