package ITEM;
import java.util.Scanner;

public class Investment_item {
	protected kind kind1=kind.stock;
	protected String name;
	protected int amount;
	protected String period;
	protected int target;
	
	
	
	public Investment_item() {
		
	}
	public Investment_item(String name) {
		this.name=name;
	}
	public Investment_item(kind kind1, String name, int amount,String period, int target) {
		this.kind1=kind1;
		this.name=name;
		this.amount=amount;
		this.period=period;
		this.target=target;
	}
	
	public kind getKind1() {
		return kind1;
	}
	public void setKind1(kind kind1) {
		this.kind1 = kind1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public void printinfo() {
		String kind2="none";
		switch(this.kind1) {
		case money:
			kind2="money";
			break;
		case stock:
			kind2="stock";
			break;
		case materials:
			kind2="materials";
			break;
		case bond:
			kind2="bond";
			break;
		default:
		}
		System.out.println("kind:"+kind2+"name:"+this.name+" amount:"+this.amount+" period:"+this.period+" target:"+this.target);
	}
	public void getUserInput(Scanner input) {
		
		System.out.println("Investment name:");
		String name=input.next(); 
		this.setName(name);
		System.out.println("Investment amount($):");
		int amount=input.nextInt(); 
		this.setAmount(amount);
		System.out.println("Target investment period:");
		String period=input.next(); 
		this.setPeriod(period);
		System.out.println("Target return on investment(%):");
		int target=input.nextInt();
		this.setTarget(target);
	}
}
