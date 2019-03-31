import java.util.HashMap;
import java.util.ArrayList;

public class StationLexicographical extends MesoSortedAbstract
{
	HashMap<String, Integer> sorted = new HashMap<String, Integer>();
	public StationLexicographical(HashMap<String, Integer> unsorted)
	{
		 sortedMap(unsorted);
		 for (String stid : sorted.keySet()) 
			{
			    System.out.println(stid + " " + sorted.get(stid));		    
			}
		/*System.out.print("BIXB 73\n" + 
				"BUFF 73\n" + 
				"CARL 73\n" + 
				"CHER 73\n" + 
				"COPA 73\n" + 
				"ERIC 73\n" + 
				"FAIR 73\n" + 
				"FREE 73\n" + 
				"HECT 73\n" + 
				"LAHO 73\n" + 
				"MANG 73\n" + 
				"MARE 73\n" + 
				"MIAM 73\n" + 
				"OKCE 73\n" + 
				"TALA 73\n");*/
	}
	
	public HashMap<String, Integer> sortedMap(HashMap<String, Integer> unsorted)
	{
		String temp;
		ArrayList<String> UnsortedIDlist = new ArrayList<String>();
		ArrayList<String> SortedIDlist = new ArrayList<String>();
		//HashMap<String, Integer> sorted = new HashMap<String, Integer>();
		for ( String key : unsorted.keySet() ) {
		    UnsortedIDlist.add(key);
		}
		for(int i=1;i<UnsortedIDlist.size();i++)
		{
			temp = UnsortedIDlist.get(0);
			if(temp.compareToIgnoreCase(UnsortedIDlist.get(i-1))>0)
			{
				temp = UnsortedIDlist.get(i-1);
			}
			SortedIDlist.add(temp);
		}
		
		for(int i=0;i<SortedIDlist.size();i++) 
		{
			if(unsorted.containsKey(SortedIDlist.get(i))==true)
			{
				sorted.put(SortedIDlist.get(i), unsorted.get(SortedIDlist.get(i)));
			}
		}
		/*sorted.put("BIXB", 73);
		sorted.put("BUFF", 73);sorted.put("CARL", 73);sorted.put("CHER", 73);sorted.put("COPA", 73);
		sorted.put("ERIC", 73);sorted.put("FAIR", 73);
		sorted.put("FREE", 73);sorted.put("HECT", 73);sorted.put("LAHO", 73);sorted.put("MANG", 73);
		sorted.put("MARE", 73);sorted.put("MIAMM", 73);sorted.put("OKCE", 73);sorted.put("TALA", 73);*/
		return sorted;
	}
}