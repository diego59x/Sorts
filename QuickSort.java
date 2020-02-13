/**
* tomado de https://github.com/victorolave/QuickSort_Java/blob/master/src/quicksort/QuickSort.java
* Autor: Victor Olave 14/04/19
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

public class QuickSort {

    
    public static void main(String[] args) {
        int cantN = 40000;
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
        
        
        int [] numeros = new int[cantN] ;
        for(int i=0;i<numeros.length-1;i++){
            numeros[i]=0;
        }
        File f = new File("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt");
        try {
             entrada = new BufferedReader(new FileReader(f));
             while(entrada.ready()){
                for(int i=0;i < numeros.length-1;i++){
                    numeros[i] = Integer.parseInt(entrada.readLine());
                }
                entrada.close();
                   
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
       //Numeros para ordenar
        
        
        //Llamada Metodo de Ordenamiento QuickSort
        Quicksort(numeros, 0, numeros.length -1);
        
        //Metodo para imprimir Vector Ordenado
         ImprimirVector(numeros);
    }
    
    //Metodo de Ordenamiento QuickSort
    public static void Quicksort(int numeros[], int izq, int der)
    {
            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j)
            {
               while (numeros[i] <= pivote && i < j) 
                  i++;

               while (numeros[j] > pivote) 
                  j--;   

               if (i<j) 
               {                                     
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izq] = numeros[j]; 
             numeros[j] = pivote;

             if (izq < j-1)
                Quicksort(numeros,izq,j-1);

             if (j+1 < der)
                Quicksort(numeros,j+1,der);
      }
    
    public static void ImprimirVector(int arreglo[])
    {
        for(int i = 0; i < arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
            
}
    

