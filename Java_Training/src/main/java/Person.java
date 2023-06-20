
public class Person {
	
	private String name;
	private int age;
	
	/**
	 * This is a constructor and this will initialize Person class. 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name= name;
		this.age=age;
	}
	
	/**
	 * This method will assign Name.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method will assign Age.
	 * @param age
	 */
	public void setAge(int age) {
		this.age=age;
	}
	
	/**
	 * This method will return Name.
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * This method will return Age.
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
}
