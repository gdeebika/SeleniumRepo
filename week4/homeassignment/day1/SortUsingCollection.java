package week4.homeassignment.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> values = new ArrayList<String>();
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire Systems");
		values.add("CTS");
		
		Collections.sort(values);
		
		//Collections.reverse(values);
		//for (String sortValue: values) {
		//System.out.println(sortValue);
	//}
		
		for (int i=values.size()-1; i>=0; i--)
		{
			System.out.println(values.get(i));
		}
		
		
		}

	}

