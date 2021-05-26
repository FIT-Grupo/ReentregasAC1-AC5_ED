package subAC1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class subac1test {
	subac1 recursao = new subac1();
	int n[] = {0, 1, 2, 3, 4, 5};
	
	//recursiveFactorial
	@Test
	void testRecursiveFactorial() {
		//fatorial de 8
		assertEquals(40320, recursao.recursiveFactorial(8));
	}
	
	//linearSum
	void testLinearSum() {
		int m = n.length;
		assertEquals(15, recursao.linearSum(n, m));
	}
	
	//ReverseArray

	//IterativeReverseArray
	
	//BinarySum
	void testBinarySum() {
		int start = 0;
		int s = n.length;
		assertEquals(7540, recursao.binarySum(n, start, s));
	}
	//BinaryFib
	void testBinaryFib() {
		int k = 9;
		assertEquals(34, recursao.binaryFib(k));
	}
	//LinearFibonacci
}
