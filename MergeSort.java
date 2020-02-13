
import java.util.*;
import java.io.*;

public class MergeSort {

   
    public static void ok(String[] args){  
        File f = new File("num.txt");
        BufferedReader entrada;
        Random r = new Random();
        try {
             FileWriter writer = new FileWriter("C:\\Users\\Diego Alvarez\\Documents\\NetBeansProjects\\SelectionSort\\src\\selectionsort\\num.txt", true);
		
                for (int i = 0; i < 3000; i++) {
			writer.write(r.nextInt());
			
		}
                   
            
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
   

        

// pre: 0 <= n <= data.length
// post: values in data[0..n-1] are in ascending order






               
    

