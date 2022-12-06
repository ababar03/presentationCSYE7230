/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 62 "model.ump"
// line 296 "model.ump"
// line 340 "model.ump"
// line 386 "model.ump"
// line 442 "model.ump"
// line 494 "model.ump"
// line 591 "model.ump"
public class StudentKPI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentKPI Attributes
  private int studentKPI;

  //StudentKPI Associations
  private List<Student> students;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentKPI(int aStudentKPI)
  {
    studentKPI = aStudentKPI;
    students = new ArrayList<Student>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStudentKPI(int aStudentKPI)
  {
    boolean wasSet = false;
    studentKPI = aStudentKPI;
    wasSet = true;
    return wasSet;
  }

  public int getStudentKPI()
  {
    return studentKPI;
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
    if (aStudent.indexOfStudentKPI(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudent.addStudentKPI(this);
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
    if (aStudent.indexOfStudentKPI(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudent.removeStudentKPI(this);
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

  public void delete()
  {
    ArrayList<Student> copyOfStudents = new ArrayList<Student>(students);
    students.clear();
    for(Student aStudent : copyOfStudents)
    {
      aStudent.removeStudentKPI(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "studentKPI" + ":" + getStudentKPI()+ "]";
  }
}