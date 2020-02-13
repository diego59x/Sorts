

import java.util.*;
import java.io.*;

public class SelectionSort {

    public static void main(String[] args) {
        int cantN = 2000;
        BufferedReader entrada;
        Random r = new Random();
       
        try(FileWriter fw = new FileWriter("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt", true); //Se mandan los reportes de los voluntarios hacia los pacientes
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw))
		{
                    for(int i=0;i < cantN;i++){
                         out.println(r.nextInt());
                    }
			 
		}catch (IOException e) {
		}
        
        
        int [] arr1 = new int[cantN] ;
        for(int i=0;i<arr1.length-1;i++){
            arr1[i]=0;
        }
        File f = new File("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt");
        try {
             entrada = new BufferedReader(new FileReader(f));
             while(entrada.ready()){
                for(int i=0;i < arr1.length-1;i++){
                    arr1[i] = Integer.parseInt(entrada.readLine());
                }
                entrada.close();
                   
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
         
   
       int size, i, j, temp;  
       
       
       System.out.print("Sorting Array using Selection Sort Technique..\n");  
       for(i=0; i<cantN; i++)  
       {  
           for(j=i+1; j<cantN; j++)  
           {  
               if(arr1[i] > arr1[j])  
               {  
                   temp = arr1[i];  
                   arr1[i] = arr1[j];  
                   arr1[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<cantN; i++)  
       {  
           System.out.print(arr1[i]+ "  \n");  
       }  
   }  
} 
    
    

