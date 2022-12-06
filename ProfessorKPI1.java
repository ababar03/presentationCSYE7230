/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 207 "model.ump"
// line 654 "model.ump"
public class ProfessorKPI1
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ProfessorKPI1 Attributes
  private String profKPI;

  //ProfessorKPI1 Associations
  private List<UniversityKPI> universityKPIs;
  private List<Professor> professors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ProfessorKPI1(String aProfKPI)
  {
    profKPI = aProfKPI;
    universityKPIs = new ArrayList<UniversityKPI>();
    professors = new ArrayList<Professor>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setProfKPI(String aProfKPI)
  {
    boolean wasSet = false;
    profKPI = aProfKPI;
    wasSet = true;
    return wasSet;
  }

  public String getProfKPI()
  {
    return profKPI;
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
  public Professor getProfessor(int index)
  {
    Professor aProfessor = professors.get(index);
    return aProfessor;
  }

  public List<Professor> getProfessors()
  {
    List<Professor> newProfessors = Collections.unmodifiableList(professors);
    return newProfessors;
  }

  public int numberOfProfessors()
  {
    int number = professors.size();
    return number;
  }

  public boolean hasProfessors()
  {
    boolean has = professors.size() > 0;
    return has;
  }

  public int indexOfProfessor(Professor aProfessor)
  {
    int index = professors.indexOf(aProfessor);
    return index;
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
    if (aUniversityKPI.indexOfProfessorKPI1(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUniversityKPI.addProfessorKPI1(this);
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
    if (aUniversityKPI.indexOfProfessorKPI1(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUniversityKPI.removeProfessorKPI1(this);
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
  public static int minimumNumberOfProfessors()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addProfessor(Professor aProfessor)
  {
    boolean wasAdded = false;
    if (professors.contains(aProfessor)) { return false; }
    professors.add(aProfessor);
    if (aProfessor.indexOfProfessorKPI1(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aProfessor.addProfessorKPI1(this);
      if (!wasAdded)
      {
        professors.remove(aProfessor);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeProfessor(Professor aProfessor)
  {
    boolean wasRemoved = false;
    if (!professors.contains(aProfessor))
    {
      return wasRemoved;
    }

    int oldIndex = professors.indexOf(aProfessor);
    professors.remove(oldIndex);
    if (aProfessor.indexOfProfessorKPI1(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aProfessor.removeProfessorKPI1(this);
      if (!wasRemoved)
      {
        professors.add(oldIndex,aProfessor);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addProfessorAt(Professor aProfessor, int index)
  {  
    boolean wasAdded = false;
    if(addProfessor(aProfessor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProfessors()) { index = numberOfProfessors() - 1; }
      professors.remove(aProfessor);
      professors.add(index, aProfessor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveProfessorAt(Professor aProfessor, int index)
  {
    boolean wasAdded = false;
    if(professors.contains(aProfessor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProfessors()) { index = numberOfProfessors() - 1; }
      professors.remove(aProfessor);
      professors.add(index, aProfessor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addProfessorAt(aProfessor, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<UniversityKPI> copyOfUniversityKPIs = new ArrayList<UniversityKPI>(universityKPIs);
    universityKPIs.clear();
    for(UniversityKPI aUniversityKPI : copyOfUniversityKPIs)
    {
      aUniversityKPI.removeProfessorKPI1(this);
    }
    ArrayList<Professor> copyOfProfessors = new ArrayList<Professor>(professors);
    professors.clear();
    for(Professor aProfessor : copyOfProfessors)
    {
      aProfessor.removeProfessorKPI1(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "profKPI" + ":" + getProfKPI()+ "]";
  }
}