import java.util.ArrayList;

public class School
{
  private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
  private ArrayList<Student> students = new ArrayList<Student>();
  
  School(ArrayList <Student> pupils, ArrayList <Teacher> staff)
  {
	  students = pupils;
	  teachers = staff;
  }

public String getGradeLevel(int level)
{
	String answer = "";
	int temp;
	for(int i = 0; i<students.size();i++)
	{
		temp = students.get(i).getLevel();
		if(temp == level)
		{
			answer += students.get(i);
		}
	}
	return answer;
}

public
}