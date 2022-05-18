package week3;

public class Students {
	
		public static void main(String[] args) 
		{

		Students stud1 = new Students();
		stud1.getStudentInfo(456);
		stud1.getStudentInfo(345, "Chitra");
		stud1.getStudentInfo("CSE",401 );

	}
	
	public void getStudentInfo(int id) 
	{
		System.out.println("Original Id " +id);
	}
	
	public void getStudentInfo(int id, String name) 
	{
		System.out.println("Overriden Id "+id);
		System.out.println(name);
	}
	
	public void getStudentInfo(String deptname, int deptid) 
	{
		System.out.println(deptname);
		System.out.println("deptid " +deptid);
	}

}


