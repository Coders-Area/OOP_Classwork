class Course {

    //all instance variables
    private String courseID;
   private String title;
   private int numberOfStudents;
   private Student[] student; //array of students
  	private Faculty faculty; //faculty teaching this course

     public Course() { //no arg constructor
          super();
          courseID="";
          title="";
          student=new Student[25];
     }
     public Course(String courseID, String title) {
         //parameterized constructor
         super();
         this.courseID = courseID;
         this.title = title;
         student=new Student[25];
     } 	//enroll a student to this course
    	public void addStudent(Student student) {
         if(numberOfStudents>=this.student.length)
             return ;
         this.student[numberOfStudents++]=student; 	}
    //drop a student from this course
    public void dropStudent(Student student) {
         int i=0;
         for(i=0;i<numberOfStudents;i++) {
             if(this.student[i].getId()==student.getId()) {
                 break;
             }
         } 		for(int j=i;j<numberOfStudents-1;j++) {
             this.student[j]=this.student[j+1];
         }
         this.student[numberOfStudents-1]=null;
         numberOfStudents--;
     }

    //getter and setters
    public Faculty getFaculty() {
         return faculty;
     }
     public void setFaculty(Faculty faculty) {
         this.faculty = faculty;
     }
     public int getNumberOfStudents() {
         return numberOfStudents;
     } 	public Student[] getStudent() {
         return student;
     }

    public String toString() {
         String s="";
         s=s+"Course ID : "+this.courseID+"\n";
         s=s+"Course Title : "+this.title+"\n";
         s=s+"Number of Students : "+this.numberOfStudents+"\n";
         s=s+"Faculty Details : "+this.faculty.getId()+" "+this.faculty.getName()+" "+this.faculty.getRank()+"\n";
         s=s+"Student Details : \n"; 		 		for(int i=0;i<numberOfStudents;i++)
         { 			s=s+"\tID : "+this.student[i].getId()+"\n";
             s=s+"\tName : "+this.student[i].getName()+"\n";
             s=s+"\tMajor : "+this.student[i].getMajor()+"\n";
         }
        return s;
     }
}


