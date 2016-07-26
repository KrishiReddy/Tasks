
public class Customer {
	
	String name;
	String gender;
	int id;
	String address;
	
	public Customer(){
		
	}
	

	public Customer(String name, String gender, int id, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.address = address;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	

}
