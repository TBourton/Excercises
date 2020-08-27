import java.util.*;
import java.math.*;

public class Solution {
	public static final int NOTOWNED = 0;
	public static final int OWNED = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] ={7,1,5};
		int maxProfit=0;
		
		Status[][] tree = new Status[data.length+1][];
		
		for (int i=0;i<data.length+1;i++){
			tree[i]= new Status[(int) Math.pow(2, i)];
			for (int j=0;j<(int) Math.pow(2, i);j++){
				tree[i][j]=new Status(0,NOTOWNED);
				
			}
		}
		
		Leaves(tree,data);
		
		for (int i=0;i<(int) Math.pow(2,data.length);i++){
			if (tree[data.length][i].money>=maxProfit){
				maxProfit=tree[data.length][i].money;
			}
		}
		System.out.println("Max profit is " + maxProfit);
	}
	
	public static void Leaves(Status s[][], int d[]){
		for (int i=0;i<d.length;i++){
			for (int j=0;j<s[i].length;j++){
				
				if (s[i][j].getstockOwned() == OWNED){ //sell the stock
					s[i+1][2*j].setMoney(s[i][j].getMoney()+d[i]);
					s[i+1][2*j].setstockOwned(NOTOWNED);
				}
				else{ 
					s[i+1][2*j].setMoney(s[i][j].getMoney()-d[i]); //else buy the stock
					s[i+1][2*j].setstockOwned(OWNED);
				}
				s[i+1][2*j+1].setMoney(s[i][j].getMoney()); //do nothing
				s[i+1][2*j+1].setstockOwned(s[i][j].getstockOwned());
			}
				

				
		}
		
		
	}
	

}
