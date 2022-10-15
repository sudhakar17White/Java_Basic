import java.util.*;
import java.io.*;


//Time Table 

class Time_Table    //Create class for time_table
{ 
   
    String mon[]={"","Computer Network","Web","oe","ooad","Iot","ooad","ooad"};
    String tue[]={"","DDA","Web","Menter","Cn","English","English","Nptel"};
    String wed[]={"","ooad","cn","Oe","Cn-lab/Web-lab","Cn-lab/Web-lab","Cn-lab/Web-lab","Cn-lab/Web-lab"};
    String thu[]={"","web","Iot","DDA","Web-lab/cn-lab","Web-lab/cn-lab","Web-lab/cn-lab","Web-lab/cn-lab"};
    String fri[]={"","Iot","Ooad","oe","Daa","Daa","Daa","Plc"};
    
    
    void Table()
    { 
       
        
       
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(mon[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
         
         
        System.out.println("\n");
        
         
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(tue[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
        System.out.println("\n");
        
         
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(wed[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
        System.out.println("\n");
        
         
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(thu[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        System.out.println("\n");
        
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(fri[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
        
        
        
    }
    
    void Mon(int day)
    { 
        
        
        System.out.print(mon[day]);
        
        
        
    }
     
    void Tue(int day)
    { 
        
        
        System.out.print(tue[day]);
        
        
        
    }
     
    void Wed(int day)
    { 
        
        
        System.out.print(wed[day]);
        
        
        
    }
     
    void Thu(int day)
    { 
        
        
        System.out.print(thu[day]);
        
        
        
    }
     
    void Fri(int day)
    { 
        
        
        System.out.print(fri[day]);
        
        
        
    }
    
    
    
    
    
    
    
} 

class days extends Time_Table
{ 
    
    void monday()
    { 
        
        
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(mon[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
    }
    void tuesday()
    { 
        
           
        System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(tue[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
        
        
    }
    void wednesday()
    { 
        
          System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(wed[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
    }
    void thursday()
    { 
        
          System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(thu[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
    }
    void friday()
    { 
          System.out.print("\n| ");
        for(int i=1;i<=7;i++)
        { 
            
            System.out.print(fri[i]+"["+i+"]"+"  ");
            
            
            
        }
        System.out.print("|");
        
        
        
    }
    
    
}
class man extends Time_Table
{ 
    
    
    void help()
    { 
        
        
        
        System.out.println("---------Help---------");
        System.out.println("----------------------");
        
        System.out.println("---------Menu---------");
        System.out.println("* table");
        System.out.println("* day");
        System.out.println("* period");
        System.out.println("* Help");
        System.out.println("---------------------");
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}

public class Main
{
	public static void main(String[] args) {
	    
	   Time_Table tt=new Time_Table();
	   days d=new days();
	   man m=new man();
	   
	  
	   
	   
	   Scanner s=new Scanner(System.in);
	   
	   

	   int day;
	   
	 
	
	   
	   DataInputStream din=new DataInputStream(System.in); 
 
	   
	  
	   int ch;
	   String da;
	 
	          
	       
	      
	       try{     
	            da=din.readLine();
	      
	           if(da.equals("table"))
	           {
	      
	            
	                 tt.Table();
	                
	           }
	           else if(da.equals("day"))
	           {
	           
	                 try{
	               
	                 System.out.println("Enter day :");
	                 da=din.readLine();
	                 
	                 if(da.equals("monday"))
	                 {
	                    
	                     d.monday();
	                     
	                 }
	                 else if(da.equals("tuesday"))
	                 { 
	                     
	                      d.tuesday();
	                  
	                     
	                     
	                 }
	                 else if(da.equals("wednesday"))
	                 { 
	                     
	                      d.wednesday();
	                    
	                     
	                     
	                 }
	                 else if(da.equals("thursday"))
	                 { 
	                     
	                      d.thursday();
	                   
	                     
	                     
	                 }
	                 else if(da.equals("friday"))
	                 { 
	                     
	                      d.friday();
	                   
	                     
	                     
	                 }
	                 else
	                 {
	                 
	                    System.out.println("Invalid");
	                 
	                 }
	              
	                 }
	                 catch(Exception e)
	                 { 
	                     
	                     
	                     
	                 }
	           }
	               
	            else if(da.equals("period"))
	            {
	                     try{
	               
	                 System.out.println("Enter day :");
	                 da=din.readLine();
	                 
	                 System.out.println("Enter day :");
	                 da=din.readLine();
	                 day=s.nextInt();
	                 
	                 if(da.equals("monday"))
	                 {
	                    
	                     tt.Mon(day);
	                     
	                     
	                 }
	                 else if(da.equals("tuesday"))
	                 { 
	                     
	                      tt.Tue(day);
	                     
	                     
	                     
	                 }
	                 else if(da.equals("wednesday"))
	                 { 
	                     
	                      tt.Wed(day);
	                    
	                     
	                     
	                 }
	                 else if(da.equals("thursday"))
	                 { 
	                     
	                      tt.Thu(day);
	                     
	                     
	                     
	                 }
	                 else if(da.equals("friday"))
	                 { 
	                     
	                      tt.Fri(day);
	                     
	                     
	                     
	                 }
	                 else
	                 {
	                 
	                    System.out.println("Invalid");
	                 
	                 }
	                 
	                 }
	                 catch(Exception e)
	                 { 
	                     
	                     
	                     
	                 }
	               
	            }
	            else if(da.equals("help"))
	            { 
	                
	                m.help();
	                
	                
	            }
	            else
	            { 
	                
	                System.out.println("Invalid");
	                
	             
	            }
	         
	           
	       
	       
	       }catch(Exception e)
	       { 
	           
	           
	           
	       }
	 
	   
	   
	   
	   
	}
}
