import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
    
       
       Scanner s=new Scanner(System.in);
       
       
       //object creation for hash map
       
       HashMap<Integer,String> hs=new HashMap<Integer,String>();
       

        DataInputStream ds=new DataInputStream(System.in);

       for(int i=0;i<3;i++)
       { 
           
           int index=s.nextInt();
           
           String name=ds.readLine();
           
           hs.put(index,name);// this method to add the value to the hash map
           
           
       }
       
       // get methhod 
       
       int g=s.nextInt();
       
       System.out.println(hs.get(g));
       
       //remove methhod
       
       int r=s.nextInt();
       
       
       System.out.println(hs.remove(r));
       
       //retrun the size of hash map
       
       System.out.println(hs.size());
       
       //for each looping 
       
       //to print the present in the hashmap
       for(int i:hs.keySet())
       { 
           
           System.out.println(i);
           
       }
       

        //to print the present hash map values        
       for(String i:hs.values())
       { 
           
           System.out.println(i);
           
       }
       
       
	
	}
}
