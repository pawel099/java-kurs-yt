package FilePackageClass;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class odczyt {
    protected String link = "src/file/plik.txt";

    protected void zapiszDoPliku (FileWriter file , String wynik) throws IOException {

        file.write(wynik + "\n");
        file.flush();
        file.close();
    }

    protected void dopiszDoPliku (FileWriter file ,String wynik) throws IOException {
        file.append(wynik + "\n");
        file.flush();
        file.close();
    }

    protected void odczytaj (FileWriter file) throws IOException {

        Path path = Paths.get(this.link);
        List<String> e = Files.readAllLines(path);

        for (String fileText : e) {
            System.out.println(fileText);

        }
    }
    protected void zapiszDane() throws IOException {

         Scanner scanner = new Scanner(System.in);
         String zapisz = scanner.nextLine();
         main dane = new main();

         FileWriter files = new FileWriter(this.link,true);
         dane.dopiszDoPliku(files,zapisz);
         dane.odczytaj(files);
    }
}
