/*Tomado de https://foro.elhacker.net/java/algoritmo_radix_sort_en_java-t276529.0.html
 * Autor : leyer 2/12/2009
 * 
 */


import java.lang.*;
import java.io.*;
import java.util.Random;
 
public class Radixsort {

    
    public static void radixsort(int[] arr) {
        int cantN = 3000;
        BufferedReader entrada;
        Random r = new Random();
       
        try(FileWriter fw = new FileWriter("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt", true); //Se mandan los reportes de los voluntarios hacia los pacientes
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw))
		{
                    for(int i=0;i < cantN;i++){
                         out.println(r.nextInt(500));
                    }
			 
		}catch (IOException e) {
		}
        
        
        
        for(int i=0;i<arr.length-1;i++){
            arr[i]=0;
        }
        File p = new File("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt");
        try {
             entrada = new BufferedReader(new FileReader(p));
             while(entrada.ready()){
                for(int i=0;i < arr.length-1;i++){
                    arr[i] = Integer.parseInt(entrada.readLine());
                }
                entrada.close();
                   
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        
        if(arr.length == 0)
            return;
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k=0;k<4;k++){
            for(i=0;i<(np.length-1);i++)
                np[i][1] = i+1;
            np[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<arr.length;i++){
                j = ((0xFF<<(k<<3))&arr[i])>>(k<<3);
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(np[l][1] != -1)
                        l = np[l][1];
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                        arr[j++] = np[l][0];
        }
    }
 
    public static void main(String[] args){
        int i;
        int cantN = 3000;
        int[] arr = new int[cantN];
        System.out.print("original: ");
        for(i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 1024);
            System.out.print(arr[i] + " ");
        }
        radixsort(arr);
        System.out.print("\nsorted: ");
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nDone ;-)");
    }
}
    

