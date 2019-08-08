import java.util.*;


public class Solution {

	public static void main(String[] args) {
		
		//We have to just compute A+B-C where A=sum_{i=1}^{n_3}3i
		// B=sum_{i=1}^{n_5}5i, C=sum{i=1}^{n_{15}}15i
		// and n_p=Floor(1000/p), n_3=333, n_5=200, n_{15}=66
		// So expected answer is 3n_3(n_3+1)/2 + 5n_5(n_5+1)/2 -15n_{15}(n_{15}+1)/2
		// =234168
		
        Set<Integer> multiples = new HashSet<Integer>();
        
        int n=10;
        int sum=0;
        int n3 = Math.floorDiv(n, 3);
        int n5 = Math.floorDiv(n, 5);
        
        for (int i=0;i<n;i++){
        	if (i%3==0 || i%5==0){
        		multiples.add(i);
        		System.out.println(i);
        	}
        }
        
        Iterator<Integer> itr = multiples.iterator();
        while(itr.hasNext()){
        	  sum = sum + itr.next();
        	}
        
        System.out.println(sum);


	}

}
