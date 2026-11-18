package in.spring.beans;

public class Address {
	
	private int HouseNo;
	private String city;
	public Address() {
		System.out.println("Address bean created");
	}
	public int getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(int houseNo) {
		System.out.println("HouseNo injected");
		HouseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("city injected");
		this.city = city;
	}
	
	
	
	

}
