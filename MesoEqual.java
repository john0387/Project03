import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MesoEqual
{
	String id;
	ArrayList<String> IDlist = new ArrayList<String>();
	
	public MesoEqual(String StID)
	{
		id = StID;
		try
    	{
    		read("Mesonet.txt");
    	}
    	catch(IOException e)
    	{
    		System.out.println("Error reading from file!\n");
    		e.printStackTrace();
    	}
	}
	
	public void read(String filename) throws IOException
    {
    	BufferedReader BR = new BufferedReader(new FileReader(filename));
        String line = BR.readLine();
        line = BR.readLine();
        line = BR.readLine();
        while(line!=null) {
        	IDlist.add(line.substring(1,5));
        	line = BR.readLine();        		
        }
        BR.close();
    }
	
	public Map<String, Integer> calAsciiEqual()
	{
		Map<String, Integer> unsorted = new HashMap<String, Integer>();
		MesoAscii Asciiavg = new MesoAscii(new MesoStation(id));
		int ave = Asciiavg.calAverage();
		unsorted.put(id,ave);
		for(int i=0;i<IDlist.size();i++)
		{
			if(new MesoAscii(new MesoStation(IDlist.get(i))).calAverage()==ave)
			{
				unsorted.put(IDlist.get(i), ave);
			}
		}
		return unsorted;
		
	}
}