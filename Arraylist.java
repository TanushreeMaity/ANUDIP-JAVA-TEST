// Write a Java program to create an ArrayList of integers, add elements to it, and then iterate through the list to print each element.
// Using for loop
 
// Importing all utility classes 
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
 
// Main class 
public class Arraylist {
   
    // Main driver method  
    public static void main(String[] args)
    {
        // Creating and initializing the ArrayList
        // Declaring object of integer type 
        Scanner sc= new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
       // Array size taking from the user
        int size;
        System.out.println("Enter the size of arrayList");
        size=sc.nextInt();

       // Array list elements taking from the user 

        System.out.println("Enter the Array List Number");
        for(int i=0;i<size;i++){
            numbers.add(sc.nextInt());

        }


 
        // Iterating using for loop and printing
        for (Integer number : numbers)
            // Printing and display the elements in ArrayList 
            System.out.print(number + " ");        
    }
}