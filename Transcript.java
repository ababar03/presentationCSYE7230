/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 76 "model.ump"
// line 309 "model.ump"
// line 350 "model.ump"
// line 396 "model.ump"
// line 452 "model.ump"
// line 504 "model.ump"
// line 601 "model.ump"
public class Transcript
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Transcript Attributes
  private int transcriptNumber;

  //Transcript Associations
  private List<StudentCourseRegistry> studentCourseRegistries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Transcript(int aTranscriptNumber)
  {
    transcriptNumber = aTranscriptNumber;
    studentCourseRegistries = new ArrayList<StudentCourseRegistry>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTranscriptNumber(int aTranscriptNumber)
  {
    boolean wasSet = false;
    transcriptNumber = aTranscriptNumber;
    wasSet = true;
    return wasSet;
  }

  public int getTranscriptNumber()
  {
    return transcriptNumber;
  }
  /* Code from template association_GetMany */
  public StudentCourseRegistry getStudentCourseRegistry(int index)
  {
    StudentCourseRegistry aStudentCourseRegistry = studentCourseRegistries.get(index);
    return aStudentCourseRegistry;
  }

  public List<StudentCourseRegistry> getStudentCourseRegistries()
  {
    List<StudentCourseRegistry> newStudentCourseRegistries = Collections.unmodifiableList(studentCourseRegistries);
    return newStudentCourseRegistries;
  }

  public int numberOfStudentCourseRegistries()
  {
    int number = studentCourseRegistries.size();
    return number;
  }

  public boolean hasStudentCourseRegistries()
  {
    boolean has = studentCourseRegistries.size() > 0;
    return has;
  }

  public int indexOfStudentCourseRegistry(StudentCourseRegistry aStudentCourseRegistry)
  {
    int index = studentCourseRegistries.indexOf(aStudentCourseRegistry);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudentCourseRegistries()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addStudentCourseRegistry(StudentCourseRegistry aStudentCourseRegistry)
  {
    boolean wasAdded = false;
    if (studentCourseRegistries.contains(aStudentCourseRegistry)) { return false; }
    studentCourseRegistries.add(aStudentCourseRegistry);
    if (aStudentCourseRegistry.indexOfTranscript(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentCourseRegistry.addTranscript(this);
      if (!wasAdded)
      {
        studentCourseRegistries.remove(aStudentCourseRegistry);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeStudentCourseRegistry(StudentCourseRegistry aStudentCourseRegistry)
  {
    boolean wasRemoved = false;
    if (!studentCourseRegistries.contains(aStudentCourseRegistry))
    {
      return wasRemoved;
    }

    int oldIndex = studentCourseRegistries.indexOf(aStudentCourseRegistry);
    studentCourseRegistries.remove(oldIndex);
    if (aStudentCourseRegistry.indexOfTranscript(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentCourseRegistry.removeTranscript(this);
      if (!wasRemoved)
      {
        studentCourseRegistries.add(oldIndex,aStudentCourseRegistry);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentCourseRegistryAt(StudentCourseRegistry aStudentCourseRegistry, int index)
  {  
    boolean wasAdded = false;
    if(addStudentCourseRegistry(aStudentCourseRegistry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentCourseRegistries()) { index = numberOfStudentCourseRegistries() - 1; }
      studentCourseRegistries.remove(aStudentCourseRegistry);
      studentCourseRegistries.add(index, aStudentCourseRegistry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentCourseRegistryAt(StudentCourseRegistry aStudentCourseRegistry, int index)
  {
    boolean wasAdded = false;
    if(studentCourseRegistries.contains(aStudentCourseRegistry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentCourseRegistries()) { index = numberOfStudentCourseRegistries() - 1; }
      studentCourseRegistries.remove(aStudentCourseRegistry);
      studentCourseRegistries.add(index, aStudentCourseRegistry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentCourseRegistryAt(aStudentCourseRegistry, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<StudentCourseRegistry> copyOfStudentCourseRegistries = new ArrayList<StudentCourseRegistry>(studentCourseRegistries);
    studentCourseRegistries.clear();
    for(StudentCourseRegistry aStudentCourseRegistry : copyOfStudentCourseRegistries)
    {
      aStudentCourseRegistry.removeTranscript(this);
    }
  }

  // line 81 "model.ump"
   public String getGradesFromAllCourses(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "transcriptNumber" + ":" + getTranscriptNumber()+ "]";
  }
}