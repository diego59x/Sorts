// tomado de https://stackoverflow.com/questions/13727030/mergesort-in-java
package merge;
import java.util.*;
import java.io.*;
public class Merge {

    
    public static void main(String[] args) throws IOException {
        int cantN = 100;
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
        
        
        int [] inputArray = new int[cantN] ;
        for(int i=0;i<inputArray.length-1;i++){
            inputArray[i]=0;
        }
        File f = new File("C:\\Users\\Diego Alvarez\\Desktop\\U\\pop.txt");
        try {
             entrada = new BufferedReader(new FileReader(f));
             while(entrada.ready()){
                for(int i=0;i < inputArray.length-1;i++){
                    inputArray[i] = Integer.parseInt(entrada.readLine());
                }
                entrada.close();
                   
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        BufferedReader R = new BufferedReader(new FileReader(f));
       
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = Integer.parseInt(R.readLine());
        }
        mergeSort(inputArray);

        for (int j = 0; j < inputArray.length; j++) {
            System.out.println(inputArray[j]);
        }

    }

    static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;

//changed range of leftArray from 0-to-q to 0-to-(q-1)
            int[] leftArray = Arrays.copyOfRange(A, 0, q-1);
//changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(A,q,A.length-1);
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(A,leftArray,rightArray);
    }
    
}

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            } else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }

}