/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 14 "model.ump"
// line 279 "model.ump"
// line 325 "model.ump"
// line 371 "model.ump"
// line 427 "model.ump"
// line 479 "model.ump"
// line 576 "model.ump"
public class UniversityAdmin
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UniversityAdmin Attributes
  private type adminID;
  private type adminName;
  private type position;

  //UniversityAdmin Associations
  private List<StudentDirectory> studentDirectories;
  private List<University> universities;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UniversityAdmin(type aAdminID, type aAdminName, type aPosition)
  {
    adminID = aAdminID;
    adminName = aAdminName;
    position = aPosition;
    studentDirectories = new ArrayList<StudentDirectory>();
    universities = new ArrayList<University>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAdminID(type aAdminID)
  {
    boolean wasSet = false;
    adminID = aAdminID;
    wasSet = true;
    return wasSet;
  }

  public boolean setAdminName(type aAdminName)
  {
    boolean wasSet = false;
    adminName = aAdminName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPosition(type aPosition)
  {
    boolean wasSet = false;
    position = aPosition;
    wasSet = true;
    return wasSet;
  }

  public type getAdminID()
  {
    return adminID;
  }

  public type getAdminName()
  {
    return adminName;
  }

  public type getPosition()
  {
    return position;
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
    if (aStudentDirectory.indexOfUniversityAdmin(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentDirectory.addUniversityAdmin(this);
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
    if (aStudentDirectory.indexOfUniversityAdmin(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentDirectory.removeUniversityAdmin(this);
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
    if (aUniversity.indexOfUniversityAdmin(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversity.addUniversityAdmin(this);
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
    if (aUniversity.indexOfUniversityAdmin(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversity.removeUniversityAdmin(this);
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

  public void delete()
  {
    ArrayList<StudentDirectory> copyOfStudentDirectories = new ArrayList<StudentDirectory>(studentDirectories);
    studentDirectories.clear();
    for(StudentDirectory aStudentDirectory : copyOfStudentDirectories)
    {
      aStudentDirectory.removeUniversityAdmin(this);
    }
    ArrayList<University> copyOfUniversities = new ArrayList<University>(universities);
    universities.clear();
    for(University aUniversity : copyOfUniversities)
    {
      aUniversity.removeUniversityAdmin(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "adminID" + "=" + (getAdminID() != null ? !getAdminID().equals(this)  ? getAdminID().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "adminName" + "=" + (getAdminName() != null ? !getAdminName().equals(this)  ? getAdminName().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "position" + "=" + (getPosition() != null ? !getPosition().equals(this)  ? getPosition().toString().replaceAll("  ","    ") : "this" : "null");
  }
}