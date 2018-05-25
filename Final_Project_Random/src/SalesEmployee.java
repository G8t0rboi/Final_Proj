
public class SalesEmployee extends Employee {

	private int amtOfSales;
	private double salary;
	
	public SalesEmployee()
	{
		super("unkown");
		amtOfSales = 0;
	}
	
	public SalesEmployee(String name)
	{
		super(name);
		amtOfSales = 0;
	}
	
	public SalesEmployee(String name, double salary)
	{
		super(salary, name);
		amtOfSales = 0;
		
	}
	
	public double calculateSalary()
	{
		salary = (super.getBaseSalary() * 1.5) + calculateCommissions();
		return salary;
	}
	
	public void madeSales(int amount)
	{
		amtOfSales += amount;
	}
	
	public double calculateCommissions()
	{
		return amtOfSales * .25;
	}
	
	public void brag()
	{
		System.out.println("I have made " + amtOfSales + " sales!");
	}
	
	public String toString()
	{
		return super.getName() + " is a sales employee, he / she has made" + amtOfSales + "sales, his / her salary is " + calculateSalary();
	}
	
	
	
}
