
public class Solution {
	
	public static void main(String args[]){
		int[] nums={1,2,3,4};
		nums=productExceptSelf(nums);
	}
	
    public static int[] productExceptSelf(int[] nums) {
        int[] A=new int[nums.length];
        int I=1; 
        
        for (int n=0;n<nums.length;n++){
        	
        	I=I*nums[n];
        }
        for (int n=0;n<nums.length;n++){
        	A[n]=I/nums[n];
        }
    	return A;
    }
}
