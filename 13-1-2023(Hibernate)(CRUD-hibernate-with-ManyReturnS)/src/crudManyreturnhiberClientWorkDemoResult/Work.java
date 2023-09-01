package crudManyreturnhiberClientWorkDemoResult;
import java.util.*;
import java.util.List;
public class Work {
Scanner sc=new Scanner(System.in);
	public List<ClientReturn> m1()
	{
		List<ClientReturn> lst=new ArrayList();
		
		System.out.println("take number of clients ?????");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			ClientReturn cl=new ClientReturn();
		System.out.println("int id");
		cl.setId(sc.nextInt());
		System.out.println("string name");
		cl.setName(sc.next());
		System.out.println("double salary");
		cl.setSalary(sc.nextDouble());
		System.out.println("long mob");
		cl.setMobno(sc.nextLong());
		System.out.println("string  addr");
		cl.setAddr(sc.next());
		
		lst.add(cl);
		
		}
		return lst;
	}
	
public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Result x=new Result();
		while(true)
		{
			System.out.println("iam many returnNamedQuerier hql in hibernate.....");
			System.out.println("1 for insertData()");
			System.out.println("2 for getclient()");
			System.out.println("3 for getsingleclient()");
			System.out.println("4 for  updateclient()");
			System.out.println("5 for deleteclient()");
			
		int n=sc.nextInt();
		switch(n)
		{
		case 1:x.insertData();
		break;
		case 2:x.getclient();
		break;
		case 3:x.getsingleclient();
		break;
		case 4:x.updateclient();
		break;
		case 5:x.deleteclient();
		break;

		}
		}
	}
}
