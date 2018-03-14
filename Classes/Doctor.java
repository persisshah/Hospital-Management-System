package Classes;
import java.util.*;

public class Doctor extends Appointments implements myfunction
{
	
	List<Object[]> patlist = Patient.patlist;
	Scanner sc= new Scanner(System.in);
	Appointments a = new Appointments();
	public void checkApp()
	{
		System.out.println("Enter ur ID");
		String sd = sc.next();
	//	try
	//	{
		for(Object[] o : patlist)
		{
			
				if(sd.equals(o[3]))
				{
					//System.out.println("Found");
					 System.out.print(o[0] + "\t");
				     System.out.print(o[1] + "\t");
				     System.out.print(o[2] + "\t");
				     System.out.print(o[3] + "\n");
					
				}
		//	else
			//	throw new HospException();
	//	}
		}
	//	catch(HospException e)
		//{
			//System.out.println(e.getMessage1());
	//	}
	
		
	}
	public void remEnt()
	{
		checkApp();
		System.out.println("Enter id of Patient who finished ur treatment");
		String  rd = sc.next();
		for(Object[] o : patlist)
		{
		//	try
		//	{
				
				if(rd.equals(o[0]))
				{
					System.out.println("Patient removed Successfully");
					patlist.remove(o);
					break;
					
				}
			//	else
			//		throw new HospException();
		//	}catch(HospException e)
	//		{
		//		System.out.println(e.getMessage1());
	//		}
		}
	}
	public void showDocs()
	{
		Admin a = new Admin();
		List<Object[]> doclist = Admin.doclist;
		System.out.println("Avaialable Doctors\n");
		for(Object[] o : doclist)
		{
			if(o[3]=="1")
			{
				System.out.println("Doc id = "+o[1]+" Doc Name = "+o[2]);
			}
		}
	}
	
	

}
