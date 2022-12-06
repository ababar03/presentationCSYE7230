/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 272 "model.ump"
// line 320 "model.ump"
// line 360 "model.ump"
// line 366 "model.ump"
// line 406 "model.ump"
// line 417 "model.ump"
// line 422 "model.ump"
// line 462 "model.ump"
// line 468 "model.ump"
// line 474 "model.ump"
// line 514 "model.ump"
// line 520 "model.ump"
// line 526 "model.ump"
// line 571 "model.ump"
public class StudentDirectory
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentDirectory Attributes
  private int studentID;
  private String name;

  //StudentDirectory Associations
  private List<UniversityAdmin> universityAdmins;
  private List<University> universities;
  private Student student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentDirectory(int aStudentID, String aName, Student aStudent)
  {
    studentID = aStudentID;
    name = aName;
    universityAdmins = new ArrayList<UniversityAdmin>();
    universities = new ArrayList<University>();
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create studentDirectory due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStudentID(int aStudentID)
  {
    boolean wasSet = false;
    studentID = aStudentID;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public int getStudentID()
  {
    return studentID;
  }

  public String getName()
  {
    return name;
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
  /* Code from template association_GetOne */
  public Student getStudent()
  {
    return student;
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
    if (aUniversityAdmin.indexOfStudentDirectory(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversityAdmin.addStudentDirectory(this);
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
    if (aUniversityAdmin.indexOfStudentDirectory(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversityAdmin.removeStudentDirectory(this);
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
    if (aUniversity.indexOfStudentDirectory(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversity.addStudentDirectory(this);
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
    if (aUniversity.indexOfStudentDirectory(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversity.removeStudentDirectory(this);
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
  /* Code from template association_SetOneToMany */
  public boolean setStudent(Student aStudent)
  {
    boolean wasSet = false;
    if (aStudent == null)
    {
      return wasSet;
    }

    Student existingStudent = student;
    student = aStudent;
    if (existingStudent != null && !existingStudent.equals(aStudent))
    {
      existingStudent.removeStudentDirectory(this);
    }
    student.addStudentDirectory(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    ArrayList<UniversityAdmin> copyOfUniversityAdmins = new ArrayList<UniversityAdmin>(universityAdmins);
    universityAdmins.clear();
    for(UniversityAdmin aUniversityAdmin : copyOfUniversityAdmins)
    {
      aUniversityAdmin.removeStudentDirectory(this);
    }
    ArrayList<University> copyOfUniversities = new ArrayList<University>(universities);
    universities.clear();
    for(University aUniversity : copyOfUniversities)
    {
      aUniversity.removeStudentDirectory(this);
    }
    Student placeholderStudent = student;
    this.student = null;
    if(placeholderStudent != null)
    {
      placeholderStudent.removeStudentDirectory(this);
    }
  }

  // line 10 "model.ump"
  public String getStudentByName(){
    return (getStudentByName());
  }


  public String toString()
  {
    return super.toString() + "["+
            "studentID" + ":" + getStudentID()+ "," +
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null");
  }
}