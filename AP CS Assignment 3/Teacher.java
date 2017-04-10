public class Teacher extends Person
{
  private String subject = "";
  
  Teacher(String fName, String lName, String area)
  {
    super(fName, lName);
    subject = area;
  }
  
  public String toString()
  {
    String answer = super.toString();
    answer += ("   Subject: " + subject);
    return answer;
  }
}