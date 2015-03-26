/**
 * ID: U10316023
 * Ex: 11.8 
 * Information: 
 *		Account class was designed with the requirements on page 357&496
 */
import java.util.ArrayList;
public class Account{
	//data field
	//add new data field name of String type to store the name of the customer
	private String name;
	private int id;
	private double balance ,annualInterestRate ;
	private java.util.Date dateCreated;
	
	ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	
	//no-arg constructor create default account
	Account(){
		name = "";
		id =0;
		balance =0;
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}
	//constructor  with id & balance
	Account(int id,double balance){
		this.id =id;
		this.balance = balance;
		name = "";
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}
	//constructor  with name & id & balance
	Account(String name,int id,double balance){
		this.name = name;
		this.id =id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}
	
	//access name
	public String getname(){
		return name;
	} 
	//access id
	public int getid(){
		return id;
	} 
	//access balance
	public double getbalance(){
		return balance;
	} 
	//access annualInterestRate
	public double getannualInterestRate(){
		return annualInterestRate;
	} 
	//access dateCreated
	public java.util.Date getdateCreated(){
		return dateCreated;
	} 
	
	//set a new name
	public void setname(String name){
		this.name = name;
	}
	//set a new id
	public void setid(int id){
		this.id = id;
	}
	//set a new balance
	public void setbalance(double balance){
		this.balance = balance;
	}
	//set a new annualInterestRate (%)
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate/100;
	}
	
	//a method name MonthlyInterestRate return monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	} 
	//a method name MonthlyInterest return monthly interest 
	public double getMonthlyInterest(){
		return balance*getMonthlyInterestRate();
	}
	//a method name withdraw return a new balance 
	public double withdraw(double minus){
		balance -= minus;
		transaction.add(new Transaction('W',minus,balance,T.getdescription()));
		System.out.println(toString() + T.getdescription());
		return balance;
	}
	//a method name deposit return a new balance 
	public double deposit(double plus){
		balance += plus;
		return balance;
	}
	
	//print the balance , monthly interest ,and the date when this account create
	public String toString(){
		return "id : "+ id + "\nbalance : " + getbalance() + "\nmonthly interest : " + getMonthlyInterest() + "\ndate : " + dateCreated ;
	}
}
