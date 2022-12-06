/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 21 "model.ump"
// line 284 "model.ump"
// line 330 "model.ump"
// line 376 "model.ump"
// line 432 "model.ump"
// line 484 "model.ump"
// line 581 "model.ump"
public class University
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //University Attributes
  private String universityName;
  private Int universityID;
  private String empIndex;
  private Int amenitiesPoint;

  //University Associations
  private List<UniversityAdmin> universityAdmins;
  private List<StudentDirectory> studentDirectories;
  private List<UniversityKPI> universityKPIs;
  private List<College> colleges;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public University(String aUniversityName, Int aUniversityID, String aEmpIndex, Int aAmenitiesPoint)
  {
    universityName = aUniversityName;
    universityID = aUniversityID;
    empIndex = aEmpIndex;
    amenitiesPoint = aAmenitiesPoint;
    universityAdmins = new ArrayList<UniversityAdmin>();
    studentDirectories = new ArrayList<StudentDirectory>();
    universityKPIs = new ArrayList<UniversityKPI>();
    colleges = new ArrayList<College>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUniversityName(String aUniversityName)
  {
    boolean wasSet = false;
    universityName = aUniversityName;
    wasSet = true;
    return wasSet;
  }

  public boolean setUniversityID(Int aUniversityID)
  {
    boolean wasSet = false;
    universityID = aUniversityID;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmpIndex(String aEmpIndex)
  {
    boolean wasSet = false;
    empIndex = aEmpIndex;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmenitiesPoint(Int aAmenitiesPoint)
  {
    boolean wasSet = false;
    amenitiesPoint = aAmenitiesPoint;
    wasSet = true;
    return wasSet;
  }

  public String getUniversityName()
  {
    return universityName;
  }

  public Int getUniversityID()
  {
    return universityID;
  }

  public String getEmpIndex()
  {
    return empIndex;
  }

  public Int getAmenitiesPoint()
  {
    return amenitiesPoint;
  }
  /* Code from template association_GetMany */
  public UniversityAdmin getUniversityAdmin(int index)
  {
    UniversityAdmin aUniversityAdmin = universityAdmins.get(index);
    return aUniversityAdmin;
  }

  public List<UniversityAdmin> getUniversityAdmins()
  {
    List<UniversityAdmin> newUniversityAdmins = Collections.unmodifiableList(universityAdmins);
    return newUniversityAdmins;
  }

  public int numberOfUniversityAdmins()
  {
    int number = universityAdmins.size();
    return number;
  }

  public boolean hasUniversityAdmins()
  {
    boolean has = universityAdmins.size() > 0;
    return has;
  }

  public int indexOfUniversityAdmin(UniversityAdmin aUniversityAdmin)
  {
    int index = universityAdmins.indexOf(aUniversityAdmin);
    return index;
  }
  /* Code from template association_GetMany */
  public StudentDirectory getStudentDirectory(int index)
  {
    StudentDirectory aStudentDirectory = studentDirectories.get(index);
    return aStudentDirectory;
  }

  public List<StudentDirectory> getStudentDirectories()
  {
    List<StudentDirectory> newStudentDirectories = Collections.unmodifiableList(studentDirectories);
    return newStudentDirectories;
  }

  public int numberOfStudentDirectories()
  {
    int number = studentDirectories.size();
    return number;
  }

  public boolean hasStudentDirectories()
  {
    boolean has = studentDirectories.size() > 0;
    return has;
  }

  public int indexOfStudentDirectory(StudentDirectory aStudentDirectory)
  {
    int index = studentDirectories.indexOf(aStudentDirectory);
    return index;
  }
  /* Code from template association_GetMany */
  public UniversityKPI getUniversityKPI(int index)
  {
    UniversityKPI aUniversityKPI = universityKPIs.get(index);
    return aUniversityKPI;
  }

  public List<UniversityKPI> getUniversityKPIs()
  {
    List<UniversityKPI> newUniversityKPIs = Collections.unmodifiableList(universityKPIs);
    return newUniversityKPIs;
  }

  public int numberOfUniversityKPIs()
  {
    int number = universityKPIs.size();
    return number;
  }

  public boolean hasUniversityKPIs()
  {
    boolean has = universityKPIs.size() > 0;
    return has;
  }

  public int indexOfUniversityKPI(UniversityKPI aUniversityKPI)
  {
    int index = universityKPIs.indexOf(aUniversityKPI);
    return index;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUniversityAdmins()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUniversityAdmin(UniversityAdmin aUniversityAdmin)
  {
    boolean wasAdded = false;
    if (universityAdmins.contains(aUniversityAdmin)) { return false; }
    universityAdmins.add(aUniversityAdmin);
    if (aUniversityAdmin.indexOfUniversity(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversityAdmin.addUniversity(this);
      if (!wasAdded)
      {
        universityAdmins.remove(aUniversityAdmin);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUniversityAdmin(UniversityAdmin aUniversityAdmin)
  {
    boolean wasRemoved = false;
    if (!universityAdmins.contains(aUniversityAdmin))
    {
      return wasRemoved;
    }

    int oldIndex = universityAdmins.indexOf(aUniversityAdmin);
    universityAdmins.remove(oldIndex);
    if (aUniversityAdmin.indexOfUniversity(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversityAdmin.removeUniversity(this);
      if (!wasRemoved)
      {
        universityAdmins.add(oldIndex,aUniversityAdmin);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUniversityAdminAt(UniversityAdmin aUniversityAdmin, int index)
  {  
    boolean wasAdded = false;
    if(addUniversityAdmin(aUniversityAdmin))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniversityAdmins()) { index = numberOfUniversityAdmins() - 1; }
      universityAdmins.remove(aUniversityAdmin);
      universityAdmins.add(index, aUniversityAdmin);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUniversityAdminAt(UniversityAdmin aUniversityAdmin, int index)
  {
    boolean wasAdded = false;
    if(universityAdmins.contains(aUniversityAdmin))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniversityAdmins()) { index = numberOfUniversityAdmins() - 1; }
      universityAdmins.remove(aUniversityAdmin);
      universityAdmins.add(index, aUniversityAdmin);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUniversityAdminAt(aUniversityAdmin, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudentDirectories()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addStudentDirectory(StudentDirectory aStudentDirectory)
  {
    boolean wasAdded = false;
    if (studentDirectories.contains(aStudentDirectory)) { return false; }
    studentDirectories.add(aStudentDirectory);
    if (aStudentDirectory.indexOfUniversity(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentDirectory.addUniversity(this);
      if (!wasAdded)
      {
        studentDirectories.remove(aStudentDirectory);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeStudentDirectory(StudentDirectory aStudentDirectory)
  {
    boolean wasRemoved = false;
    if (!studentDirectories.contains(aStudentDirectory))
    {
      return wasRemoved;
    }

    int oldIndex = studentDirectories.indexOf(aStudentDirectory);
    studentDirectories.remove(oldIndex);
    if (aStudentDirectory.indexOfUniversity(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentDirectory.removeUniversity(this);
      if (!wasRemoved)
      {
        studentDirectories.add(oldIndex,aStudentDirectory);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentDirectoryAt(StudentDirectory aStudentDirectory, int index)
  {  
    boolean wasAdded = false;
    if(addStudentDirectory(aStudentDirectory))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentDirectories()) { index = numberOfStudentDirectories() - 1; }
      studentDirectories.remove(aStudentDirectory);
      studentDirectories.add(index, aStudentDirectory);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentDirectoryAt(StudentDirectory aStudentDirectory, int index)
  {
    boolean wasAdded = false;
    if(studentDirectories.contains(aStudentDirectory))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentDirectories()) { index = numberOfStudentDirectories() - 1; }
      studentDirectories.remove(aStudentDirectory);
      studentDirectories.add(index, aStudentDirectory);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentDirectoryAt(aStudentDirectory, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUniversityKPIs()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUniversityKPI(UniversityKPI aUniversityKPI)
  {
    boolean wasAdded = false;
    if (universityKPIs.contains(aUniversityKPI)) { return false; }
    universityKPIs.add(aUniversityKPI);
    if (aUniversityKPI.indexOfUniversity(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversityKPI.addUniversity(this);
      if (!wasAdded)
      {
        universityKPIs.remove(aUniversityKPI);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUniversityKPI(UniversityKPI aUniversityKPI)
  {
    boolean wasRemoved = false;
    if (!universityKPIs.contains(aUniversityKPI))
    {
      return wasRemoved;
    }

    int oldIndex = universityKPIs.indexOf(aUniversityKPI);
    universityKPIs.remove(oldIndex);
    if (aUniversityKPI.indexOfUniversity(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversityKPI.removeUniversity(this);
      if (!wasRemoved)
      {
        universityKPIs.add(oldIndex,aUniversityKPI);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUniversityKPIAt(UniversityKPI aUniversityKPI, int index)
  {  
    boolean wasAdded = false;
    if(addUniversityKPI(aUniversityKPI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniversityKPIs()) { index = numberOfUniversityKPIs() - 1; }
      universityKPIs.remove(aUniversityKPI);
      universityKPIs.add(index, aUniversityKPI);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUniversityKPIAt(UniversityKPI aUniversityKPI, int index)
  {
    boolean wasAdded = false;
    if(universityKPIs.contains(aUniversityKPI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUniversityKPIs()) { index = numberOfUniversityKPIs() - 1; }
      universityKPIs.remove(aUniversityKPI);
      universityKPIs.add(index, aUniversityKPI);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUniversityKPIAt(aUniversityKPI, index);
    }
    return wasAdded;
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
    if (aCollege.indexOfUniversity(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCollege.addUniversity(this);
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
    if (aCollege.indexOfUniversity(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCollege.removeUniversity(this);
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

  public void delete()
  {
    while (universityAdmins.size() > 0)
    {
      UniversityAdmin aUniversityAdmin = universityAdmins.get(universityAdmins.size() - 1);
      aUniversityAdmin.delete();
      universityAdmins.remove(aUniversityAdmin);
    }
    
    while (studentDirectories.size() > 0)
    {
      StudentDirectory aStudentDirectory = studentDirectories.get(studentDirectories.size() - 1);
      aStudentDirectory.delete();
      studentDirectories.remove(aStudentDirectory);
    }
    
    while (universityKPIs.size() > 0)
    {
      UniversityKPI aUniversityKPI = universityKPIs.get(universityKPIs.size() - 1);
      aUniversityKPI.delete();
      universityKPIs.remove(aUniversityKPI);
    }
    
    ArrayList<College> copyOfColleges = new ArrayList<College>(colleges);
    colleges.clear();
    for(College aCollege : copyOfColleges)
    {
      aCollege.removeUniversity(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "universityName" + ":" + getUniversityName()+ "," +
            "empIndex" + ":" + getEmpIndex()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "universityID" + "=" + (getUniversityID() != null ? !getUniversityID().equals(this)  ? getUniversityID().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "amenitiesPoint" + "=" + (getAmenitiesPoint() != null ? !getAmenitiesPoint().equals(this)  ? getAmenitiesPoint().toString().replaceAll("  ","    ") : "this" : "null");
  }
}