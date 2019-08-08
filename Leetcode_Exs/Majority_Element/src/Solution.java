import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		int[] A= {2,2,1,1,1,2,2};
		Arrays.sort(A);
		
		int n=0;
		int p=0;
		int majElement=0;
		
		while (n<A.length){
			p=0;
			while (n+p<A.length && A[n]==A[n+p]){
				p++;
			}
			if (p>Math.floor(A.length/2)){
				majElement=A[n];
				break;
			}
			n=n+p;

		}
		System.out.println(majElement);

	}

}
