public class Person
{
  private String firstName;
  private String lastName;
  
  Person(String fName, String lName)
  {
    fName = firstName;
    lName = lastName;
  }
  
  public String toString()
  {
    String answer = (firstName + " " + lastName);
    return answer;
  }
}