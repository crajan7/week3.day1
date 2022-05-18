package week3;

public class Automation implements TestTool,Language{
	
public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.language();
		auto.testTool();

}

public void java()		
{
	System.out.println("Language - JAVA");
}

public void selenium()	
{
	System.out.println("Testing Tool - Selenium");
	
}
public void language() {

	System.out.println("language from interface Language :"+ name);
	
	
	this.java();
}

public void testTool() 
{
	System.out.println(" langauage from interface TestTool: "+name1);
	
	
}
}

