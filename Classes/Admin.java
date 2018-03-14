package Classes;
import java.util.*;



public class Admin extends Doctor implements myfunction
{
	

	Scanner sc = new Scanner(System.in);
//	Patient p = new Patient();
	public static List<Object[]> doclist = new ArrayList<Object[]>();  
	
	Object[] ob = new Object[5];
	public void initialize()
	{
		Object[] ob = new Object[5];
	 ob[0] = "ID";
	 ob[1] = "Name";
	 ob[2] = "Speciality";
	 ob[3] = "Speciality No.";
	 ob[4] = "Availibility";

	 doclist.add(ob);       

	 ob = new Object[5];
	 ob[0] = "D101";
	 ob[1] = "Huzaif";
	 ob[2] = "Cardiology";
	 ob[3] = "1";
	 ob[4] = "1";
	 doclist.add(ob);
	 
	 ob = new Object[5];
	 ob[0] = "D102";
	 ob[1] = "Darshan";
	 ob[2] = "Orthopedic";
	 ob[3] = "2";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D103";
	 ob[1] = "Shabbir";
	 ob[2] = "Oncology";
	 ob[3] = "3";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D104";
	 ob[1] = "Kaif";
	 ob[2] = "Radiology";
	 ob[3] = "4";
	 ob[4] = "1";
	 doclist.add(ob);
	 
	 ob = new Object[5];
	 ob[0] = "D105";
	 ob[1] = "Shah";
	 ob[2] = "Cardiology";
	 ob[3] = "1";
	 ob[4] = "1";
	 doclist.add(ob);
	 
	 ob = new Object[5];
	 ob[0] = "D106";
	 ob[1] = "Moin";
	 ob[2] = "Orthopedic";
	 ob[3] = "2";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D107";
	 ob[1] = "Saad";
	 ob[2] = "Oncology";
	 ob[3] = "3";
	 ob[4] = "1";
	 doclist.add(ob);

	 ob = new Object[5];
	 ob[0] = "D108";
	 ob[1] = "Azeem";
	 ob[2] = "Radiology";
	 ob[3] = "4";
	 ob[4] = "1";
	 doclist.add(ob);
	}

	
	public void viewDoc()
	{        
		 

		 // Output the values
		 for(Object[] o : doclist){
			
		     System.out.print(o[0] + "\t");
		     System.out.print(o[1] + "\t");
		     System.out.print(o[2] + "\t");
		     System.out.print(o[3] + "\n");
		 }

	}
	
	public void addDoc()
	{
		System.out.println("Enter new Doctor ID");
		String id = sc.next();
		try{
			
		if(id.charAt(0)=='D')
		{
		
		System.out.println("Enter Doc Name");
		String name = sc.next();
		System.out.println("Select Doctor Speciality\n1.CardioLogy\n2.Orthopedic\n3.Oncology\n4.Radiology");
		int sp = sc.nextInt();
		if(sp>4)
			throw new HospException();
		
			ob = new Object[4];
			ob[0] = id;
			ob[1] = name;
		if(sp==1)
		{
			ob[2]= "Cardiology";
			ob[3]= "1";
		}
		else if(sp==2)
		{
			ob[2]= "Orthopedic";
			ob[3]= "2";
		}
		else if(sp==3)
		{
			ob[2]= "Oncology";
			ob[3]= "3";
		}
		else if(sp==4)
		{
			ob[2]= "radiology";
			ob[3]= "4";
		}
		doclist.add(ob);
		System.out.println("New Doctor added successfully");
		}
		else
			throw new HospException();
		}catch(HospException e)
		{
			System.out.println(e.getMessage2());
		}
		
		
		
	}
	public void viewPat()
	{
		Patient p = new Patient();
		List<Object[]> patlist = Patient.patlist;
		for(Object[] o : patlist)
		{
			 System.out.print(o[0] + "\t");
		     System.out.print(o[1] + "\t");
		     System.out.print(o[2] + "\t");
		     System.out.print(o[3] + "\n");
				
		}
	}
	public void remEnt()
	{
		System.out.println("Enter id of Doc u want to remove");
		String rd = sc.next();
		for(Object[] o : doclist)
		{
			try
			{
				if(rd.equals(o[0]))
				{
					System.out.println("Doc removed Successfully");
					doclist.remove(o);
					break;
				}
				else
					throw new HospException();
			}catch(HospException e)
			{
				System.out.println("Doctor Removed");
			}
		}
	}
	public void searchDoc()
	{
		System.out.println("Enter id of Doc u want to search");
		String sd = sc.next();
		for(Object[] o : doclist)
		{
			try
			{
				if(sd.equals(o[0]))
				{
					System.out.println("Found");
					 System.out.print(o[0] + "\t");
				     System.out.print(o[1] + "\t");
				     System.out.print(o[2] + "\t");
				     System.out.print(o[3] + "\n");
					
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	
}
