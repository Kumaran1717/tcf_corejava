package package2;

public class customerDemo {
	
	private int age;
	private String name;
	private String city;
	
	/*public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	
		public String getCity() {
		return city;
	}
	*/
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
	return "Name:"+name+" Age:"+age+" City:"+city;
	}
	
	public static void main(String[] args) {
		
	}
}
