
public class Solution {

	public static void main(String[] args) {
		
		// By fundamental theorem of arithmetic n!=\prod_i p_i^{m_i}
		// where p_i prime. Any number z with q trailing zeros has factorisation of the form
		// z= z' * 10^q=z'*(2^q*5^q) where z' contains no further decomposition in 2*5
		// So, in n! we just have to check number of times #_2, #_5 that n,n-1,n-2,...,1 factors 
		// into 2 and 5 and then just take min(#_2,#_5) 
		
		int n=25; //n>0
		int num5=0;
		int num2=0;
		
		for (int i=n;i>0;i--){
			num5=num5 + mDivByP(i,5);
			num2=num2 + mDivByP(i,2);
			
		}
		
		System.out.println("The number of trailing zeros of " + n +" is " + Math.min(num5,num2));
			
	}
	
	public static int mDivByP(int m, int P) {
		int n=0;
		int number=m;
		while (number%P==0){
			n++;
			number=number/P;
		}
		return n;	
	}

}
