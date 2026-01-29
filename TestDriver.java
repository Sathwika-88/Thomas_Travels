package com;
import java.util.*;
public class TestDriver {
public static void main(String args[])
{

	Driver driver1 = new Driver(1,"car","prabhas",720);
	Driver driver2 = new Driver(2,"car","mahesh",620);
	Driver driver3 = new Driver(3,"bike","ram charan",520);
	Driver driver4 = new Driver(4,"bike","varun tej",420);
	Driver driver5 = new Driver(5,"cycle","nani",320);
	Driver driver6 = new Driver(6,"cycle","allu arjun",220);
	Driver driver7 = new Driver(7,"auto","ravi teja",120);
	Driver driver8 = new Driver(8,"auto","rana",800);
	Driver driver9 = new Driver(9,"bus","yash",900);
	ArrayList<Driver> list = new ArrayList<>();
	list.add(driver1);
	list.add(driver2);
	list.add(driver3);
	list.add(driver4);
	list.add(driver5);
	list.add(driver6);
	list.add(driver7);
	list.add(driver8);
	list.add(driver9);
//	list.add(driver2);
	Travel t = new Travel();
	System.out.println(t.isCarDriver(driver1));
	System.out.println(t.isCarDriver(driver4));
	System.out.println(t.reterivebyDriverId(list, 1));
	System.out.println(t.reterivebyDriverId(list, 9));
	System.out.println(t.reteriveCountOfDriver(list, "car"));
    System.out.println(toString(t.retriveDriver(list, "bike")));
	System.out.println(toString(t.reteriveMaximumDistanceTravelledDriver(list)));
	
	
}
public static String toString(Driver driver) {
		// TODO Auto-generated method stub
		return driver.getDriverName();
	}

	public static ArrayList<String> toString(ArrayList<Driver> list) {
		// TODO Auto-generated method stub
		ArrayList<String> list5 = new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			list5.add(""+list.get(i).getId()+" "+list.get(i).getCategory()+" "+list.get(i).getDriverName()+" "+list.get(i).getDistance());
		}
		return list5;
	}
}
