/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 125 "model.ump"
// line 538 "model.ump"
// line 616 "model.ump"
public class CourseSchedule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseSchedule Attributes
  private String semester;

  //CourseSchedule Associations
  private List<CourseTaken> courseTakens;
  private List<Department> departments;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseSchedule(String aSemester)
  {
    semester = aSemester;
    courseTakens = new ArrayList<CourseTaken>();
    departments = new ArrayList<Department>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSemester(String aSemester)
  {
    boolean wasSet = false;
    semester = aSemester;
    wasSet = true;
    return wasSet;
  }

  public String getSemester()
  {
    return semester;
  }
  /* Code from template association_GetMany */
  public CourseTaken getCourseTaken(int index)
  {
    CourseTaken aCourseTaken = courseTakens.get(index);
    return aCourseTaken;
  }

  public List<CourseTaken> getCourseTakens()
  {
    List<CourseTaken> newCourseTakens = Collections.unmodifiableList(courseTakens);
    return newCourseTakens;
  }

  public int numberOfCourseTakens()
  {
    int number = courseTakens.size();
    return number;
  }

  public boolean hasCourseTakens()
  {
    boolean has = courseTakens.size() > 0;
    return has;
  }

  public int indexOfCourseTaken(CourseTaken aCourseTaken)
  {
    int index = courseTakens.indexOf(aCourseTaken);
    return index;
  }
  /* Code from template association_GetMany */
  public Department getDepartment(int index)
  {
    Department aDepartment = departments.get(index);
    return aDepartment;
  }

  public List<Department> getDepartments()
  {
    List<Department> newDepartments = Collections.unmodifiableList(departments);
    return newDepartments;
  }

  public int numberOfDepartments()
  {
    int number = departments.size();
    return number;
  }

  public boolean hasDepartments()
  {
    boolean has = departments.size() > 0;
    return has;
  }

  public int indexOfDepartment(Department aDepartment)
  {
    int index = departments.indexOf(aDepartment);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCourseTakens()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCourseTaken(CourseTaken aCourseTaken)
  {
    boolean wasAdded = false;
    if (courseTakens.contains(aCourseTaken)) { return false; }
    courseTakens.add(aCourseTaken);
    if (aCourseTaken.indexOfCourseSchedule(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCourseTaken.addCourseSchedule(this);
      if (!wasAdded)
      {
        courseTakens.remove(aCourseTaken);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCourseTaken(CourseTaken aCourseTaken)
  {
    boolean wasRemoved = false;
    if (!courseTakens.contains(aCourseTaken))
    {
      return wasRemoved;
    }

    int oldIndex = courseTakens.indexOf(aCourseTaken);
    courseTakens.remove(oldIndex);
    if (aCourseTaken.indexOfCourseSchedule(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCourseTaken.removeCourseSchedule(this);
      if (!wasRemoved)
      {
        courseTakens.add(oldIndex,aCourseTaken);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCourseTakenAt(CourseTaken aCourseTaken, int index)
  {  
    boolean wasAdded = false;
    if(addCourseTaken(aCourseTaken))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCourseTakens()) { index = numberOfCourseTakens() - 1; }
      courseTakens.remove(aCourseTaken);
      courseTakens.add(index, aCourseTaken);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCourseTakenAt(CourseTaken aCourseTaken, int index)
  {
    boolean wasAdded = false;
    if(courseTakens.contains(aCourseTaken))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCourseTakens()) { index = numberOfCourseTakens() - 1; }
      courseTakens.remove(aCourseTaken);
      courseTakens.add(index, aCourseTaken);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCourseTakenAt(aCourseTaken, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDepartments()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addDepartment(Department aDepartment)
  {
    boolean wasAdded = false;
    if (departments.contains(aDepartment)) { return false; }
    departments.add(aDepartment);
    if (aDepartment.indexOfCourseSchedule(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDepartment.addCourseSchedule(this);
      if (!wasAdded)
      {
        departments.remove(aDepartment);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeDepartment(Department aDepartment)
  {
    boolean wasRemoved = false;
    if (!departments.contains(aDepartment))
    {
      return wasRemoved;
    }

    int oldIndex = departments.indexOf(aDepartment);
    departments.remove(oldIndex);
    if (aDepartment.indexOfCourseSchedule(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDepartment.removeCourseSchedule(this);
      if (!wasRemoved)
      {
        departments.add(oldIndex,aDepartment);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDepartmentAt(Department aDepartment, int index)
  {  
    boolean wasAdded = false;
    if(addDepartment(aDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepartments()) { index = numberOfDepartments() - 1; }
      departments.remove(aDepartment);
      departments.add(index, aDepartment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDepartmentAt(Department aDepartment, int index)
  {
    boolean wasAdded = false;
    if(departments.contains(aDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDepartments()) { index = numberOfDepartments() - 1; }
      departments.remove(aDepartment);
      departments.add(index, aDepartment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDepartmentAt(aDepartment, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<CourseTaken> copyOfCourseTakens = new ArrayList<CourseTaken>(courseTakens);
    courseTakens.clear();
    for(CourseTaken aCourseTaken : copyOfCourseTakens)
    {
      aCourseTaken.removeCourseSchedule(this);
    }
    ArrayList<Department> copyOfDepartments = new ArrayList<Department>(departments);
    departments.clear();
    for(Department aDepartment : copyOfDepartments)
    {
      aDepartment.removeCourseSchedule(this);
    }
  }

  // line 132 "model.ump"
   public Stri getAllCoursesSchedule(){
    
  }

  // line 135 "model.ump"
   public void getCourseByDepartment(){
    
  }

  // line 138 "model.ump"
   public void getCourseBySemester(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "semester" + ":" + getSemester()+ "]";
  }
}