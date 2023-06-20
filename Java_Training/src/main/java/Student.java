
public class Student extends Person{
	
	private int rollNo;
	private String course;
	private String department;
	
	
/**
 * This is a constructor it will initialize the value of Name, Age, Roll Number
 * course and department.
 * @param name
 * @param age
 * @param rollNo
 * @param course
 * @param department
 */
	public Student(String name, int age, int rollNo, String course, String department) {
		super(name, age);
		this.course = course;
		this.rollNo = rollNo;
		this.department = department;
		
	}
	
	/**
	 * This method will assign a value to roll number.
	 * @param rollNo
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	/**
	 * This method will assign a value to course.
	 * @param course
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	/**
	 * This method will assign a value to department.
	 * @param department
	 */
	public void setdepartment(String department) {
		this.department = department;
	}

	/**
	 * This method will return roll number.
	 * @return
	 */
	public int getRollNo() {
		return this.rollNo;
	}
	
	/**
	 * This method will return course.
	 * @return
	 */
	public String getCourse() {
		return this.course;
	}
	
	/**
	 * This method will return department.
	 * @return
	 */
	public String getdepartment() {
		return this.department;
	}
}
