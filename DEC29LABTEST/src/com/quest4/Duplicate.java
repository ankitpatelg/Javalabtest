package com.quest4;

public class Duplicate {
	
	public void duplicate(String s)
	{
		int len = s.length();
		int i,j;
		int count=1;
		for(i=0; i<=len; i++)
		{
			for(j=i+1; j<len;j++)
			{
				if (s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				
			}
		}
		System.out.println("Duplicate chars in String :"+dupli);
	}

}
