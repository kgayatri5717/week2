package project;

public class gayatri {
	public static void main(String args[])
	{
		sweets s1=new sweets();
		sweets s2=new sweets();
		sweets s3=new sweets();
		s1.get("laddu", 11);
		s2.get("badusha", 12);
		s3.get("zangri", 8);
		System.out.println("sweets are: "+s1.name+" "+s2.name+" "+s3.name);
	}
	public String display(chocolates c[],int l,int m)
	{String k="";
		for(int i=0;i<5;i++)
		{
			if(c[i].weight>=l&& c[i].weight<=m)
			{
		k=k+c[i].name+" ";
			
			}
		}
		return k;
	}

}
