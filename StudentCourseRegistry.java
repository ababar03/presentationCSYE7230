/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 84 "model.ump"
// line 314 "model.ump"
// line 355 "model.ump"
// line 401 "model.ump"
// line 412 "model.ump"
// line 457 "model.ump"
// line 509 "model.ump"
// line 606 "model.ump"
public class StudentCourseRegistry
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentCourseRegistry Attributes
  private String student;
  private String courses;
  private String grades;
  private String job;
  private String jobRelevenceFactor;

  //StudentCourseRegistry Associations
  private List<Transcript> transcripts;
  private List<Job> jobs;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentCourseRegistry(String aStudent, String aCourses, String aGrades, String aJob, String aJobRelevenceFactor)
  {
    student = aStudent;
    courses = aCourses;
    grades = aGrades;
    job = aJob;
    jobRelevenceFactor = aJobRelevenceFactor;
    transcripts = new ArrayList<Transcript>();
    jobs = new ArrayList<Job>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStudent(String aStudent)
  {
    boolean wasSet = false;
    student = aStudent;
    wasSet = true;
    return wasSet;
  }

  public boolean setCourses(String aCourses)
  {
    boolean wasSet = false;
    courses = aCourses;
    wasSet = true;
    return wasSet;
  }

  public boolean setGrades(String aGrades)
  {
    boolean wasSet = false;
    grades = aGrades;
    wasSet = true;
    return wasSet;
  }

  public boolean setJob(String aJob)
  {
    boolean wasSet = false;
    job = aJob;
    wasSet = true;
    return wasSet;
  }

  public boolean setJobRelevenceFactor(String aJobRelevenceFactor)
  {
    boolean wasSet = false;
    jobRelevenceFactor = aJobRelevenceFactor;
    wasSet = true;
    return wasSet;
  }

  public String getStudent()
  {
    return student;
  }

  public String getCourses()
  {
    return courses;
  }

  public String getGrades()
  {
    return grades;
  }

  public String getJob()
  {
    return job;
  }

  public String getJobRelevenceFactor()
  {
    return jobRelevenceFactor;
  }
  /* Code from template association_GetMany */
  public Transcript getTranscript(int index)
  {
    Transcript aTranscript = transcripts.get(index);
    return aTranscript;
  }

  public List<Transcript> getTranscripts()
  {
    List<Transcript> newTranscripts = Collections.unmodifiableList(transcripts);
    return newTranscripts;
  }

  public int numberOfTranscripts()
  {
    int number = transcripts.size();
    return number;
  }

  public boolean hasTranscripts()
  {
    boolean has = transcripts.size() > 0;
    return has;
  }

  public int indexOfTranscript(Transcript aTranscript)
  {
    int index = transcripts.indexOf(aTranscript);
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
  public static int minimumNumberOfTranscripts()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addTranscript(Transcript aTranscript)
  {
    boolean wasAdded = false;
    if (transcripts.contains(aTranscript)) { return false; }
    transcripts.add(aTranscript);
    if (aTranscript.indexOfStudentCourseRegistry(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aTranscript.addStudentCourseRegistry(this);
      if (!wasAdded)
      {
        transcripts.remove(aTranscript);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeTranscript(Transcript aTranscript)
  {
    boolean wasRemoved = false;
    if (!transcripts.contains(aTranscript))
    {
      return wasRemoved;
    }

    int oldIndex = transcripts.indexOf(aTranscript);
    transcripts.remove(oldIndex);
    if (aTranscript.indexOfStudentCourseRegistry(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aTranscript.removeStudentCourseRegistry(this);
      if (!wasRemoved)
      {
        transcripts.add(oldIndex,aTranscript);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addTranscriptAt(Transcript aTranscript, int index)
  {  
    boolean wasAdded = false;
    if(addTranscript(aTranscript))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTranscripts()) { index = numberOfTranscripts() - 1; }
      transcripts.remove(aTranscript);
      transcripts.add(index, aTranscript);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTranscriptAt(Transcript aTranscript, int index)
  {
    boolean wasAdded = false;
    if(transcripts.contains(aTranscript))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTranscripts()) { index = numberOfTranscripts() - 1; }
      transcripts.remove(aTranscript);
      transcripts.add(index, aTranscript);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTranscriptAt(aTranscript, index);
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
    if (aJob.indexOfStudentCourseRegistry(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aJob.addStudentCourseRegistry(this);
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
    if (aJob.indexOfStudentCourseRegistry(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aJob.removeStudentCourseRegistry(this);
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
    ArrayList<Transcript> copyOfTranscripts = new ArrayList<Transcript>(transcripts);
    transcripts.clear();
    for(Transcript aTranscript : copyOfTranscripts)
    {
      aTranscript.removeStudentCourseRegistry(this);
    }
    ArrayList<Job> copyOfJobs = new ArrayList<Job>(jobs);
    jobs.clear();
    for(Job aJob : copyOfJobs)
    {
      aJob.removeStudentCourseRegistry(this);
    }
  }

  // line 95 "model.ump"
   public String getCourseInfo(String courses){
    
  }

  // line 98 "model.ump"
   public String getrequiredCourseknowledgeForJob(){
    
  }

  // line 100 "model.ump"
   public String calculateJobRelevenceFactor(){
    
  }

  // line 103 "model.ump"
   public String getDegreeRequirement(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "student" + ":" + getStudent()+ "," +
            "courses" + ":" + getCourses()+ "," +
            "grades" + ":" + getGrades()+ "," +
            "job" + ":" + getJob()+ "," +
            "jobRelevenceFactor" + ":" + getJobRelevenceFactor()+ "]";
  }
}