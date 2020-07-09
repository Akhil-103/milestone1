package V1;

public class Salesman {
	private int sid;
	private String name;
	private int Qsales[];
	public Salesman()
	{
		
	}
	public Salesman(int sid,String name,int Qsales[])
	{
		this.sid=sid;
		this.name=name;
		this.Qsales=Qsales;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getQsales() {
		return Qsales;
	}
	public void setQsales(int[] qsales) {
		Qsales = qsales;
	}

}
