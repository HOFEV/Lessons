// Checked Exception (Compile time exception) для try catch исключительные случаи
// Unchecked Exception (Runtime exception) ошибка при работе программы

package fileWorks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileTestDrive {
    public static void main(String[] args) throws FileNotFoundException {
        ReadingFileScanner.go();
    }
}

class ReadingFileScanner {
    public static void go() throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:"+ separator +"Users"+ separator +"daily"+ separator +"OneDrive"+ separator +"Развитие"+ separator +"Самообразование"+ separator +"Java"+ separator +"INTIDE"+ separator +"lesson10-19"+ separator +"src"+ separator +"fileWorks"+ separator +"text";


        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));

        scanner.close();
    }
}