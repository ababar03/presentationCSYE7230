/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 227 "model.ump"
// line 666 "model.ump"
public class Employer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Employer Attributes
  private String employerName;
  private String employerType;
  private String employerLocation;

  //Employer Associations
  private List<CareerDepartment> careerDepartments;
  private List<StudentEmploymentInfo> studentEmploymentInfos;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Employer(String aEmployerName, String aEmployerType, String aEmployerLocation)
  {
    employerName = aEmployerName;
    employerType = aEmployerType;
    employerLocation = aEmployerLocation;
    careerDepartments = new ArrayList<CareerDepartment>();
    studentEmploymentInfos = new ArrayList<StudentEmploymentInfo>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEmployerName(String aEmployerName)
  {
    boolean wasSet = false;
    employerName = aEmployerName;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmployerType(String aEmployerType)
  {
    boolean wasSet = false;
    employerType = aEmployerType;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmployerLocation(String aEmployerLocation)
  {
    boolean wasSet = false;
    employerLocation = aEmployerLocation;
    wasSet = true;
    return wasSet;
  }

  public String getEmployerName()
  {
    return employerName;
  }

  public String getEmployerType()
  {
    return employerType;
  }

  public String getEmployerLocation()
  {
    return employerLocation;
  }
  /* Code from template association_GetMany */
  public CareerDepartment getCareerDepartment(int index)
  {
    CareerDepartment aCareerDepartment = careerDepartments.get(index);
    return aCareerDepartment;
  }

  public List<CareerDepartment> getCareerDepartments()
  {
    List<CareerDepartment> newCareerDepartments = Collections.unmodifiableList(careerDepartments);
    return newCareerDepartments;
  }

  public int numberOfCareerDepartments()
  {
    int number = careerDepartments.size();
    return number;
  }

  public boolean hasCareerDepartments()
  {
    boolean has = careerDepartments.size() > 0;
    return has;
  }

  public int indexOfCareerDepartment(CareerDepartment aCareerDepartment)
  {
    int index = careerDepartments.indexOf(aCareerDepartment);
    return index;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCareerDepartments()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addCareerDepartment(CareerDepartment aCareerDepartment)
  {
    boolean wasAdded = false;
    if (careerDepartments.contains(aCareerDepartment)) { return false; }
    careerDepartments.add(aCareerDepartment);
    if (aCareerDepartment.indexOfEmployer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCareerDepartment.addEmployer(this);
      if (!wasAdded)
      {
        careerDepartments.remove(aCareerDepartment);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeCareerDepartment(CareerDepartment aCareerDepartment)
  {
    boolean wasRemoved = false;
    if (!careerDepartments.contains(aCareerDepartment))
    {
      return wasRemoved;
    }

    int oldIndex = careerDepartments.indexOf(aCareerDepartment);
    careerDepartments.remove(oldIndex);
    if (aCareerDepartment.indexOfEmployer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCareerDepartment.removeEmployer(this);
      if (!wasRemoved)
      {
        careerDepartments.add(oldIndex,aCareerDepartment);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCareerDepartmentAt(CareerDepartment aCareerDepartment, int index)
  {  
    boolean wasAdded = false;
    if(addCareerDepartment(aCareerDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCareerDepartments()) { index = numberOfCareerDepartments() - 1; }
      careerDepartments.remove(aCareerDepartment);
      careerDepartments.add(index, aCareerDepartment);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCareerDepartmentAt(CareerDepartment aCareerDepartment, int index)
  {
    boolean wasAdded = false;
    if(careerDepartments.contains(aCareerDepartment))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCareerDepartments()) { index = numberOfCareerDepartments() - 1; }
      careerDepartments.remove(aCareerDepartment);
      careerDepartments.add(index, aCareerDepartment);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCareerDepartmentAt(aCareerDepartment, index);
    }
    return wasAdded;
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
    if (aStudentEmploymentInfo.indexOfEmployer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentEmploymentInfo.addEmployer(this);
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
    if (aStudentEmploymentInfo.indexOfEmployer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentEmploymentInfo.removeEmployer(this);
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

  public void delete()
  {
    ArrayList<CareerDepartment> copyOfCareerDepartments = new ArrayList<CareerDepartment>(careerDepartments);
    careerDepartments.clear();
    for(CareerDepartment aCareerDepartment : copyOfCareerDepartments)
    {
      aCareerDepartment.removeEmployer(this);
    }
    while (studentEmploymentInfos.size() > 0)
    {
      StudentEmploymentInfo aStudentEmploymentInfo = studentEmploymentInfos.get(studentEmploymentInfos.size() - 1);
      aStudentEmploymentInfo.delete();
      studentEmploymentInfos.remove(aStudentEmploymentInfo);
    }
    
  }

  // line 234 "model.ump"
   public String getEmployerInfo(){
    
  }

  // line 237 "model.ump"
   public String getOpeningDetails(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "employerName" + ":" + getEmployerName()+ "," +
            "employerType" + ":" + getEmployerType()+ "," +
            "employerLocation" + ":" + getEmployerLocation()+ "]";
  }
}