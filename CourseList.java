/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/



// line 149 "model.ump"
// line 550 "model.ump"
// line 626 "model.ump"
public class CourseList
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseList Attributes
  private int courseID;
  private String courseName;
  private int courseRating;
  private int creditHours;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseList(int aCourseID, String aCourseName, int aCourseRating, int aCreditHours)
  {
    courseID = aCourseID;
    courseName = aCourseName;
    courseRating = aCourseRating;
    creditHours = aCreditHours;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCourseID(int aCourseID)
  {
    boolean wasSet = false;
    courseID = aCourseID;
    wasSet = true;
    return wasSet;
  }

  public boolean setCourseName(String aCourseName)
  {
    boolean wasSet = false;
    courseName = aCourseName;
    wasSet = true;
    return wasSet;
  }

  public boolean setCourseRating(int aCourseRating)
  {
    boolean wasSet = false;
    courseRating = aCourseRating;
    wasSet = true;
    return wasSet;
  }

  public boolean setCreditHours(int aCreditHours)
  {
    boolean wasSet = false;
    creditHours = aCreditHours;
    wasSet = true;
    return wasSet;
  }

  public int getCourseID()
  {
    return courseID;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getCourseRating()
  {
    return courseRating;
  }

  public int getCreditHours()
  {
    return creditHours;
  }

  public void delete()
  {}

  // line 157 "model.ump"
   public String getCoursebyID(courseID arg0){
    
  }

  // line 160 "model.ump"
   public String getCoursebyName(courseName arg0){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "courseID" + ":" + getCourseID()+ "," +
            "courseName" + ":" + getCourseName()+ "," +
            "courseRating" + ":" + getCourseRating()+ "," +
            "creditHours" + ":" + getCreditHours()+ "]";
  }
}