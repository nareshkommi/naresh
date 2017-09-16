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

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
          int i=this.students.lenght;
		  for(int j=i;j>0;j--)
			  this.student[i]=this.students[j-1];
		  this.students[0]=student;
		  this.student[i+1]=null;
		  }

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	    int i=this.students.length;
		this.students[i]=student;
		this.students[i+1]=null;
		}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	 int i=this.students.length;
	 for(int j=i;j>index;j--)
		 this.students[index]=student;
	 this.students[i+1]=null;

	 }

	@Override
	public void remove(int index) {
		// Add your implementation here
	int i=this.students.length;
	for(int j=index;j<i;j++)
		this.students[j]=this.students[j+1];
	this.students[i+1]=null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	int i=this.student.length;
	int index=0;
	for(int j=0;j<0;j++)
		if(int j=0;j<i;j++)
		if(this.students[j].equals(student))
		{
		index=j;
		break;
		}
		for(int j=index;j<i;j++)
			this.students[j]=this.students[i+1];
		this.students[i+1]=null;

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	int i=this.students.length;
//this.students[index]=this.students[i];
this.students[index]=null;

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
int i=this.students.length;
int index=0;
for(j=0;j<i;j+=)
	if(thiis.students[j]).equals(student))
		{
	index=j;
	break;
		}
		//this.students[index]=this.students[i];
		this.students[index]=null;
	
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	int j=this.students.length;
	for(int i=0;i<=j;index;i++)
		this.students[i]=this.students[i+index+1];
	this.students[j+1]=null;

	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	int i=this.students.length;
	int index=0;
	for(int j=0;j<i;j++)
		if(this.students[j]).equals(student))
		{
		index=j;
		break;
		}
		int j=this.students.length;
		for(i=0;i<=j;index;i++)
			this.students[i]=this.students[i+index+1]
			this.students[i+1]=null;

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		/+int n=this.students.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
			if((this.students[j]).isGreaterthan(this.students[j+1]))
		{
			student student=new student[i];
			this.students[i]=this.students[j];
			this.students[j]=student;
		}*/
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
		/*int L=this.students.length;
		int max=this.students[o].avgmark;
		for(int i=0;i<l;i++)
		if(this.students[i}.avgmark;
		student students1[]=new student();
		int k=0;
		for(int j=0;j<n;j++)
		if(this.students[i].avgmark==max)
		students1[k++}=this.students[i];
	}
	*/
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
	 int i=this.students.length;
	 int index1=0;
	 for(int j=0;j<i;j++)
		 if((this.students[j]).equals(student))
		{
		 index1=j;
		 break;
		}
		return this.students{index1=1]
		return null;
	}
}
