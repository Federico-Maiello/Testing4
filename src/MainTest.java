import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import static java.util.Calendar.MARCH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Main main = new Main();
    String dataStringa = "2023-03-01T13:00:00Z";


    @Test
    public void testGetYear() {
        LocalDateTime dateTime = LocalDateTime.parse(dataStringa, DateTimeFormatter.ISO_DATE_TIME);
        int risultato = main.getYear(dateTime);
        assertEquals(2023, risultato);
    }   @Test
    public void testGetMonth() {
        LocalDateTime dateTime = LocalDateTime.parse(dataStringa, DateTimeFormatter.ISO_DATE_TIME);
        int risultato = main.getMonth(dateTime);
        assertEquals(3, risultato);
    }   @Test
    public void testGetDayOfMonth() {
        LocalDateTime dateTime = LocalDateTime.parse(dataStringa, DateTimeFormatter.ISO_DATE_TIME);
        int risultato = main.getDayOfMonth(dateTime);
        assertEquals(1, risultato);
    }   @Test
    public void testGetDayOfWeek() {
        LocalDateTime dateTime = LocalDateTime.parse(dataStringa, DateTimeFormatter.ISO_DATE_TIME);
        String risultato = main.getDayOfWeek(dateTime);
        assertEquals("WEDNESDAY", risultato);
    }

}
