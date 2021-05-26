package subAC1;

public class subac1 {
	//recursiveFactorial
	public int recursiveFactorial (int n) {
		if (n <= 1)
			return 1;
		else
			return n * recursiveFactorial(n - 1);
	}
	
	//LinearSum
	public int linearSum(int[] a, int n) {
		if (n == 1) {
			return a[0];
		}
		else {
			return linearSum(a, n - 1) + a [n - 1];
		}
	}
	
	//ReverseArray
	public void reverseArray(int[] n, int start, int end) {
		if(start < end) {
			int temp = n[start];
			n[start] = n[end];
			n[end] = temp;
			reverseArray(n,start +1, end - 1);
		}
	}
	
	//IterativeReverseArray
	public void iterativeReverseArray(int[] n, int start, int end) {
		while(start < end) {
			int temp = n[start];
			n[start] = n[end];
			n[end] = temp;
			start = start + 1;
			end = end - 1;			
		}
	}
	//BinarySum
	public int binarySum(int[] n, int start, int s) {
		if (s == 1) {
			return n[start];
		} 
		else {
			if (s%2 == 1) {
				s = s-1;
				return binarySum(n, start, (s/2)) + binarySum(n, start+(s/2), (s/2)) + n[s+start];
			}
			return binarySum(n, start, (s/2)) + binarySum(n, start+(s/2), (s/2));
		}
	}
	//BinaryFib
	public int binaryFib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return binaryFib(n-1) + binaryFib(n-2);
		}
	}
	//LinearFibonacci
}
