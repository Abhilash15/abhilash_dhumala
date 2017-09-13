import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	 private Static void newStudents(){
	    static student[] students;
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
    String  FirstName;
    String  LastName;	
	@Override
	public Student[] getStudents() {
		for(int i=0;i<students.length;i++){
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		Scanner sc = new scanner(System.in);
	    System.out.println("Student details");
	}

	@Override
	public void Student getStudent () {	
	}

	@Override
	public static  void AddStudent (){
	  Scanner sc = new scanner(Sysyem.in);
	  Student student = new student();
	}

	@Override
	public ststic void addLastStudent (){
		Scanner sc = new scanner(System.in);
		System.out.println("student details");
		ViewStudents();
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public static void removeStudent() {
		
	}

	@Override
	public static void removeStudent() {
		Scanner sc = new scanner()
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
