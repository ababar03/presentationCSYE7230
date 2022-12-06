/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 199 "model.ump"
// line 648 "model.ump"
public class CareerDepartment
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CareerDepartment Associations
  private List<Employer> employers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CareerDepartment()
  {
    employers = new ArrayList<Employer>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Employer getEmployer(int index)
  {
    Employer aEmployer = employers.get(index);
    return aEmployer;
  }

  public List<Employer> getEmployers()
  {
    List<Employer> newEmployers = Collections.unmodifiableList(employers);
    return newEmployers;
  }

  public int numberOfEmployers()
  {
    int number = employers.size();
    return number;
  }

  public boolean hasEmployers()
  {
    boolean has = employers.size() > 0;
    return has;
  }

  public int indexOfEmployer(Employer aEmployer)
  {
    int index = employers.indexOf(aEmployer);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEmployers()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEmployer(Employer aEmployer)
  {
    boolean wasAdded = false;
    if (employers.contains(aEmployer)) { return false; }
    employers.add(aEmployer);
    if (aEmployer.indexOfCareerDepartment(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEmployer.addCareerDepartment(this);
      if (!wasAdded)
      {
        employers.remove(aEmployer);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEmployer(Employer aEmployer)
  {
    boolean wasRemoved = false;
    if (!employers.contains(aEmployer))
    {
      return wasRemoved;
    }

    int oldIndex = employers.indexOf(aEmployer);
    employers.remove(oldIndex);
    if (aEmployer.indexOfCareerDepartment(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEmployer.removeCareerDepartment(this);
      if (!wasRemoved)
      {
        employers.add(oldIndex,aEmployer);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEmployerAt(Employer aEmployer, int index)
  {  
    boolean wasAdded = false;
    if(addEmployer(aEmployer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEmployers()) { index = numberOfEmployers() - 1; }
      employers.remove(aEmployer);
      employers.add(index, aEmployer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEmployerAt(Employer aEmployer, int index)
  {
    boolean wasAdded = false;
    if(employers.contains(aEmployer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEmployers()) { index = numberOfEmployers() - 1; }
      employers.remove(aEmployer);
      employers.add(index, aEmployer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEmployerAt(aEmployer, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Employer> copyOfEmployers = new ArrayList<Employer>(employers);
    employers.clear();
    for(Employer aEmployer : copyOfEmployers)
    {
      aEmployer.removeCareerDepartment(this);
    }
  }

  // line 204 "model.ump"
   public String manageStudents(){
    
  }

}