
public class Status {
	int money;
	int stockOwned;
	
	public Status(int mon,int stock){
		money=mon;
		stockOwned=stock;
	}
	 
	public int getMoney(){
		return this.money;
	}
	
	public int getstockOwned(){
		return this.stockOwned;
	}
	public void setstockOwned(int owned){
		this.stockOwned=owned;
	}
	public void setMoney(int mon){
		this.money=mon;
	}
}
