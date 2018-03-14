package Classes;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Patient{
	//Admin a = new Admin();
	List<Object[]> doclist = Admin.doclist;
	public static List<Object[]> patlist = new ArrayList<Object[]>();
	public void initialize()
	{
	Object[] ob = new Object[4] ; 
	 ob[0] = "P_ID";	
	 ob[1] = "P_Name";
	 ob[2] = "Doc Speciality no";
	 ob[3] = "D_ID";

	 patlist.add(ob); 
	 
	 ob = new Object[4] ; 
	 ob[0] = "099";	
	 ob[1] = "Bheem";
	 ob[2] = "1";
	 ob[3] = "D101";

	 patlist.add(ob); 
	 ob = new Object[4] ; 
	 ob[0] = "100";	
	 ob[1] = "Kalia";
	 ob[2] = "2";
	 ob[3] = "D102";

	 patlist.add(ob); 
	}
	
	
	AtomicInteger count = new AtomicInteger(100) ;
	
	public void creApp()
	{	
		List<Object[]> doclist = Admin.doclist;
			
		System.out.println("Enter Your disease type\n1.Cardiology\n2.Orthoped\n3.Oncology\n4.Radiology");
		Scanner sc= new Scanner(System.in);
		String dtype = sc.next();
		
		for(Object[] o : doclist)
		{
			
			
			if(o[3].equals(dtype))
			{
		//		do
			//			{
				System.out.print(o[0] + "\t");
				System.out.print(o[1] + "\t");
				System.out.print(o[2] + "\t");
				System.out.print(o[3] + "\n");
			//			}while(!(o[3].equals(o[3])));
			}
			
			
		 }//create Exception here
		try
		{
		System.out.println("Enter id  from the available Doctors\n");
		String did = sc.next();
		if(did.charAt(0)=='D' && did.length()<5)
		{
		
		
			System.out.println("Enter your name");
			String pname = sc.next();
			
			System.out.println("Enter new Patient id");
			String pid= sc.next();
			Appointments a = new Appointments(pid,pname,dtype,did);
		}
		else
			throw new HospException();
		}catch(HospException h)
		{
			System.out.println(h.getMessage2());
		}
	
		
	}

}
