package opgave03.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class LogTilConsol implements LogStrategi{
    @Override
    public void logInfo(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] " + message;
        System.out.println(logMessage);
    }

    @Override
    public void logError(String message) {

        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] " + message;
        System.out.println(logMessage);

    }
}
