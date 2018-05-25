import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;

/*
 *   In order to use the personGenerator method , you must change the directory path
 *   in the code to wherever you downloaded the project.
 * 
 */


public class Office extends JFrame{
	
	private static List<Employee> peeps = new ArrayList<Employee>();
	private static Scanner sc = new Scanner(System.in);
	private int[] salaries;
	
	public Office()
	{
		Employee michael = new Manager("Michael", 100000.00);
		Employee jim = new SalesEmployee("Jim", 80000.00);
		Employee kevin = new AccountingEmployee("Kevin", 70000.00);
		Employee dwight = new SalesEmployee("Dwight", 85000.00);
		
		peeps.add(michael);
		peeps.add(jim);
		peeps.add(dwight);
		peeps.add(kevin);
		
		ArrayList<String> mq = new ArrayList<String>(Arrays.asList("I love all my employees even though I hit one of you with my car", "Well, happy birthday, Jesus. Sorry your party's so lame", "Would I rather be feared or loved? Easy. Both. I want people to be afraid of how much they love me" ));
		peeps.get(0).setQuotes(mq);
		
		ArrayList<String> jq = new ArrayList<String>(Arrays.asList(""));
		peeps.get(1).setQuotes(jq);
		
		ArrayList<String> dq = new ArrayList<String>(Arrays.asList("You couldn’t handle my undivided attention." , " No, I disagree. R is one of the most menacing of sounds. That’s why they call it murder not ‘muckduck’." , "It’s never the person who you most suspect. It’s also never the person you least suspect since anyone with half a brain would suspect them the most. Therefore, I know the killer to be Phyllis… The person who I most medium suspect."));
		peeps.get(2).setQuotes(dq);
		
		ArrayList<String> kq = new ArrayList<String>(Arrays.asList("Mini-cupcakes? As in the mini version of regular cupcakes? Which is already a mini version of cake? Honestly, where does it end with you people?", "The only problem is whenever I try to make a taco, I get too excited and crush it." , "Why waste time say lot word, when few word do trick"));
		peeps.get(3).setQuotes(kq);
	}
	
	public static void main(String[] args)
	{
		Office dunderMufflin = new Office();
		research();
		
		
	}
	
	public void personGenertaor() 
	{
		String person;
		System.out.print("Who would you like to see? \n 1 for Michael \n 2 for Jim \n 3 for Dwight \n 4 for Kevin");
		person = sc.next();
		
		JFrame frame = new JFrame("This is person " + person);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JLabel(new ImageIcon("G:\\PhotosForProj\\" + person + ".png"))); // You need to change the directory to wherever needed
		JLabel label = new JLabel(peeps.get(Integer.parseInt(person) - 1).toString());
		frame.add(label);
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void research()
	{
		int person;
		int option;
		System.out.println("Who would you like to research \n 1 for Michael \n 2 for Jim \n 3 for Dwight \n 4 for Kevin");
		person = sc.nextInt();
		System.out.println("What would you like to know? \n 1 for a random Quote \n 2 for Salary \n 3 for ID");
		option = sc.nextInt();
		
		switch(person)
		{
			case 1:
				
				switch(option)
				{
					case 1:
						int num = (int)(Math.random()*3);
						System.out.println(peeps.get(0).getQuotes().get(num));
						break;
						
					case 2:
						System.out.println("$" + peeps.get(0).getBaseSalary());
						break;
						
					case 3:
						System.out.println(peeps.get(0).getID());
						break;
					
						
				}
			break;
			case 2:
				switch(option)
				{
					case 1:
						int num = (int)(Math.random()*3);
						System.out.println(peeps.get(1).getQuotes().get(num));
						break;
						
					case 2:
						System.out.println("$" + peeps.get(1).getBaseSalary());
						break;
						
					case 3:
						System.out.println(peeps.get(1).getID());
						break;
						
				}
			break;	
			case 3:
				switch(option)
				{
					case 1:
						int num = (int)(Math.random()*3);
						System.out.println(peeps.get(2).getQuotes().get(num));
						break;
						
					case 2:
						System.out.println("$" + peeps.get(2).getBaseSalary());
						break;
						
					case 3:
						System.out.println(peeps.get(2).getID());
						break;
						
				}
			break;	
			case 4:
				switch(option)
				{
					case 1:
						int num = (int)(Math.random()*3);
						System.out.println(peeps.get(3).getQuotes().get(num));
						break;
						
					case 2:
						System.out.println("$" + peeps.get(3).getBaseSalary());
						break;
						
					case 3:
						System.out.println(peeps.get(3).getID());
						break;
						
				}
			
		}
	}
	
	public void random()
	{
		
	}
	
	
	
	public void addEmployee(Employee guy)
	{
		peeps.add(guy);
	}
	
	

}
