package twoclassvariables;

public class Test {
	
	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		
		e1.empid=101;
		e1.name="Pawan";
		e1.age=25;
		
		
	Employee e2=new Employee();
		
		e2.empid=102;
		e2.name="Shubham";
		e2.age=22;
		
		
		
		System.out.println(e1.empid);
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		System.out.println(e2.empid);
		System.out.println(e2.name);
		System.out.println(e2.age);
		
	}

}
