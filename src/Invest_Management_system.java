import java.util.Scanner;
public class Invest_Management_system {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num=0;
		while(num!=7) {		
			System.out.println("-Invest Distribution system-");
			System.out.println("Select one");
			System.out.println("1.Add investment item");
			System.out.println("2.Delete investment item");
			System.out.println("3.Revise investment item");
			System.out.println("4.View investment item");			
			System.out.println("5.Compare with other Investment item");
			System.out.println("6.Show a menu");
			System.out.println("7.Exit");
			num =input.nextInt();
			if (num==1) {
				Add_Investment_item();
			}
			else if (num==2) {
				Delete_investment_item();
			}
			else if (num==3) {
				Revise_investment_item();
			}
			else if (num==4) {
				View_investment_item();
			}
			else if (num==5) {
				Compare_with_other_Investment_item();
			}
			else if (num==6) {
				continue;
			}
		}	
	}
	public static void Add_Investment_item() {
		Scanner input = new Scanner (System.in);
		System.out.println("Item name:");
		String name=input.next(); 
		System.out.println("Investment amount($):");
		int amount=input.nextInt(); 
		System.out.println("Target investment period:");
		String period=input.next(); 
		System.out.println("Target return on investment(%):");
		int return_on_investment=input.nextInt(); 
	}
	public static void Delete_investment_item() {
		Scanner input = new Scanner (System.in);
		System.out.println("Item name");
		String name=input.next(); 
	}
	public static void Revise_investment_item() {
		Scanner input = new Scanner (System.in);
		System.out.println("Item name");
		String name=input.next(); 
	}
	public static void View_investment_item() {
		Scanner input = new Scanner (System.in);
		System.out.println("Item name");
		String name=input.next(); 
	}
	public static void Compare_with_other_Investment_item() {
		
	} 
}
