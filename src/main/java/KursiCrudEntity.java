import model.Kursi;
import repository.KursiRepository;

import java.time.LocalDateTime;

public class KursiCrudEntity {
    public static Kursi main(String[] args) {
        KursiRepository kursiRepository = new KursiRepository();

        Kursi kursi = createKursi();

        kursiRepository.insertKursi(kursi);

        return kursi;
    }

    private static Kursi createKursi() {
        Kursi kursi = new Kursi();
        kursi.setId(1);
        kursi.setName("SDA");
        LocalDateTime creationDate = LocalDateTime.parse("2022-05-05T15:15");
        kursi.setStudentsEnrolled(22);
        kursi.setPercentageOfCompletation(70.00D);
        kursi.setFinished(false);
        return kursi;
    }
}
