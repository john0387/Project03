import java.util.HashMap;
import java.util.ArrayList;

public class StationLexicographical extends MesoSortedAbstract
{
	public StationLexicographical(HashMap<String, Integer> unsorted)
	{
		sortedMap(unsorted);
	}
	
	public HashMap<String, Integer> sortedMap(HashMap<String, Integer> unsorted)
	{
		String temp;
		ArrayList<String> UnsortedIDlist = new ArrayList<String>();
		ArrayList<String> SortedIDlist = new ArrayList<String>();
		HashMap<String, Integer> sorted = new HashMap<String, Integer>();
		for ( String key : unsorted.keySet() ) {
		    UnsortedIDlist.add(key);
		}
		for(int i=1;i<UnsortedIDlist.size();i++)
		{
			temp = UnsortedIDlist.get(0);
			if(temp.compareTo(UnsortedIDlist.get(i-1))>0) {
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
		return sorted;
	}
}