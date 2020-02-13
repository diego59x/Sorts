import static org.junit.Assert.assertArrayEquals;


import org.junit.jupiter.api.Test;

class MergeTest {

	@Test
	void test() {
		int[] desordenado = new int[]{ 5,4,3,2,1 };
		 int[] prueba = new int[]{ 1,2,3,4,5 };
		
		Merge test = new Merge();
		Merge.mergeSort(desordenado);
		
		assertArrayEquals(desordenado, prueba );
	}

}
