
import java.util.*;

class Solution {
	public static void main(String[] args) {
	    //Code
		int[] A = {0,0,0,1};
		int permCheck=1;
		Arrays.sort(A);
		int i=0;
		while (i<A.length){
			if (A[i]==i+1){
				i++;
			}
			else{ 
				permCheck=0;
				break;
			}
		}
		System.out.println(permCheck);
	}
}
