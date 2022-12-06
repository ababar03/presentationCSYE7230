/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 240 "model.ump"
// line 671 "model.ump"
public class StudentEmploymentInfo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentEmploymentInfo Attributes
  private String studentID;
  private String jobID;
  private String employerID;
  private String jobName;
  private String empStudentRating;

  //StudentEmploymentInfo Associations
  private List<Employer> employers;
  private List<Job> jobs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentEmploymentInfo(String aStudentID, String aJobID, String aEmployerID, String aJobName, String aEmpStudentRating)
  {
    studentID = aStudentID;
    jobID = aJobID;
    employerID = aEmployerID;
    jobName = aJobName;
    empStudentRating = aEmpStudentRating;
    employers = new ArrayList<Employer>();
    jobs = new ArrayList<Job>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStudentID(String aStudentID)
  {
    boolean wasSet = false;
    studentID = aStudentID;
    wasSet = true;
    return wasSet;
  }

  public boolean setJobID(String aJobID)
  {
    boolean wasSet = false;
    jobID = aJobID;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmployerID(String aEmployerID)
  {
    boolean wasSet = false;
    employerID = aEmployerID;
    wasSet = true;
    return wasSet;
  }

  public boolean setJobName(String aJobName)
  {
    boolean wasSet = false;
    jobName = aJobName;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmpStudentRating(String aEmpStudentRating)
  {
    boolean wasSet = false;
    empStudentRating = aEmpStudentRating;
    wasSet = true;
    return wasSet;
  }

  public String getStudentID()
  {
    return studentID;
  }

  public String getJobID()
  {
    return jobID;
  }

  public String getEmployerID()
  {
    return employerID;
  }

  public String getJobName()
  {
    return jobName;
  }

  public String getEmpStudentRating()
  {
    return empStudentRating;
  }
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
  /* Code from template association_GetMany */
  public Job getJob(int index)
  {
    Job aJob = jobs.get(index);
    return aJob;
  }

  public List<Job> getJobs()
  {
    List<Job> newJobs = Collections.unmodifiableList(jobs);
    return newJobs;
  }

  public int numberOfJobs()
  {
    int number = jobs.size();
    return number;
  }

  public boolean hasJobs()
  {
    boolean has = jobs.size() > 0;
    return has;
  }

  public int indexOfJob(Job aJob)
  {
    int index = jobs.indexOf(aJob);
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
    if (aEmployer.indexOfStudentEmploymentInfo(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEmployer.addStudentEmploymentInfo(this);
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
    if (aEmployer.indexOfStudentEmploymentInfo(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEmployer.removeStudentEmploymentInfo(this);
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfJobs()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addJob(Job aJob)
  {
    boolean wasAdded = false;
    if (jobs.contains(aJob)) { return false; }
    jobs.add(aJob);
    if (aJob.indexOfStudentEmploymentInfo(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aJob.addStudentEmploymentInfo(this);
      if (!wasAdded)
      {
        jobs.remove(aJob);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeJob(Job aJob)
  {
    boolean wasRemoved = false;
    if (!jobs.contains(aJob))
    {
      return wasRemoved;
    }

    int oldIndex = jobs.indexOf(aJob);
    jobs.remove(oldIndex);
    if (aJob.indexOfStudentEmploymentInfo(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aJob.removeStudentEmploymentInfo(this);
      if (!wasRemoved)
      {
        jobs.add(oldIndex,aJob);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addJobAt(Job aJob, int index)
  {  
    boolean wasAdded = false;
    if(addJob(aJob))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJobs()) { index = numberOfJobs() - 1; }
      jobs.remove(aJob);
      jobs.add(index, aJob);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveJobAt(Job aJob, int index)
  {
    boolean wasAdded = false;
    if(jobs.contains(aJob))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfJobs()) { index = numberOfJobs() - 1; }
      jobs.remove(aJob);
      jobs.add(index, aJob);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addJobAt(aJob, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Employer> copyOfEmployers = new ArrayList<Employer>(employers);
    employers.clear();
    for(Employer aEmployer : copyOfEmployers)
    {
      aEmployer.removeStudentEmploymentInfo(this);
    }
    ArrayList<Job> copyOfJobs = new ArrayList<Job>(jobs);
    jobs.clear();
    for(Job aJob : copyOfJobs)
    {
      aJob.removeStudentEmploymentInfo(this);
    }
  }

  // line 250 "model.ump"
   public String getStudentPromotionDetails(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "studentID" + ":" + getStudentID()+ "," +
            "jobID" + ":" + getJobID()+ "," +
            "employerID" + ":" + getEmployerID()+ "," +
            "jobName" + ":" + getJobName()+ "," +
            "empStudentRating" + ":" + getEmpStudentRating()+ "]";
  }
}