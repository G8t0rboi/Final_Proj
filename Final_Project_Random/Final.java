import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;

public class Office {
	
	private static List<Employee> peeps = new ArrayList<Employee>();
	private static HashMap<Employee, Double> salaries = new HashMap<Employee, Double>();
	
	public Office()
	{
		
		Employee michael = new Manager("Michael");
		Employee jim = new SalesEmployee("Jim");
		Employee kevin = new AccountingEmployee("Kevin");
		Employee dwight = new SalesEmployee("Dwight");
		
		michael.setBaseSalary(100000.00);
		jim.setBaseSalary(80000.00);
		dwight.setBaseSalary(85000.00);
		kevin.setBaseSalary(70000.00);
		
		peeps.add(michael);
		peeps.add(jim);
		peeps.add(dwight);
		peeps.add(kevin);
		
		salaries.put(michael,  peeps.get(0).calculateSalary());
		salaries.put(jim, peeps.get(1).calculateSalary());
		salaries.put(dwight, peeps.get(2).calculateSalary());
		salaries.put(kevin, peeps.get(3).calculateSalary());
		
	}
	
	public static void main(String[] args)
	{
		
	}
	
	public static void selectionSort(List<Double> x) 
	{
	    for (int i=0; i<x.size()-1; i++) 
	    {
	        for (int j=i+1; j<x.size(); j++) 
	        {
	            if (x.get(i) > x.get(j)) 
	            {
	                double temp = x.get(i);
	                x.set(i, x.get(j));
	                x.set(j, temp);
	            }
	        }
	    }
	}
	
	public void raise()
	{
		
	}
	
	

}
