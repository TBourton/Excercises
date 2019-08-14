import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int n=nums.length;
		Set<ArrayList<Integer>> solutionSet = new HashSet<ArrayList<Integer>>();
		
		
		//Assuming every element of nums is distinct there are 
		// \sum_{a=1}^n\sum_{b=a+1}^n\sum_{c=b+1}^n=1/6 *(n^3-3n^2+2n) distinct triplets a+b+c

		for (int i=0;i<n;i++){
			for (int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					if (nums[i]+nums[j]+nums[k]==0){
						ArrayList<Integer> tempList = new ArrayList<Integer>();
						tempList.add(nums[i]);
						tempList.add(nums[j]);
						tempList.add(nums[k]);
						Collections.sort(tempList);
						solutionSet.add(tempList);
					}
					
				}
			}
		}
		
		System.out.println(solutionSet);
		

	}
	


}

