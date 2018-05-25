import java.util.*;

public abstract class Employee {

	private double baseSalary;
	private String name;
	private String id;
	private List<String> quotes = new ArrayList<String>();
	
	public Employee()
	{
		baseSalary = 0;
		name = "unkown";
		generateID();
	}
	
	public Employee(double salary, String name)
	{
		baseSalary = salary;
		this.name = name;
		generateID();
	}
	
	public Employee(String name)
	{
		this.name = name;
		generateID();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	public void setBaseSalary(double amount)
	{
		baseSalary = amount;
	}
	
	public void generateID()
	{
		String temp = "";
		for(int a = 0; a < getName().length(); a += 2)
		{
			temp += getName().substring(a, a+1);
		}
		id = temp;
	}
	
	public String getID()
	{
		return id;
	}
	
	public void addQuote(String q)
	{
		quotes.add(q);
	}
	
	public List<String> getQuotes()
	{
		return quotes;
	}
	
	public void setQuotes(ArrayList<String> q)
	{
		for(int a = 0; a < q.size(); a++)
		{
			quotes.add(q.get(a));
		}
	}
	
	public abstract double calculateSalary();
	public abstract void brag();
	public abstract String toString();
	
}
