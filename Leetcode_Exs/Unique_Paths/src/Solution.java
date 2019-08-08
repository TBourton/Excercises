
public class Solution {

	public static void main(String[] args) {
		
		int m=7;
		int n=36;
        int ans;
        ans=(int)(factorial(n+m-2)/factorial(n-1)/factorial(m-1));
        
        System.out.println("There are " + ans+ " possible paths");

	}
	
	 public static double factorial(int m){
	    double fac=1.0;
	    if (m==0) return 1;
	    else{
	          for (int i=1;i<=m;i++){
	               fac=fac* (double)i;
	               System.out.println(fac);
	          }
	 	return fac;
	    }
	 }


}

