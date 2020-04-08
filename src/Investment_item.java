
public class Investment_item {
	String name;
	int amount;
	String period;
	int target;
	public Investment_item() {
		
	}
	public Investment_item(String name, int amount,String period, int target) {
		this.name=name;
		this.amount=amount;
		this.period=period;
		this.target=target;
	}
	public void printinfo() {
		System.out.println("name:"+name+"amount:"+amount+"period:"+period+"target:"+target);
	}
}
