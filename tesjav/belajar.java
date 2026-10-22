package tesjav;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class belajar {
    public static void main(String[] args) {
        LocalDate hari = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(
            "EEEE, dd MMMM yyyy", 
                Locale.forLanguageTag("id-ID"));
        System.out.println("Hari ini" + hari.format(fmt) +", saya belajar library di Java");
    }
}
