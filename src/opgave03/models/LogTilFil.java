package opgave03.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class LogTilFil implements LogStrategi {
    @Override
    public void logInfo(String message) {

        File outfile = new File("Indsæt/sti/til/fil");
        try {
            outfile.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(outfile);
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
            return;
        }
        writer.println(message);
    }

    @Override
    public void logError(String message) {

        File outfile = new File("Indsæt/sti/til/fil");
        try {
            outfile.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(outfile);
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
            return;
        }
        writer.println(message);
    }
}
