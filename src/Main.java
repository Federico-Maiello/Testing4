import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dataStringa = "2023-03-01T13:00:00Z";

        LocalDateTime dateTime = LocalDateTime.parse(dataStringa, DateTimeFormatter.ISO_DATE_TIME);

        int anno = dateTime.getYear();
        int mese = dateTime.getMonthValue();
        int giorno = dateTime.getDayOfMonth();

        String giornoSettimana = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}
