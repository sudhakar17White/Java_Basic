//String palindrome check

import java.util.*;


class palindrome
{ 
    
    int limit;
    String reverse="";
    
    void process(String word)
    { 
    
        
    
        limit=word.length();
        
        char a;
        
        int p=limit;
             
      
        for(int i=0;i<limit;i++)
        { 
           
            p=p-1;
           
            a=word.charAt(p);
           
            reverse=reverse+a;
            
            
        }
      
        
        
    }
    void condition(String word)
    {
    
        
    
        if(word.equals(reverse))
        { 
            
          System.out.println(word+" Same "+reverse);  
            
            
        }
        else
        { 
            
            System.out.println(word+" Not Same "+reverse);
            
            
        }
     
    }
   
}

public class Main
{
	public static void main(String[] args) {

         Scanner s=new Scanner(System.in);


         palindrome pl=new  palindrome();


        System.out.println("Enter the String :");
        String word=s.nextLine();


            
         pl.process(word);
		 
		 
		 
		 pl.condition(word);
	    
	}
}
