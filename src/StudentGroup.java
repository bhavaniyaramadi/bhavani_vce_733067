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
         public int length;
	private Student[] std;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
this.length=length;
	}

	@Override
	public Student[] getStudents() {
		
         
         return std;
	}

	@Override
	public void setStudents(Student[] students) {
try{
     if(students==null)
          throw new IllegalArgumentException;
     else{
              String s="A";
             	for(int i=0;i<length;i++)
                {
                   students[i].setId(i+1);
                   students[i].setFullName(s);
students[i].setBirthDate("1997-05-05");
students[i].setAvgMark(80+i);
                 }
 }	
catch(Exception e)
          {}

	}

	@Override
	public Student getStudent(int index) {
		return std[index];
		
	}

	@Override
	public void setStudent(Student student, int i) {
            try{
               if(student==null)
                 throw new IllegalArgumentException;
               else
		std[i]=student;

	}
         catch(Exception e)
          {}}

	@Override
	public void addFirst(Student student)         {
		Student[] s=new Student(length);
for(int i=0;i<length;i++)
s[i]=std[i];
std=new Student[length+1];
std[0]=student;
for(int i=0;i<length;i++)
std[i+1]=s[i];
length++;
	}

	@Override
	public void addLast(Student student) {
		Student[] s=new Student(length);
for(int i=0;i<length;i++)
s[i]=std[i];
std=new Student[length+1];
for(int i=0;i<length;i++)
std[i]=s[i];
std[length]=student;
length++;
	}

	@Override
	public void add(Student student, int index) {
		Student[] s=new Student(length);
for(int i=0;i<length;i++)
s[i]=std[i];
std=new Student[length+1];
std[index]=student;
for(int i=0;i<index;i++)
std[i]=s[i];
for(int i=index;i<length;i++)
std[i+1]=s[i];
length++;
	}

	@Override
	public void remove(int index) {
			
	}

	@Override
	public void remove(Student student) {
			
	}

	@Override
	public void removeFromIndex(int index) {
	
	}

	@Override
	public void removeFromElement(Student student) {
			
	}

	@Override
	public void removeToIndex(int index) {
			
	}

	@Override
	public void removeToElement(Student student) {
		


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
