import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        String dataStringa = "2023-03-01T13:00:00Z";

        LocalDateTime dateTime = LocalDateTime.parse(dataStringa, DateTimeFormatter.ISO_DATE_TIME);

        int anno = dateTime.getYear();
        int mese = dateTime.getMonthValue();
        int giorno = dateTime.getDayOfMonth();
        String giornoSettimana = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);

        assertEquals(2023, anno);
        assertEquals(3, mese);
        assertEquals(1, giorno);
        assertEquals("mercoledì", giornoSettimana);
    }
}
