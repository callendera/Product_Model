import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import javax.swing.JFileChooser;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductReader {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File document = chooser.getSelectedFile();
            try {
                Scanner input = new Scanner(document);
                System.out.println("ID #\tProduct Name\tProduct Description\tPrice");
                System.out.println("======================================");
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] rec = line.split(",");
                    System.out.format("%s\t\n", line);

                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found!!!");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
