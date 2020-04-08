import java.util.Scanner;
public class Invest_Management_system {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Itemmanager  itemmanager=new  Itemmanager(input);
		int num=0;
		while(num!=7) {		
			System.out.println("-Invest Distribution system-");
			System.out.println("Select one");
			System.out.println("1.Add investment item");
			System.out.println("2.Delete investment item");
			System.out.println("3.Revise investment item");
			System.out.println("4.View investment item");			
			System.out.println("5.Compare with other Investment item");
			System.out.println("6.Exit");
			num =input.nextInt();
			if (num==1) {
				itemmanager.Add_Investment_item();
			}
			else if (num==2) {
				itemmanager.Delete_investment_item();
			}
			else if (num==3) {
				itemmanager.Revise_investment_item();
			}
			else if (num==4) {
				itemmanager.View_investment_item();
			}
			else if (num==5) {
				itemmanager.Compare_with_other_Investment_item();
			}
			else if (num==6) {
				continue;
			}
		}	
	}
	
}
