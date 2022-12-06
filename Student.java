/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.0.6441.414d09714 modeling language!*/


import java.util.*;

// line 30 "model.ump"
// line 290 "model.ump"
// line 335 "model.ump"
// line 381 "model.ump"
// line 437 "model.ump"
// line 489 "model.ump"
// line 586 "model.ump"
public class Student
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  public static final int MinAge = 18;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Student Attributes
  private int studentID;
  private String programID;
  private String name;
  private int studentAge;
  private String researchPapers;
  private String collegeID;
  private String totalGrades;
  private String projects;
  private String personalInfo;
  private ArrayList researchWork;
  private int age;

  //Student Associations
  private List<StudentDirectory> studentDirectories;
  private List<StudentKPI> studentKPIs;
  private List<SeatAssigned> seatAssigneds;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Student(int aStudentID, String aProgramID, String aName, int aStudentAge, String aResearchPapers, String aCollegeID, String aTotalGrades, String aProjects, String aPersonalInfo, ArrayList aResearchWork, int aAge)
  {
    studentID = aStudentID;
    programID = aProgramID;
    name = aName;
    studentAge = aStudentAge;
    researchPapers = aResearchPapers;
    collegeID = aCollegeID;
    totalGrades = aTotalGrades;
    projects = aProjects;
    personalInfo = aPersonalInfo;
    researchWork = aResearchWork;
    age = aAge;
    studentDirectories = new ArrayList<StudentDirectory>();
    studentKPIs = new ArrayList<StudentKPI>();
    seatAssigneds = new ArrayList<SeatAssigned>();
    if (aAge<MinAge)
    {
      throw new RuntimeException("Please provide a valid age [age>=MinAge]");
    }
    if (aAge>120)
    {
      throw new RuntimeException("Please provide a valid age [age<=120]");
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

  public boolean setProgramID(String aProgramID)
  {
    boolean wasSet = false;
    programID = aProgramID;
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

  public boolean setStudentAge(int aStudentAge)
  {
    boolean wasSet = false;
    studentAge = aStudentAge;
    wasSet = true;
    return wasSet;
  }

  public boolean setResearchPapers(String aResearchPapers)
  {
    boolean wasSet = false;
    researchPapers = aResearchPapers;
    wasSet = true;
    return wasSet;
  }

  public boolean setCollegeID(String aCollegeID)
  {
    boolean wasSet = false;
    collegeID = aCollegeID;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalGrades(String aTotalGrades)
  {
    boolean wasSet = false;
    totalGrades = aTotalGrades;
    wasSet = true;
    return wasSet;
  }

  public boolean setProjects(String aProjects)
  {
    boolean wasSet = false;
    projects = aProjects;
    wasSet = true;
    return wasSet;
  }

  public boolean setPersonalInfo(String aPersonalInfo)
  {
    boolean wasSet = false;
    personalInfo = aPersonalInfo;
    wasSet = true;
    return wasSet;
  }

  public boolean setResearchWork(ArrayList aResearchWork)
  {
    boolean wasSet = false;
    researchWork = aResearchWork;
    wasSet = true;
    return wasSet;
  }

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    if (aAge<=120)
    {
    if (aAge>=MinAge)
    {
    age = aAge;
    wasSet = true;
    }
    }
    return wasSet;
  }

  public int getStudentID()
  {
    return studentID;
  }

  public String getProgramID()
  {
    return programID;
  }

  public String getName()
  {
    return name;
  }

  public int getStudentAge()
  {
    return studentAge;
  }

  public String getResearchPapers()
  {
    return researchPapers;
  }

  public String getCollegeID()
  {
    return collegeID;
  }

  public String getTotalGrades()
  {
    return totalGrades;
  }

  public String getProjects()
  {
    return projects;
  }

  public String getPersonalInfo()
  {
    return personalInfo;
  }

  public ArrayList getResearchWork()
  {
    return researchWork;
  }

  public int getAge()
  {
    return age;
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
  public StudentKPI getStudentKPI(int index)
  {
    StudentKPI aStudentKPI = studentKPIs.get(index);
    return aStudentKPI;
  }

  public List<StudentKPI> getStudentKPIs()
  {
    List<StudentKPI> newStudentKPIs = Collections.unmodifiableList(studentKPIs);
    return newStudentKPIs;
  }

  public int numberOfStudentKPIs()
  {
    int number = studentKPIs.size();
    return number;
  }

  public boolean hasStudentKPIs()
  {
    boolean has = studentKPIs.size() > 0;
    return has;
  }

  public int indexOfStudentKPI(StudentKPI aStudentKPI)
  {
    int index = studentKPIs.indexOf(aStudentKPI);
    return index;
  }
  /* Code from template association_GetMany */
  public SeatAssigned getSeatAssigned(int index)
  {
    SeatAssigned aSeatAssigned = seatAssigneds.get(index);
    return aSeatAssigned;
  }

  public List<SeatAssigned> getSeatAssigneds()
  {
    List<SeatAssigned> newSeatAssigneds = Collections.unmodifiableList(seatAssigneds);
    return newSeatAssigneds;
  }

  public int numberOfSeatAssigneds()
  {
    int number = seatAssigneds.size();
    return number;
  }

  public boolean hasSeatAssigneds()
  {
    boolean has = seatAssigneds.size() > 0;
    return has;
  }

  public int indexOfSeatAssigned(SeatAssigned aSeatAssigned)
  {
    int index = seatAssigneds.indexOf(aSeatAssigned);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudentDirectories()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StudentDirectory addStudentDirectory(int aStudentID, String aName)
  {
    return new StudentDirectory(aStudentID, aName, this);
  }

  public boolean addStudentDirectory(StudentDirectory aStudentDirectory)
  {
    boolean wasAdded = false;
    if (studentDirectories.contains(aStudentDirectory)) { return false; }
    Student existingStudent = aStudentDirectory.getStudent();
    boolean isNewStudent = existingStudent != null && !this.equals(existingStudent);
    if (isNewStudent)
    {
      aStudentDirectory.setStudent(this);
    }
    else
    {
      studentDirectories.add(aStudentDirectory);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStudentDirectory(StudentDirectory aStudentDirectory)
  {
    boolean wasRemoved = false;
    //Unable to remove aStudentDirectory, as it must always have a student
    if (!this.equals(aStudentDirectory.getStudent()))
    {
      studentDirectories.remove(aStudentDirectory);
      wasRemoved = true;
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
  public static int minimumNumberOfStudentKPIs()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addStudentKPI(StudentKPI aStudentKPI)
  {
    boolean wasAdded = false;
    if (studentKPIs.contains(aStudentKPI)) { return false; }
    studentKPIs.add(aStudentKPI);
    if (aStudentKPI.indexOfStudent(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aStudentKPI.addStudent(this);
      if (!wasAdded)
      {
        studentKPIs.remove(aStudentKPI);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeStudentKPI(StudentKPI aStudentKPI)
  {
    boolean wasRemoved = false;
    if (!studentKPIs.contains(aStudentKPI))
    {
      return wasRemoved;
    }

    int oldIndex = studentKPIs.indexOf(aStudentKPI);
    studentKPIs.remove(oldIndex);
    if (aStudentKPI.indexOfStudent(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aStudentKPI.removeStudent(this);
      if (!wasRemoved)
      {
        studentKPIs.add(oldIndex,aStudentKPI);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentKPIAt(StudentKPI aStudentKPI, int index)
  {  
    boolean wasAdded = false;
    if(addStudentKPI(aStudentKPI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentKPIs()) { index = numberOfStudentKPIs() - 1; }
      studentKPIs.remove(aStudentKPI);
      studentKPIs.add(index, aStudentKPI);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentKPIAt(StudentKPI aStudentKPI, int index)
  {
    boolean wasAdded = false;
    if(studentKPIs.contains(aStudentKPI))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudentKPIs()) { index = numberOfStudentKPIs() - 1; }
      studentKPIs.remove(aStudentKPI);
      studentKPIs.add(index, aStudentKPI);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentKPIAt(aStudentKPI, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSeatAssigneds()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSeatAssigned(SeatAssigned aSeatAssigned)
  {
    boolean wasAdded = false;
    if (seatAssigneds.contains(aSeatAssigned)) { return false; }
    seatAssigneds.add(aSeatAssigned);
    if (aSeatAssigned.indexOfStudent(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSeatAssigned.addStudent(this);
      if (!wasAdded)
      {
        seatAssigneds.remove(aSeatAssigned);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSeatAssigned(SeatAssigned aSeatAssigned)
  {
    boolean wasRemoved = false;
    if (!seatAssigneds.contains(aSeatAssigned))
    {
      return wasRemoved;
    }

    int oldIndex = seatAssigneds.indexOf(aSeatAssigned);
    seatAssigneds.remove(oldIndex);
    if (aSeatAssigned.indexOfStudent(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSeatAssigned.removeStudent(this);
      if (!wasRemoved)
      {
        seatAssigneds.add(oldIndex,aSeatAssigned);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSeatAssignedAt(SeatAssigned aSeatAssigned, int index)
  {  
    boolean wasAdded = false;
    if(addSeatAssigned(aSeatAssigned))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSeatAssigneds()) { index = numberOfSeatAssigneds() - 1; }
      seatAssigneds.remove(aSeatAssigned);
      seatAssigneds.add(index, aSeatAssigned);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSeatAssignedAt(SeatAssigned aSeatAssigned, int index)
  {
    boolean wasAdded = false;
    if(seatAssigneds.contains(aSeatAssigned))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSeatAssigneds()) { index = numberOfSeatAssigneds() - 1; }
      seatAssigneds.remove(aSeatAssigned);
      seatAssigneds.add(index, aSeatAssigned);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSeatAssignedAt(aSeatAssigned, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=studentDirectories.size(); i > 0; i--)
    {
      StudentDirectory aStudentDirectory = studentDirectories.get(i - 1);
      aStudentDirectory.delete();
    }
    ArrayList<StudentKPI> copyOfStudentKPIs = new ArrayList<StudentKPI>(studentKPIs);
    studentKPIs.clear();
    for(StudentKPI aStudentKPI : copyOfStudentKPIs)
    {
      aStudentKPI.removeStudent(this);
    }
    ArrayList<SeatAssigned> copyOfSeatAssigneds = new ArrayList<SeatAssigned>(seatAssigneds);
    seatAssigneds.clear();
    for(SeatAssigned aSeatAssigned : copyOfSeatAssigneds)
    {
      aSeatAssigned.removeStudent(this);
    }
  }

  // line 49 "model.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    Client c = new Client(40);  
    for (int i: new int[]  
      {-1,10,17,18,19,50,119,120,122,1000})   
    {  
       System.out.println(  
         "Trying to initialize age to "+i);  
       System.out.println(c.setAge(i)  
         ? "  Success"  
         : "  FAILURE");  
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "studentID" + ":" + getStudentID()+ "," +
            "programID" + ":" + getProgramID()+ "," +
            "name" + ":" + getName()+ "," +
            "studentAge" + ":" + getStudentAge()+ "," +
            "researchPapers" + ":" + getResearchPapers()+ "," +
            "collegeID" + ":" + getCollegeID()+ "," +
            "totalGrades" + ":" + getTotalGrades()+ "," +
            "projects" + ":" + getProjects()+ "," +
            "personalInfo" + ":" + getPersonalInfo()+ "," +
            "age" + ":" + getAge()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "researchWork" + "=" + (getResearchWork() != null ? !getResearchWork().equals(this)  ? getResearchWork().toString().replaceAll("  ","    ") : "this" : "null");
  }
  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler
  {
    public void uncaughtException(Thread t, Throwable e)
    {
      translate(e);
      if(e.getCause()!=null)
      {
        translate(e.getCause());
      }
      e.printStackTrace();
    }
    public void translate(Throwable e)
    {
      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();
      StackTraceElement[] elements = e.getStackTrace();
      try
      {
        for(StackTraceElement element:elements)
        {
          String className = element.getClassName();
          String methodName = element.getMethodName();
          boolean methodFound = false;
          int index = className.lastIndexOf('.')+1;
          try {
            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+"_"+methodName,new Class[]{});
            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});
            for(int i=0;i<sourceInformation.size();++i)
            {
              // To compensate for any offsets caused by injected code we need to loop through the other references to this function
              //  and adjust the start / length of the function.
              int functionStart = sourceInformation.getJavaLine(i) + (("main".equals(methodName))?3:1);
              int functionEnd = functionStart + sourceInformation.getLength(i);
              int afterInjectionLines = 0;
              //  We can leverage the fact that all inject statements are added to the uncaught exception list 
              //   before the functions that they are within
              for (int j = 0; j < i; j++) {
                if (sourceInformation.getJavaLine(j) - 1 >= functionStart &&
                    sourceInformation.getJavaLine(j) - 1 <= functionEnd &&
                    sourceInformation.getJavaLine(j) - 1 <= element.getLineNumber()) {
                    // A before injection, +2 for the comments surrounding the injected code
                    if (sourceInformation.getJavaLine(j) - 1 == functionStart) {
                        functionStart += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    } else {
                        // An after injection
                        afterInjectionLines += sourceInformation.getLength(j) + 2;
                        functionEnd += sourceInformation.getLength(j) + 2;
                    }
                }
              }
              int distanceFromStart = element.getLineNumber() - functionStart - afterInjectionLines;
              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))
              {
                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));
                methodFound = true;
                break;
              }
            }
          }
          catch (Exception e2){}
          if(!methodFound)
          {
            result.add(element);
          }
        }
      }
      catch (Exception e1)
      {
        e1.printStackTrace();
      }
      e.setStackTrace(result.toArray(new StackTraceElement[0]));
    }
  //The following methods Map Java lines back to their original Umple file / line    
    public UmpleSourceData StudentDirectory_getStudentByName(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(9).setJavaLines(355).setLengths(1);}
    public UmpleSourceData Student_main(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(48).setJavaLines(575).setLengths(10);}
    public UmpleSourceData Transcript_getGradesFromAllCourses(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(80).setJavaLines(176).setLengths(1);}
    public UmpleSourceData StudentCourseRegistry_getrequiredCourseknowledgeForJob(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(97).setJavaLines(362).setLengths(1);}
    public UmpleSourceData StudentCourseRegistry_getDegreeRequirement(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(102).setJavaLines(372).setLengths(1);}
    public UmpleSourceData StudentCourseRegistry_getCourseInfo(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(94).setJavaLines(357).setLengths(1);}
    public UmpleSourceData StudentCourseRegistry_calculateJobRelevenceFactor(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(99).setJavaLines(367).setLengths(1);}
    public UmpleSourceData CourseTaken_getMaximumCoursesForSem(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(112).setJavaLines(307).setLengths(1);}
    public UmpleSourceData CourseTaken_getSemesterDetails(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(115).setJavaLines(312).setLengths(1);}
    public UmpleSourceData CourseTaken_getMinCoursesForSemester(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(118).setJavaLines(317).setLengths(1);}
    public UmpleSourceData CourseTaken_getStudentCourseCapacity(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(121).setJavaLines(322).setLengths(1);}
    public UmpleSourceData CourseSchedule_getCourseBySemester(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(137).setJavaLines(302).setLengths(1);}
    public UmpleSourceData CourseSchedule_getAllCoursesSchedule(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(131).setJavaLines(292).setLengths(1);}
    public UmpleSourceData CourseSchedule_getCourseByDepartment(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(134).setJavaLines(297).setLengths(1);}
    public UmpleSourceData CourseKPI_calculateCourseKPI(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(145).setJavaLines(48).setLengths(1);}
    public UmpleSourceData CourseList_getCoursebyID(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(156).setJavaLines(93).setLengths(1);}
    public UmpleSourceData CourseList_getCoursebyName(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(159).setJavaLines(98).setLengths(1);}
    public UmpleSourceData UniversityKPI_getAllStudentsKPI(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(168).setJavaLines(292).setLengths(1);}
    public UmpleSourceData UniversityKPI_getAllCoursesKPI(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(171).setJavaLines(297).setLengths(1);}
    public UmpleSourceData College_getAllCollege(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(182).setJavaLines(323).setLengths(1);}
    public UmpleSourceData College_getAllDepartment(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(185).setJavaLines(328).setLengths(1);}
    public UmpleSourceData Department_registerStudentForCourses(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(195).setJavaLines(307).setLengths(1);}
    public UmpleSourceData CareerDepartment_manageStudents(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(203).setJavaLines(154).setLengths(1);}
    public UmpleSourceData Professor_getprofessorFunding(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(220).setJavaLines(201).setLengths(1);}
    public UmpleSourceData Professor_getProfessorResearch(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(223).setJavaLines(206).setLengths(1);}
    public UmpleSourceData Employer_getOpeningDetails(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(236).setJavaLines(327).setLengths(1);}
    public UmpleSourceData Employer_getEmployerInfo(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(233).setJavaLines(322).setLengths(1);}
    public UmpleSourceData StudentEmploymentInfo_getStudentPromotionDetails(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(249).setJavaLines(351).setLengths(1);}
    public UmpleSourceData Job_getJobDetails(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(263).setJavaLines(311).setLengths(1);}
    public UmpleSourceData Job_getJobSalary(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(260).setJavaLines(306).setLengths(1);}

  }
  public static class UmpleSourceData
  {
    String[] umpleFileNames;
    Integer[] umpleLines;
    Integer[] umpleJavaLines;
    Integer[] umpleLengths;
    
    public UmpleSourceData(){
    }
    public String getFileName(int i){
      return umpleFileNames[i];
    }
    public Integer getUmpleLine(int i){
      return umpleLines[i];
    }
    public Integer getJavaLine(int i){
      return umpleJavaLines[i];
    }
    public Integer getLength(int i){
      return umpleLengths[i];
    }
    public UmpleSourceData setFileNames(String... filenames){
      umpleFileNames = filenames;
      return this;
    }
    public UmpleSourceData setUmpleLines(Integer... umplelines){
      umpleLines = umplelines;
      return this;
    }
    public UmpleSourceData setJavaLines(Integer... javalines){
      umpleJavaLines = javalines;
      return this;
    }
    public UmpleSourceData setLengths(Integer... lengths){
      umpleLengths = lengths;
      return this;
    }
    public int size(){
      return umpleFileNames.length;
    }
  }
}