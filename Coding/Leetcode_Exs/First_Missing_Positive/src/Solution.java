
public class Solution {

	public static void main(String[] args) {
		int[] A={3,4,-1,1};
		int smallest=1;
		
		for (int i=0;i<A.length;i++){
			if (A[i]>=smallest){
				smallest=A[i]+1;
			}
		}
		
		System.out.println(largest);
	
	}

}
