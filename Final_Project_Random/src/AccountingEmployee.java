
public class AccountingEmployee extends Employee{
	private double salary;
	private double financialRecords;
	
	public AccountingEmployee()
	{
		super("unknown");
		financialRecords = 0;
	}
	
	public AccountingEmployee(String name)
	{
		super(name);
		financialRecords = 0;
	}
	
	public AccountingEmployee(String name, double salary)
	{
		super(salary, name);
		financialRecords = 0;
	}
	
	public double calculateSalary()
	{
		salary = super.getBaseSalary() * 1.25;
		return salary;
	}
	
	public void brag()
	{
		System.out.println("I have finished " + financialRecords + " financial records!");
	}
	
	public String toString()
	{
		return "";
	}
	
}
