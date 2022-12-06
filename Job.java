/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 253 "model.ump"
// line 677 "model.ump"
public class Job
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Job Attributes
  private String jobsName;
  private int jobsID;

  //Job Associations
  private List<StudentEmploymentInfo> studentEmploymentInfos;
  private List<StudentCourseRegistry> studentCourseRegistries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Job(String aJobsName, int aJobsID)
  {
    jobsName = aJobsName;
    jobsID = aJobsID;
    studentEmploymentInfos = new ArrayList<StudentEmploymentInfo>();
    studentCourseRegistries = new ArrayList<StudentCourseRegistry>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setJobsName(String aJobsName)
  {
    boolean wasSet = false;
    jobsName = aJobsName;
    wasSet = true;
    return wasSet;
  }

  public boolean setJobsID(int aJobsID)
  {
    boolean wasSet = false;
    jobsID = aJobsID;
    wasSet = true;
    return wasSet;
  }

  public String getJobsName()
  {
    return jobsName;
  }

  public int getJobsID()
  {
    return jobsID;
  }
  /* Code from template association_GetMany */
  public StudentEmploymentInfo getStudentEmploymentInfo(int index)
  {
    StudentEmploymentInfo aStudentEmploymentInfo = studentEmploymentInfos.get(index);
    return aStudentEmploymentInfo;
  }

  public List<StudentEmploymentInfo> getStudentEmploymentInfos()
  {
    List<StudentEmploymentInfo> newStudentEmploymentInfos = Collections.unmodifiableList(studentEmploymentInfos);
    return newStudentEmploymentInfos;
  }

  public int numberOfStudentEmploymentInfos()
  {
    int number = studentEmploymentInfos.size();
    return number;
  }

  public boolean hasStudentEmploymentInfos()
  {
    boolean has = studentEmploymentInfos.size() > 0;
    return has;
  }

  public int indexOfStudentEmploymentInfo(StudentEmploymentInfo aStudentEmploymentInfo)
  {
    int index = studentEmploymentInfos.indexOf(aStudentEmploymentInfo);
    return index;
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
  public static int minimumNumberOfStudentEmploymentInfos()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addStudentEmploymentInfo(StudentEmploymentInfo aStudentEmploymentInfo)
  {
    boolean wasAdded = false;
    if (studentEmploymentInfos.contains(aStudentEmploymentInfo)) { return false; }
    studentEmploymentInfos.add(aStudentEmploymentInfo);
    if (aStudentEmploymentInfo.indexOfJob(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentEmploymentInfo.addJob(this);
      if (!wasAdded)
      {
        studentEmploymentInfos.remove(aStudentEmploymentInfo);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeStudentEmploymentInfo(StudentEmploymentInfo aStudentEmploymentInfo)
  {
    boolean wasRemoved = false;
    if (!studentEmploymentInfos.contains(aStudentEmploymentInfo))
    {
      return wasRemoved;
    }

    int oldIndex = studentEmploymentInfos.indexOf(aStudentEmploymentInfo);
    studentEmploymentInfos.remove(oldIndex);
    if (aStudentEmploymentInfo.indexOfJob(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentEmploymentInfo.removeJob(this);
      if (!wasRemoved)
      {
        studentEmploymentInfos.add(oldIndex,aStudentEmploymentInfo);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentEmploymentInfoAt(StudentEmploymentInfo aStudentEmploymentInfo, int index)
  {  
    boolean wasAdded = false;
    if(addStudentEmploymentInfo(aStudentEmploymentInfo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentEmploymentInfos()) { index = numberOfStudentEmploymentInfos() - 1; }
      studentEmploymentInfos.remove(aStudentEmploymentInfo);
      studentEmploymentInfos.add(index, aStudentEmploymentInfo);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentEmploymentInfoAt(StudentEmploymentInfo aStudentEmploymentInfo, int index)
  {
    boolean wasAdded = false;
    if(studentEmploymentInfos.contains(aStudentEmploymentInfo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentEmploymentInfos()) { index = numberOfStudentEmploymentInfos() - 1; }
      studentEmploymentInfos.remove(aStudentEmploymentInfo);
      studentEmploymentInfos.add(index, aStudentEmploymentInfo);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentEmploymentInfoAt(aStudentEmploymentInfo, index);
    }
    return wasAdded;
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
    if (aStudentCourseRegistry.indexOfJob(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentCourseRegistry.addJob(this);
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
    if (aStudentCourseRegistry.indexOfJob(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentCourseRegistry.removeJob(this);
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
    ArrayList<StudentEmploymentInfo> copyOfStudentEmploymentInfos = new ArrayList<StudentEmploymentInfo>(studentEmploymentInfos);
    studentEmploymentInfos.clear();
    for(StudentEmploymentInfo aStudentEmploymentInfo : copyOfStudentEmploymentInfos)
    {
      aStudentEmploymentInfo.removeJob(this);
    }
    ArrayList<StudentCourseRegistry> copyOfStudentCourseRegistries = new ArrayList<StudentCourseRegistry>(studentCourseRegistries);
    studentCourseRegistries.clear();
    for(StudentCourseRegistry aStudentCourseRegistry : copyOfStudentCourseRegistries)
    {
      aStudentCourseRegistry.removeJob(this);
    }
  }

  // line 261 "model.ump"
   public String getJobSalary(){
    
  }

  // line 264 "model.ump"
   public String getJobDetails(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "jobsName" + ":" + getJobsName()+ "," +
            "jobsID" + ":" + getJobsID()+ "]";
  }
}