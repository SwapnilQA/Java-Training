
public class Teacher extends Person{
	
	private String department;
	private String specialization;

	/**
	 * @param name
	 * @param age
	 * @param department
	 * @param specialization
	 */
	public Teacher(String name, int age, String department, String specialization) {
		super(name, age);
		this.department = department;
		this.specialization = specialization;
	}

	/**
	 * 
	 * @param department
	 * This method will assign a value to Department 
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * This method will assign a value to specialization
	 * @param specialization
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	/**
	 * This method will return department
	 * @return
	 */
	public String getDepartment() {
		return this.department;
	}
	/**
	 * This method will return specialization
	 * @return
	 */
	public String getSpecialization() {
		return this.specialization;
	}
}
