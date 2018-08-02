
public class Workers {
	private int id;
	private String fName;
	private String lName;
	private int age;
	private Float salary;
	private String sex;
	
	Workers(int id,String fName,String lName,int age, Float salary,String sex){
		this.id = id;
		this.fName =fName;
		this.lName =lName;
		this.age =age;
		this.salary =salary;
		this.sex =sex;
	}
	
	public int getId(){
		return id;
	}
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	

}
