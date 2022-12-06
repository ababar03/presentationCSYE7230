/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 189 "model.ump"
// line 566 "model.ump"
// line 642 "model.ump"
public class Department
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Department Attributes
  private String departmentName;
  private int departmentID;

  //Department Associations
  private List<College> colleges;
  private List<CourseSchedule> courseSchedules;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Department(String aDepartmentName, int aDepartmentID)
  {
    departmentName = aDepartmentName;
    departmentID = aDepartmentID;
    colleges = new ArrayList<College>();
    courseSchedules = new ArrayList<CourseSchedule>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDepartmentName(String aDepartmentName)
  {
    boolean wasSet = false;
    departmentName = aDepartmentName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDepartmentID(int aDepartmentID)
  {
    boolean wasSet = false;
    departmentID = aDepartmentID;
    wasSet = true;
    return wasSet;
  }

  public String getDepartmentName()
  {
    return departmentName;
  }

  public int getDepartmentID()
  {
    return departmentID;
  }
  /* Code from template association_GetMany */
  public College getCollege(int index)
  {
    College aCollege = colleges.get(index);
    return aCollege;
  }

  public List<College> getColleges()
  {
    List<College> newColleges = Collections.unmodifiableList(colleges);
    return newColleges;
  }

  public int numberOfColleges()
  {
    int number = colleges.size();
    return number;
  }

  public boolean hasColleges()
  {
    boolean has = colleges.size() > 0;
    return has;
  }

  public int indexOfCollege(College aCollege)
  {
    int index = colleges.indexOf(aCollege);
    return index;
  }
  /* Code from template association_GetMany */
  public CourseSchedule getCourseSchedule(int index)
  {
    CourseSchedule aCourseSchedule = courseSchedules.get(index);
    return aCourseSchedule;
  }

  public List<CourseSchedule> getCourseSchedules()
  {
    List<CourseSchedule> newCourseSchedules = Collections.unmodifiableList(courseSchedules);
    return newCourseSchedules;
  }

  public int numberOfCourseSchedules()
  {
    int number = courseSchedules.size();
    return number;
  }

  public boolean hasCourseSchedules()
  {
    boolean has = courseSchedules.size() > 0;
    return has;
  }

  public int indexOfCourseSchedule(CourseSchedule aCourseSchedule)
  {
    int index = courseSchedules.indexOf(aCourseSchedule);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfColleges()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCollege(College aCollege)
  {
    boolean wasAdded = false;
    if (colleges.contains(aCollege)) { return false; }
    colleges.add(aCollege);
    if (aCollege.indexOfDepartment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCollege.addDepartment(this);
      if (!wasAdded)
      {
        colleges.remove(aCollege);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCollege(College aCollege)
  {
    boolean wasRemoved = false;
    if (!colleges.contains(aCollege))
    {
      return wasRemoved;
    }

    int oldIndex = colleges.indexOf(aCollege);
    colleges.remove(oldIndex);
    if (aCollege.indexOfDepartment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCollege.removeDepartment(this);
      if (!wasRemoved)
      {
        colleges.add(oldIndex,aCollege);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCollegeAt(College aCollege, int index)
  {  
    boolean wasAdded = false;
    if(addCollege(aCollege))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfColleges()) { index = numberOfColleges() - 1; }
      colleges.remove(aCollege);
      colleges.add(index, aCollege);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCollegeAt(College aCollege, int index)
  {
    boolean wasAdded = false;
    if(colleges.contains(aCollege))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfColleges()) { index = numberOfColleges() - 1; }
      colleges.remove(aCollege);
      colleges.add(index, aCollege);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCollegeAt(aCollege, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCourseSchedules()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCourseSchedule(CourseSchedule aCourseSchedule)
  {
    boolean wasAdded = false;
    if (courseSchedules.contains(aCourseSchedule)) { return false; }
    courseSchedules.add(aCourseSchedule);
    if (aCourseSchedule.indexOfDepartment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCourseSchedule.addDepartment(this);
      if (!wasAdded)
      {
        courseSchedules.remove(aCourseSchedule);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCourseSchedule(CourseSchedule aCourseSchedule)
  {
    boolean wasRemoved = false;
    if (!courseSchedules.contains(aCourseSchedule))
    {
      return wasRemoved;
    }

    int oldIndex = courseSchedules.indexOf(aCourseSchedule);
    courseSchedules.remove(oldIndex);
    if (aCourseSchedule.indexOfDepartment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCourseSchedule.removeDepartment(this);
      if (!wasRemoved)
      {
        courseSchedules.add(oldIndex,aCourseSchedule);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCourseScheduleAt(CourseSchedule aCourseSchedule, int index)
  {  
    boolean wasAdded = false;
    if(addCourseSchedule(aCourseSchedule))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCourseSchedules()) { index = numberOfCourseSchedules() - 1; }
      courseSchedules.remove(aCourseSchedule);
      courseSchedules.add(index, aCourseSchedule);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCourseScheduleAt(CourseSchedule aCourseSchedule, int index)
  {
    boolean wasAdded = false;
    if(courseSchedules.contains(aCourseSchedule))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCourseSchedules()) { index = numberOfCourseSchedules() - 1; }
      courseSchedules.remove(aCourseSchedule);
      courseSchedules.add(index, aCourseSchedule);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCourseScheduleAt(aCourseSchedule, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<College> copyOfColleges = new ArrayList<College>(colleges);
    colleges.clear();
    for(College aCollege : copyOfColleges)
    {
      aCollege.removeDepartment(this);
    }
    ArrayList<CourseSchedule> copyOfCourseSchedules = new ArrayList<CourseSchedule>(courseSchedules);
    courseSchedules.clear();
    for(CourseSchedule aCourseSchedule : copyOfCourseSchedules)
    {
      aCourseSchedule.removeDepartment(this);
    }
  }

  // line 196 "model.ump"
   public String registerStudentForCourses(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "departmentName" + ":" + getDepartmentName()+ "," +
            "departmentID" + ":" + getDepartmentID()+ "]";
  }
}