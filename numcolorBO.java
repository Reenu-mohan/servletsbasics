package com.deloitte;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class numcolorBO {
	public Integer[] generateMsg(int n1, int n2)
	 {
		Integer ar[]= new Integer[2] ;   
		
		if(n1>n2)
		{
		 ar[0]= n1;	
		 ar[1]=n2;
		 
		}
		else if(n1<n2)
		{
			ar[1]= n1;	
		 ar[0]=n2;
		
		}
		else
			ar[0]=n1;
		return ar;
	 }
	
}
