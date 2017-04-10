public class Student extends Person
{
  private int studentId = 0;
  private int level;
  
  Student(String fName, String lName, int gLevel)
  {
    super(fName, lName);
    if(gLevel >= 0 && gLevel <= 12)
    {
      level = gLevel;
    }
    else
    {
      level = 0;
    }
    studentId++;
  }
  
  public int getLevel()
  {
    int answer;
    answer = level;
    return answer;
  }
  
  public String toString()
  {
    String answer = super.toString();
    answer += ("\n   Grade Level: " + level + "\n   ID: " + studentId);
    return answer;
  }
}