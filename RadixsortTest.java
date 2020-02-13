import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadixsortTest {

	@Test
	void test() {
		int[] desordenado = new int[]{ 5,4,3,2,1 };
		 int[] prueba = new int[]{ 1,2,3,4,5 };
		
		Radixsort.radixsort(desordenado);
		
		assertArrayEquals(desordenado, prueba );
	}

}
