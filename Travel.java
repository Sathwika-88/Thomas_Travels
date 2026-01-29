package com;
import java.util.*;
public class Travel {
public boolean isCarDriver(Driver driver)
{
	if(driver.getCategory().equals("car"))
		return true;
	return false;
}
public String reterivebyDriverId(ArrayList<Driver> list,int id)
{
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getId() == id)
			return "Driver name is "+list.get(i).getDriverName()+" Belonging to the category "+list.get(i).getCategory()+" traveled "+list.get(i).getDistance()+" KM so far.";
		 
	}
	return "";
}
public int reteriveCountOfDriver(ArrayList<Driver> list,String category)
{
	int count=0;
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getCategory() == category)
			count++;
		 
	}
	return count;
}
public ArrayList<Driver> retriveDriver(ArrayList<Driver> list,String category)
{
	ArrayList<Driver> list1 = new ArrayList<>();
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getCategory() == category)
			list1.add(list.get(i));
		 
	}
	return list1;
}
public Driver reteriveMaximumDistanceTravelledDriver(ArrayList<Driver> list)
{
	Driver d = new Driver();
	double max=0;
	for(int i=0;i<list.size();i++)
	{
		 max = Math.max(max,list.get(i).getDistance());
		 
	}
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getDistance() == max)
			return list.get(i);
			 
		 
	}
	return d;
}
 

}
