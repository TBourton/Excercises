
public class Solution {

	public static void main(String[] args) {
		String str = "abbced";
		String longest="";

		int i=0;
		String temp="";
		
		while (i<str.length()){
			
			temp="";
			temp=temp + str.charAt(i);
			
			
			while(str.charAt(i)!=str.charAt(i+1)){
				if (i>str.length()) break;
				temp=temp + str.charAt(i+1);
				i++;
				
			System.out.println(temp);
			}	
			
			if (temp.length()>longest.length()){
				longest = temp;
				temp="";
				i--;
			}
			else{
				temp="";
				i++;
			}
		}
		
		System.out.println(longest);
		
		
		
		
		
	}

}
