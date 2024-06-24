import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

@Test
void checkTheFormat(){
    Main testFormat = new Main();
    testFormat.getParse("2025-03-01T13:00:00Z");
    Main expected = new Main();
    expected.getParse("2025-03-01T13:00:00Z");
    assertEquals(testFormat.getParse("2025-03-01T13:00:00Z"),expected.getParse("2025-03-01T13:00:00Z"));
}

@Test
void getYear(){
    String myDate = "2023-03-01T13:00:00Z";
    OffsetDateTime dateTime = Main.getParse(myDate);
    Main actual = new Main();
    Main expected = new Main();
    assertEquals(expected.getYear(dateTime), actual.getYear(dateTime));
}

    @Test
    void getMonth(){
        String myDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.getParse(myDate);
        Main actual = new Main();
        Main expected = new Main();
        assertEquals(expected.getMonth(dateTime), actual.getMonth(dateTime));
    }

    @Test
    void getDayOfMonth(){
        String myDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.getParse(myDate);
        Main actual = new Main();
        Main expected = new Main();
        assertEquals(expected.getDayOfMonth(dateTime), actual.getDayOfMonth(dateTime));
    }

    @Test
    void getWeek(){
        String myDate = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.getParse(myDate);
        Main actual = new Main();
        Main expected = new Main();
        assertEquals(expected.getWeek(dateTime), actual.getWeek(dateTime));
    }

}