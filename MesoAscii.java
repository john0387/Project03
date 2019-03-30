public class MesoAscii extends MesoAsciiAbstract
{
	char[] code = new char[4];
	String id;
	char aveC;
	
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
		return 0;
	}
}