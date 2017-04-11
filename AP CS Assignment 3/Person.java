public class Person
{
  private String firstName;
  private String lastName;
  
  Person(String fName, String lName)
  {
    firstName = fName;
    lastName = lName;
  }
  
  public String toString()
  {
    String answer = (firstName + " " + lastName + "\n");
    return answer;
  }
}