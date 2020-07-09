package V2;
import V1.*;
public class SalesmanDemo {
	public static Salesman [] topPerformers(Salesman s[],int Quarter)
	{
		Salesman k[]=new Salesman[0];
		int j;
		int max=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getQsales()[Quarter-1]>max)
			{
				max=s[i].getQsales()[Quarter-1];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].getQsales()[Quarter-1]==max)
			{
				Salesman[] newarr=new Salesman[k.length+1];
				for(j=0;j<k.length;j++)
				{
					newarr[j]=k[j];
				}
				newarr[j]=s[i];
				k=new Salesman[j+1];
				k=newarr;
			}
		}
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salesman s[]=new Salesman[5];
		s[0]=new Salesman(123,"Ramu",new int[]{100,400,500});
		s[1]=new Salesman(124,"Ravi",new int[]{100,500,600});
		s[2]=new Salesman(125,"Raju",new int[]{700,800,300});
		s[3]=new Salesman(126,"Rahul",new int[]{120,604,650});
		s[4]=new Salesman(127,"Rajesh",new int[]{700,800,300});
		
		Salesman[] m=topPerformers(s,1);
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Name: "+m[i].getName());
		}
	}

}
