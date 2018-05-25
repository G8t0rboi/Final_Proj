
public class Manager extends Employee {
	private double salary;
	private int signedPapers;
	
	public Manager(String name)
	{
		super(name);
	}
	
	public Manager(String name, double salary)
	{
		super(salary, name);
		signedPapers = 0;
	}
	
	public double calculateSalary()
	{
		salary = super.getBaseSalary() * 2.0;
		return salary;
	}
	
	
	public void brag()
	{
		System.out.print("I have signed " + signedPapers + " papers!");
	}
	public String toString()
	{
		return "";
	}
}
