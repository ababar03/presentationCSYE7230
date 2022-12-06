/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 213 "model.ump"
// line 660 "model.ump"
public class Professor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Professor Attributes
  private int professorID;
  private String professorName;
  private int professorRating;

  //Professor Associations
  private List<ProfessorKPI1> professorKPI1s;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Professor(int aProfessorID, String aProfessorName, int aProfessorRating)
  {
    professorID = aProfessorID;
    professorName = aProfessorName;
    professorRating = aProfessorRating;
    professorKPI1s = new ArrayList<ProfessorKPI1>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setProfessorID(int aProfessorID)
  {
    boolean wasSet = false;
    professorID = aProfessorID;
    wasSet = true;
    return wasSet;
  }

  public boolean setProfessorName(String aProfessorName)
  {
    boolean wasSet = false;
    professorName = aProfessorName;
    wasSet = true;
    return wasSet;
  }

  public boolean setProfessorRating(int aProfessorRating)
  {
    boolean wasSet = false;
    professorRating = aProfessorRating;
    wasSet = true;
    return wasSet;
  }

  public int getProfessorID()
  {
    return professorID;
  }

  public String getProfessorName()
  {
    return professorName;
  }

  public int getProfessorRating()
  {
    return professorRating;
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
    if (aProfessorKPI1.indexOfProfessor(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aProfessorKPI1.addProfessor(this);
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
    if (aProfessorKPI1.indexOfProfessor(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aProfessorKPI1.removeProfessor(this);
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
    ArrayList<ProfessorKPI1> copyOfProfessorKPI1s = new ArrayList<ProfessorKPI1>(professorKPI1s);
    professorKPI1s.clear();
    for(ProfessorKPI1 aProfessorKPI1 : copyOfProfessorKPI1s)
    {
      aProfessorKPI1.removeProfessor(this);
    }
  }

  // line 221 "model.ump"
   public String getprofessorFunding(){
    
  }

  // line 224 "model.ump"
   public String getProfessorResearch(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "professorID" + ":" + getProfessorID()+ "," +
            "professorName" + ":" + getProfessorName()+ "," +
            "professorRating" + ":" + getProfessorRating()+ "]";
  }
}