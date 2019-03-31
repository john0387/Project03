public class MesoAscii extends MesoAsciiAbstract
{
	char[] code = new char[4];
	String id;
	
	public MesoAscii(MesoStation MS)
	{
		id = MS.getStID();
		code[0] = id.charAt(0);
		code[1] = id.charAt(1);
		code[2] = id.charAt(2);
		code[3] = id.charAt(3);
	}
	
	public int calAverage()
	{
		int sumValues=0;
		double rawAverage;
		double numValues=4.0;
		for(int i = 0;i<code.length;i++) {
			sumValues += (int)code[i];
		}
		rawAverage = sumValues/numValues;
		return (int)Math.round(rawAverage);
	}
}