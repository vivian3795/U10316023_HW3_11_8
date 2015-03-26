/**
 * ID: U10316023 
 * Ex: 11.8 
 * Information:
 *		Transaction class was designed with the requirements on page 469
 */
import java.util.Date;

public class Transaction {
	//data field
	private char type;
	private double amount;
	private double balance;
	private String description;
	private Date date;

	//constructor with type,  amount,  balance,  description
	Transaction(char type, double amount, double balance, String description) {
		this.type =type;
		this.amount =amount;
		this.balance = balance;
		this.description = description;
		date = new java.util.Date();
	}

	//the get method for these data field
	public char gettype() {
		return type;
	}
	public double getamount() {
		return amount;
	}
	public double getbalance() {
		return balance;
	}
	public String getdescription() {
		//the description of this transaction
		return "time : "+ getdate()+"\ntype : "+gettype()+
		"\namount : "+getamount() +"\nbalance : "+getbalance();
	}
	public java.util.Date getdate(){
		return date;
	} 
	
	//the set method for these data field(except date)
	public void settype(char type) {
		this.type =type;
	}
	public void setamount(double amount) {
		this.amount =amount;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	
	//a toString method which will be use by ArrayList<Transaction>
	public String toString(){
		return "\ndescription\n"+getdescription();
	}
}
