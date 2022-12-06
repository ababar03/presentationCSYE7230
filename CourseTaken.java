/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 106 "model.ump"
// line 532 "model.ump"
// line 611 "model.ump"
public class CourseTaken
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CourseTaken Attributes
  private String semester;
  private int courseCount;

  //CourseTaken Associations
  private List<SeatAssigned> seatAssigneds;
  private List<CourseSchedule> courseSchedules;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CourseTaken(String aSemester, int aCourseCount)
  {
    semester = aSemester;
    courseCount = aCourseCount;
    seatAssigneds = new ArrayList<SeatAssigned>();
    courseSchedules = new ArrayList<CourseSchedule>();
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

  public boolean setCourseCount(int aCourseCount)
  {
    boolean wasSet = false;
    courseCount = aCourseCount;
    wasSet = true;
    return wasSet;
  }

  public String getSemester()
  {
    return semester;
  }

  public int getCourseCount()
  {
    return courseCount;
  }
  /* Code from template association_GetMany */
  public SeatAssigned getSeatAssigned(int index)
  {
    SeatAssigned aSeatAssigned = seatAssigneds.get(index);
    return aSeatAssigned;
  }

  public List<SeatAssigned> getSeatAssigneds()
  {
    List<SeatAssigned> newSeatAssigneds = Collections.unmodifiableList(seatAssigneds);
    return newSeatAssigneds;
  }

  public int numberOfSeatAssigneds()
  {
    int number = seatAssigneds.size();
    return number;
  }

  public boolean hasSeatAssigneds()
  {
    boolean has = seatAssigneds.size() > 0;
    return has;
  }

  public int indexOfSeatAssigned(SeatAssigned aSeatAssigned)
  {
    int index = seatAssigneds.indexOf(aSeatAssigned);
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
  public static int minimumNumberOfSeatAssigneds()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSeatAssigned(SeatAssigned aSeatAssigned)
  {
    boolean wasAdded = false;
    if (seatAssigneds.contains(aSeatAssigned)) { return false; }
    seatAssigneds.add(aSeatAssigned);
    if (aSeatAssigned.indexOfCourseTaken(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSeatAssigned.addCourseTaken(this);
      if (!wasAdded)
      {
        seatAssigneds.remove(aSeatAssigned);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSeatAssigned(SeatAssigned aSeatAssigned)
  {
    boolean wasRemoved = false;
    if (!seatAssigneds.contains(aSeatAssigned))
    {
      return wasRemoved;
    }

    int oldIndex = seatAssigneds.indexOf(aSeatAssigned);
    seatAssigneds.remove(oldIndex);
    if (aSeatAssigned.indexOfCourseTaken(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSeatAssigned.removeCourseTaken(this);
      if (!wasRemoved)
      {
        seatAssigneds.add(oldIndex,aSeatAssigned);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSeatAssignedAt(SeatAssigned aSeatAssigned, int index)
  {  
    boolean wasAdded = false;
    if(addSeatAssigned(aSeatAssigned))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSeatAssigneds()) { index = numberOfSeatAssigneds() - 1; }
      seatAssigneds.remove(aSeatAssigned);
      seatAssigneds.add(index, aSeatAssigned);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSeatAssignedAt(SeatAssigned aSeatAssigned, int index)
  {
    boolean wasAdded = false;
    if(seatAssigneds.contains(aSeatAssigned))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSeatAssigneds()) { index = numberOfSeatAssigneds() - 1; }
      seatAssigneds.remove(aSeatAssigned);
      seatAssigneds.add(index, aSeatAssigned);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSeatAssignedAt(aSeatAssigned, index);
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
    if (aCourseSchedule.indexOfCourseTaken(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCourseSchedule.addCourseTaken(this);
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
    if (aCourseSchedule.indexOfCourseTaken(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCourseSchedule.removeCourseTaken(this);
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
    ArrayList<SeatAssigned> copyOfSeatAssigneds = new ArrayList<SeatAssigned>(seatAssigneds);
    seatAssigneds.clear();
    for(SeatAssigned aSeatAssigned : copyOfSeatAssigneds)
    {
      aSeatAssigned.removeCourseTaken(this);
    }
    ArrayList<CourseSchedule> copyOfCourseSchedules = new ArrayList<CourseSchedule>(courseSchedules);
    courseSchedules.clear();
    for(CourseSchedule aCourseSchedule : copyOfCourseSchedules)
    {
      aCourseSchedule.removeCourseTaken(this);
    }
  }

  // line 113 "model.ump"
   public String getMaximumCoursesForSem(){
    
  }

  // line 116 "model.ump"
   public String getSemesterDetails(){
    
  }

  // line 119 "model.ump"
   public String getMinCoursesForSemester(){
    
  }

  // line 122 "model.ump"
   public String getStudentCourseCapacity(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "semester" + ":" + getSemester()+ "," +
            "courseCount" + ":" + getCourseCount()+ "]";
  }
}