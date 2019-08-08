import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1};
		Arrays.sort(A);
		boolean duplicates=false;
		int n=0;
		while (n < A.length-1){
			if (A[n]==A[n+1]){
				duplicates=true;
				break;
			}
			else n++;
		}
		
		System.out.println(duplicates);

	}
	
}
