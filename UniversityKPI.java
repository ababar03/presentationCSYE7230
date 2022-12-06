/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 163 "model.ump"
// line 555 "model.ump"
// line 631 "model.ump"
public class UniversityKPI
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //UniversityKPI Attributes
  private String universityKPI;

  //UniversityKPI Associations
  private List<University> universities;
  private List<ProfessorKPI1> professorKPI1s;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UniversityKPI(String aUniversityKPI)
  {
    universityKPI = aUniversityKPI;
    universities = new ArrayList<University>();
    professorKPI1s = new ArrayList<ProfessorKPI1>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUniversityKPI(String aUniversityKPI)
  {
    boolean wasSet = false;
    universityKPI = aUniversityKPI;
    wasSet = true;
    return wasSet;
  }

  public String getUniversityKPI()
  {
    return universityKPI;
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
  public ProfessorKPI1 getProfessorKPI1(int index)
  {
    ProfessorKPI1 aProfessorKPI1 = professorKPI1s.get(index);
    return aProfessorKPI1;
  }

  public List<ProfessorKPI1> getProfessorKPI1s()
  {
    List<ProfessorKPI1> newProfessorKPI1s = Collections.unmodifiableList(professorKPI1s);
    return newProfessorKPI1s;
  }

  public int numberOfProfessorKPI1s()
  {
    int number = professorKPI1s.size();
    return number;
  }

  public boolean hasProfessorKPI1s()
  {
    boolean has = professorKPI1s.size() > 0;
    return has;
  }

  public int indexOfProfessorKPI1(ProfessorKPI1 aProfessorKPI1)
  {
    int index = professorKPI1s.indexOf(aProfessorKPI1);
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
    if (aUniversity.indexOfUniversityKPI(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversity.addUniversityKPI(this);
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
    if (aUniversity.indexOfUniversityKPI(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversity.removeUniversityKPI(this);
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
  public static int minimumNumberOfProfessorKPI1s()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addProfessorKPI1(ProfessorKPI1 aProfessorKPI1)
  {
    boolean wasAdded = false;
    if (professorKPI1s.contains(aProfessorKPI1)) { return false; }
    professorKPI1s.add(aProfessorKPI1);
    if (aProfessorKPI1.indexOfUniversityKPI(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aProfessorKPI1.addUniversityKPI(this);
      if (!wasAdded)
      {
        professorKPI1s.remove(aProfessorKPI1);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeProfessorKPI1(ProfessorKPI1 aProfessorKPI1)
  {
    boolean wasRemoved = false;
    if (!professorKPI1s.contains(aProfessorKPI1))
    {
      return wasRemoved;
    }

    int oldIndex = professorKPI1s.indexOf(aProfessorKPI1);
    professorKPI1s.remove(oldIndex);
    if (aProfessorKPI1.indexOfUniversityKPI(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aProfessorKPI1.removeUniversityKPI(this);
      if (!wasRemoved)
      {
        professorKPI1s.add(oldIndex,aProfessorKPI1);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addProfessorKPI1At(ProfessorKPI1 aProfessorKPI1, int index)
  {  
    boolean wasAdded = false;
    if(addProfessorKPI1(aProfessorKPI1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProfessorKPI1s()) { index = numberOfProfessorKPI1s() - 1; }
      professorKPI1s.remove(aProfessorKPI1);
      professorKPI1s.add(index, aProfessorKPI1);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveProfessorKPI1At(ProfessorKPI1 aProfessorKPI1, int index)
  {
    boolean wasAdded = false;
    if(professorKPI1s.contains(aProfessorKPI1))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProfessorKPI1s()) { index = numberOfProfessorKPI1s() - 1; }
      professorKPI1s.remove(aProfessorKPI1);
      professorKPI1s.add(index, aProfessorKPI1);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addProfessorKPI1At(aProfessorKPI1, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<University> copyOfUniversities = new ArrayList<University>(universities);
    universities.clear();
    for(University aUniversity : copyOfUniversities)
    {
      aUniversity.removeUniversityKPI(this);
    }
    ArrayList<ProfessorKPI1> copyOfProfessorKPI1s = new ArrayList<ProfessorKPI1>(professorKPI1s);
    professorKPI1s.clear();
    for(ProfessorKPI1 aProfessorKPI1 : copyOfProfessorKPI1s)
    {
      aProfessorKPI1.removeUniversityKPI(this);
    }
  }

  // line 169 "model.ump"
   public String getAllStudentsKPI(){
    
  }

  // line 172 "model.ump"
   public String getAllCoursesKPI(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "universityKPI" + ":" + getUniversityKPI()+ "]";
  }
}