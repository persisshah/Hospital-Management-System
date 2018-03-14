package Classes;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
interface myfunction
{
	void remEnt();
}


public class Appointments 
{

	Scanner sc =new Scanner(System.in);
	Patient p = new Patient();
	List<Object[]> patlist = Patient.patlist;
	public Appointments()
	{
		
	}
	
	Appointments(String pid,String pname,String disease,String d_id)
	{
		
		Object[] ob = new Object[4];
		
		ob[0]=pid;
		ob[1]=pname;
		ob[2]=disease;
		ob[3]=d_id;
		patlist.add(ob);
	}
	public void vapp()
	{
		System.out.println("Enter ur patient id");
		String pid = sc.next();
		for(Object[] o : patlist)
		{
			if(pid==o[0])
			{
				System.out.println(o);
			}
		}
	}
	public void showapps()
	{
		
		for(Object[] o : patlist)
		{
			System.out.print(o[0] + "\t");
		     System.out.print(o[1] + "\t");
		     System.out.print(o[2] + "\t");
		     System.out.print(o[3] + "\n");

		}
				

	}
	
}
