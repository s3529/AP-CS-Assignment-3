public class Student extends Person
{
  private int studentId;
  private static int num = 0;
  private int level;
  
  Student(String fName, String lName, int gLevel)
  {
    super(fName, lName);
    if(gLevel >= 1 && gLevel <= 12)
    {
      level = gLevel;
    }
    else
    {
      level = 0;
    }
    num++;
    studentId = num;
  }
  
  public int getLevel()
  {
    int answer;
    answer = level;
    return answer;
  }
  
  public String toString()
  {
    String answer = super.toString() + ("   Grade Level: " + level + "\n   ID: " + studentId + "\n");
    return answer;
  }
}