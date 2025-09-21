package singletonepattern;

public class TVset {
	private static volatile TVset tvset=null;
	private TVset()
	{
		System.out.println("Inside TVset constructor");
	}
	
	public static TVset getTVsetInstance()
	{
		if(tvset==null)
		{
			synchronized(TVset.class)
			{
				if(tvset==null)
					tvset= new TVset();
			}
		}
		return tvset;
	}
	

}
