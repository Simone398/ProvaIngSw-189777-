package it.unical.ingsw.ProvaIntermedia;

import java.util.ArrayList;


public class MyListUtil 
{
  public MyListUtil(){}
  
  
 public int[] setCrescente(int[] input) {
	  ArrayList<Integer> input1= new ArrayList<Integer>();
	  for(int i=0;i<input.length;i++)
	  {
		  input1.add(input[i]);
	  }
	  int min=0;
	  boolean first=true;
	  int[] output=new int[input.length];
	  int x=0;
	  int pos=0;
	  while(input1.size()!=0)
	  {
	    for(int i=0;i<input1.size();i++)
		 {
			 if(first)
			 {
				 min=input1.get(i);
				 first=false;
				 pos=i;
			 }
			 else if(input1.get(i)<min)
			 { 
				min=input1.get(i);
				pos=i;
			 }
		 }
		 first=true;
		 output[x]=min;
		 input1.remove(pos);
		 x++;
	
		  
	  }
	  for(int i=0;i<output.length;i++)
	  {
		  System.out.println(output[i]);
	  }
	   return output;
	  
  }
  
  public int[] setDecrescente(int[] input) {
	  ArrayList<Integer> input1= new ArrayList<Integer>();
	  for(int i=0;i<input.length;i++)
	  {
		  input1.add(input[i]);
	  }
	  int min=0;
	  boolean first=true;
	  int[] output=new int[input.length];
	  int x=0;
	  int pos=0;
	  while(input1.size()!=0)
	  {
	    for(int i=0;i<input1.size();i++)
		 {
			 if(first)
			 {
				 min=input1.get(i);
				 first=false;
				 pos=i;
			 }
			 else if(input1.get(i)>min)
			 { 
				min=input1.get(i);
				pos=i;
			 }
		 }
		 first=true;
		 output[x]=min;
		 input1.remove(pos);
		 x++;
	
		  
	  }
	  for(int i=0;i<output.length;i++)
	  {
		  System.out.println(output[i]);
	  }
	   return output;
	  
  }
  public static void main(String[] args) {
	  
	MyListUtil a=new MyListUtil();
	int[] prova={10,2,3,4,1,20,30,21,15};
	a.setDecrescente(prova);
	
  }
   
}
