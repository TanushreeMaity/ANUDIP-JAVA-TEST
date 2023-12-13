//Design a program that reads data from a file using the FileReader class. Use a BufferedReader to handle IOException.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader {
    public static void main(String[] args) {
        //Specify the path
        String filePath = "C:\\Users\\TANUSHREE\\Downloads\\outputarraylist.txt";
        try (FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader =new BufferedReader(fileReader)) {
            String line;
            //Read each line from file
            while ((line=bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
        }catch(FileDataReader e){
            //Handle IOException
            e.PrintStackTrace();
        }
        
    }
    
}
