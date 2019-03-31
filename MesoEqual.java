import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MesoEqual
{
	String id;
	ArrayList<String> IDlist = new ArrayList<String>();
	
	public MesoEqual(String StID)
	{
		id = StID;
		BufferedReader BR = new BufferedReader(new FileReader(Mesonet.txt));
        String line = BR.readLine();
        line = BR.readLine();
        line = BR.readLine();
        while(line!=null) {
        	IDlist.add(line.substring(1,5));
        	line = BR.readLine();        		
        }
        BR.close();
	}
	
	public int calAsciiEual()
	{
		return 0;
	}
}