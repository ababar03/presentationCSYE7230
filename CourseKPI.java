/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/



// line 141 "model.ump"
// line 545 "model.ump"
// line 621 "model.ump"
public class CourseKPI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseKPI Attributes
  private int courseKPI;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseKPI(int aCourseKPI)
  {
    courseKPI = aCourseKPI;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCourseKPI(int aCourseKPI)
  {
    boolean wasSet = false;
    courseKPI = aCourseKPI;
    wasSet = true;
    return wasSet;
  }

  public int getCourseKPI()
  {
    return courseKPI;
  }

  public void delete()
  {}

  // line 146 "model.ump"
   public void calculateCourseKPI(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "courseKPI" + ":" + getCourseKPI()+ "]";
  }
}