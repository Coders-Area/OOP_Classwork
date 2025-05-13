/***  * Student class Implementation   * @author Your Name  *  */
public class Student {
    //all instance variables
private int id;
private String name;
private String major;
public Student(int id, String name, String major)
{ //constructor
     	super();
         this.id = id;
         this.name = name;
         this.major = major; 	}
//all getters and setters
    public int getId() {
    return id;
    }
    public void setId(int id) {
    this.id = id;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
    return major;
    }
    public void setMajor(String major) {
    this.major = major;
    }
}