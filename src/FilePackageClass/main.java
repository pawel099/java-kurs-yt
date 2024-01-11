package FilePackageClass;

import java.io.*;
import java.util.Scanner;

public class main {

 private void files(FileWriter file ,String wynik) throws IOException {
  file.write(wynik + "\n");
  file.flush();
 }

 public void dopisz(FileWriter file ,String wynik) throws IOException {
  file.append(wynik + "\n");
  file.flush();

 }
 public static void main(String[] args) throws IOException {

  Scanner scanner = new Scanner(System.in);
  String zapisz = scanner.nextLine();
  main dane = new main();

  final String FILE_WRITE = "src/file/plik.txt";
  FileWriter files = new FileWriter(FILE_WRITE,true);
  dane.dopisz(files,zapisz);

}

}
