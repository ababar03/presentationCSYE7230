/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 68 "model.ump"
// line 303 "model.ump"
// line 345 "model.ump"
// line 391 "model.ump"
// line 447 "model.ump"
// line 499 "model.ump"
// line 596 "model.ump"
public class SeatAssigned
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SeatAssigned Attributes
  private int seatNumber;
  private String courseInfo;
  private String studentInfo;

  //SeatAssigned Associations
  private List<Student> students;
  private List<CourseTaken> courseTakens;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SeatAssigned(int aSeatNumber, String aCourseInfo, String aStudentInfo)
  {
    seatNumber = aSeatNumber;
    courseInfo = aCourseInfo;
    studentInfo = aStudentInfo;
    students = new ArrayList<Student>();
    courseTakens = new ArrayList<CourseTaken>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSeatNumber(int aSeatNumber)
  {
    boolean wasSet = false;
    seatNumber = aSeatNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setCourseInfo(String aCourseInfo)
  {
    boolean wasSet = false;
    courseInfo = aCourseInfo;
    wasSet = true;
    return wasSet;
  }

  public boolean setStudentInfo(String aStudentInfo)
  {
    boolean wasSet = false;
    studentInfo = aStudentInfo;
    wasSet = true;
    return wasSet;
  }

  public int getSeatNumber()
  {
    return seatNumber;
  }

  public String getCourseInfo()
  {
    return courseInfo;
  }

  public String getStudentInfo()
  {
    return studentInfo;
  }
  /* Code from template association_GetMany */
  public Student getStudent(int index)
  {
    Student aStudent = students.get(index);
    return aStudent;
  }

  public List<Student> getStudents()
  {
    List<Student> newStudents = Collections.unmodifiableList(students);
    return newStudents;
  }

  public int numberOfStudents()
  {
    int number = students.size();
    return number;
  }

  public boolean hasStudents()
  {
    boolean has = students.size() > 0;
    return has;
  }

  public int indexOfStudent(Student aStudent)
  {
    int index = students.indexOf(aStudent);
    return index;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudents()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addStudent(Student aStudent)
  {
    boolean wasAdded = false;
    if (students.contains(aStudent)) { return false; }
    students.add(aStudent);
    if (aStudent.indexOfSeatAssigned(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudent.addSeatAssigned(this);
      if (!wasAdded)
      {
        students.remove(aStudent);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeStudent(Student aStudent)
  {
    boolean wasRemoved = false;
    if (!students.contains(aStudent))
    {
      return wasRemoved;
    }

    int oldIndex = students.indexOf(aStudent);
    students.remove(oldIndex);
    if (aStudent.indexOfSeatAssigned(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudent.removeSeatAssigned(this);
      if (!wasRemoved)
      {
        students.add(oldIndex,aStudent);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentAt(Student aStudent, int index)
  {  
    boolean wasAdded = false;
    if(addStudent(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentAt(Student aStudent, int index)
  {
    boolean wasAdded = false;
    if(students.contains(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentAt(aStudent, index);
    }
    return wasAdded;
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
    if (aCourseTaken.indexOfSeatAssigned(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCourseTaken.addSeatAssigned(this);
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
    if (aCourseTaken.indexOfSeatAssigned(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCourseTaken.removeSeatAssigned(this);
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

  public void delete()
  {
    ArrayList<Student> copyOfStudents = new ArrayList<Student>(students);
    students.clear();
    for(Student aStudent : copyOfStudents)
    {
      aStudent.removeSeatAssigned(this);
    }
    ArrayList<CourseTaken> copyOfCourseTakens = new ArrayList<CourseTaken>(courseTakens);
    courseTakens.clear();
    for(CourseTaken aCourseTaken : copyOfCourseTakens)
    {
      aCourseTaken.removeSeatAssigned(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "seatNumber" + ":" + getSeatNumber()+ "," +
            "courseInfo" + ":" + getCourseInfo()+ "," +
            "studentInfo" + ":" + getStudentInfo()+ "]";
  }
}