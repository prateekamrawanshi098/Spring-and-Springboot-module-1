package in.spring.beans;

public class Customer {
	private String name;
	private Account acc;
	
	public Customer(Account at) {
		this.acc=at;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void show() {
		System.out.println("name "+name);
		System.out.println("accId "+acc.getAcctId());
		System.out.println("balance "+acc.getBalance());
	}
	
}
