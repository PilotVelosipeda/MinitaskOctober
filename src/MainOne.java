import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MainOne {
    public static void main(String[] args) throws IOException {
        Reader book = new FileReader("C:\\Users\\279014857\\Downloads\\DrawUpdate\\Numbers\\data\\war_peace_processed.txt");
        int word;
        int count = 0;
        while ((word = book.read()) != -1)  {
            if ("Война".equals((char) word)) {
                count++;
            }
            System.out.print((char) word);
        }
    }
}
