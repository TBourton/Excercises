import java.math.*;

public class Solution {

	public static void main(String[] args) {
		
		int[] A={1,8,6,2,5,4,8,3,7};
		int numofcontainers=A.length*(A.length-1)/2;
		
		int maxarea = 0;
		
		for (int i=0;i<A.length-1;i++){
			for (int j=i+1;j<A.length;j++){
				if (Math.min(A[i],A[j])*(j-i)>maxarea) maxarea=Math.min(A[i],A[j])*(j-i);
			}
		}
		
		System.out.println(maxarea);

	}

}
