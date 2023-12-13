//Design a program that reads data from a file using the FileReader class. Use a BufferedReader to handle IOException.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        // BufferedReader object for reading lines from the file
        BufferedReader objReader = null;

        try {
            String strCurrentLine;

            // Creating a BufferedReader object by wrapping a FileReader around it
            objReader = new BufferedReader(new FileReader("C:\\Users\\TANUSHREE\\Desktop\\Notepad\\IOException.txt"));

            // Reading each line from the file until the end is reached
            while ((strCurrentLine = objReader.readLine()) != null) {
                System.out.println(strCurrentLine);
            }

        } catch (IOException e) {
            // Handling IOException by printing the stack trace
            e.printStackTrace();
        } finally {
            try {
                // Closing the BufferedReader in the finally block to ensure proper resource management
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                // Handling any IOException that might occur during closing the BufferedReader
                ex.printStackTrace();
            }
        }
    }
}
