/***  * Faculty class implementation  * @author Your Name  *  */
public class Faculty {
    //all instance variables
private int id;
private String name;
private String rank;
public Faculty(int id, String name, String rank) {
    //constructor
    super();
    this.id = id;
    this.name = name;
    this.rank = rank;
} 	//all getters and setters
public int getId() {
return id;
} 	public void setId(int id) {
    this.id = id;
} 	public String getName() {
    return name;
} 	public void setName(String name) {
    this.name = name;
} 	public String getRank() {
    return rank;
} 	public void setRank(String rank) {
    this.rank = rank;
 }
}
 