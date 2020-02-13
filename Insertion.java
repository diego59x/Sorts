/**
* Tomado de https://stackabuse.com/insertion-sort-in-java/
* Diego Alvarez 19498 
*
*
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Insertion {

    
    public static void main(String[] args) {
        int cantN = 3000;
        BufferedReader entrada;
        Random r = new Random();
       
        
        escribirA();
        
        int[] array = new int[cantN];
        for(int i=0;i<array.length-1;i++){
            array[i]=0;
        }
        File p = new File("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt");
        try {
             entrada = new BufferedReader(new FileReader(p));
             while(entrada.ready()){
                for(int i=0;i < array.length-1;i++){
                    array[i] = Integer.parseInt(entrada.readLine());
                }
                
                   
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
     
       for (int j = 1; j < array.length; j++) {
        int current = array[j];
        int i = j-1;
        while ((i > -1) && (array[i] > current)) {
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = current;
    }
       
       
       
       
    }
    public static void escribirA(){
         Random r = new Random();
        int cantN = 3000;
           try(FileWriter fw = new FileWriter("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt", true); //Se mandan los reportes de los voluntarios hacia los pacientes
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw))
		{
                    for(int i=0;i < cantN;i++){
                         out.println(r.nextInt(500));
                    }
			 
		}catch (IOException e) {
		}
       }
}
