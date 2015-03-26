/**
 * ID: U10316023 </br>
 * Ex: 11.8 </br>
 * Information: </br>
 *		test class create objects of Account,and print summary.
 */
import java.util.Scanner;

public class test{
	public static void main(String[] args){
		//create scanner
		Scanner in = new Scanner(System.in);

    //let user know what he/she should input
		System.out.print("set name, ID and balance : " );
		String S = in.next();
		int INT = in.nextInt(); 
		double DOUBLE = in.nextDouble();
		//create an Account object
		Account account = new Account(S,INT,DOUBLE);
		//let user set set annual interest rate
		System.out.print("set annual interest rate (%) : " );
		DOUBLE = in.nextDouble();
		account.setannualInterestRate(DOUBLE);
		//let user withdraw or deposit 
		do{
			System.out.println("withdraw(1),  deposit(2),  exit(0)" );
			INT = in.nextInt();
			switch(INT){
				case 1 : System.out.print("withdraw : ");
							DOUBLE = in.nextDouble();
							account.withdraw(DOUBLE);break;
				case 2 : System.out.print("deposit : ");
							DOUBLE = in.nextDouble();
							account.deposit(DOUBLE);break;
				case 0 : break;
			}
		}while(INT != 0);
		
		}
}
