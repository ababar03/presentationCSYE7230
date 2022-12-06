/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 175 "model.ump"
// line 560 "model.ump"
// line 637 "model.ump"
public class College
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //College Attributes
  private int collegeID;
  private String collegeName;
  private int collegeKPI;

  //College Associations
  private List<University> universities;
  private List<Department> departments;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public College(int aCollegeID, String aCollegeName, int aCollegeKPI)
  {
    collegeID = aCollegeID;
    collegeName = aCollegeName;
    collegeKPI = aCollegeKPI;
    universities = new ArrayList<University>();
    departments = new ArrayList<Department>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCollegeID(int aCollegeID)
  {
    boolean wasSet = false;
    collegeID = aCollegeID;
    wasSet = true;
    return wasSet;
  }

  public boolean setCollegeName(String aCollegeName)
  {
    boolean wasSet = false;
    collegeName = aCollegeName;
    wasSet = true;
    return wasSet;
  }

  public boolean setCollegeKPI(int aCollegeKPI)
  {
    boolean wasSet = false;
    collegeKPI = aCollegeKPI;
    wasSet = true;
    return wasSet;
  }

  public int getCollegeID()
  {
    return collegeID;
  }

  public String getCollegeName()
  {
    return collegeName;
  }

  public int getCollegeKPI()
  {
    return collegeKPI;
  }
  /* Code from template association_GetMany */
  public University getUniversity(int index)
  {
    University aUniversity = universities.get(index);
    return aUniversity;
  }

  public List<University> getUniversities()
  {
    List<University> newUniversities = Collections.unmodifiableList(universities);
    return newUniversities;
  }

  public int numberOfUniversities()
  {
    int number = universities.size();
    return number;
  }

  public boolean hasUniversities()
  {
    boolean has = universities.size() > 0;
    return has;
  }

  public int indexOfUniversity(University aUniversity)
  {
    int index = universities.indexOf(aUniversity);
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
  public static int minimumNumberOfUniversities()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUniversity(University aUniversity)
  {
    boolean wasAdded = false;
    if (universities.contains(aUniversity)) { return false; }
    universities.add(aUniversity);
    if (aUniversity.indexOfCollege(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversity.addCollege(this);
      if (!wasAdded)
      {
        universities.remove(aUniversity);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUniversity(University aUniversity)
  {
    boolean wasRemoved = false;
    if (!universities.contains(aUniversity))
    {
      return wasRemoved;
    }

    int oldIndex = universities.indexOf(aUniversity);
    universities.remove(oldIndex);
    if (aUniversity.indexOfCollege(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversity.removeCollege(this);
      if (!wasRemoved)
      {
        universities.add(oldIndex,aUniversity);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUniversityAt(University aUniversity, int index)
  {  
    boolean wasAdded = false;
    if(addUniversity(aUniversity))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniversities()) { index = numberOfUniversities() - 1; }
      universities.remove(aUniversity);
      universities.add(index, aUniversity);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUniversityAt(University aUniversity, int index)
  {
    boolean wasAdded = false;
    if(universities.contains(aUniversity))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniversities()) { index = numberOfUniversities() - 1; }
      universities.remove(aUniversity);
      universities.add(index, aUniversity);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUniversityAt(aUniversity, index);
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
    if (aDepartment.indexOfCollege(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aDepartment.addCollege(this);
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
    if (aDepartment.indexOfCollege(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aDepartment.removeCollege(this);
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
    ArrayList<University> copyOfUniversities = new ArrayList<University>(universities);
    universities.clear();
    for(University aUniversity : copyOfUniversities)
    {
      aUniversity.removeCollege(this);
    }
    while (departments.size() > 0)
    {
      Department aDepartment = departments.get(departments.size() - 1);
      aDepartment.delete();
      departments.remove(aDepartment);
    }
    
  }

  // line 183 "model.ump"
   public String getAllCollege(){
    
  }

  // line 186 "model.ump"
   public String getAllDepartment(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "collegeID" + ":" + getCollegeID()+ "," +
            "collegeName" + ":" + getCollegeName()+ "," +
            "collegeKPI" + ":" + getCollegeKPI()+ "]";
  }
}