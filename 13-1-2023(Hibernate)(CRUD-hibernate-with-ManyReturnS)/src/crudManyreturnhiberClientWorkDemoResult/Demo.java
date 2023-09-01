package crudManyreturnhiberClientWorkDemoResult;

import java.util.List;

public class Demo {

	public List<ClientReturn> m2()
	{
		Work x=new Work();
		List<ClientReturn> cl	=x.m1();
		
		return cl;
	}
}
