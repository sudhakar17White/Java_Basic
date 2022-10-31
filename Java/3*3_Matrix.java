import java.util.*;
public class Main
{
	public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        
        System.out.println("3 * 3 Diaginol print");
        
        
        int a[][]=new int[3][3];
        
        
        for(int i=0;i<3;i++)
        { 
            
            for(int j=0;j<3;j++)
            { 
                
                a[i][j]=s.nextInt();
                
                
            }
           
        }
        
         for(int i=0;i<3;i++)
        { 
            
            for(int j=0;j<3;j++)
            { 
                
            System.out.print(a[i][j]+"  ");    
                
                
            }
           
           System.out.println("\n");
           
        }
        int i=0,j=0;
        
        System.out.println("(0,0)to(2,2)");
          for(i=0;i<3;i++)
        { 
            
            System.out.println(a[i][j]);
            j++;
           
        }
        
        
                System.out.println("(0,2)to(2,0)");
        i=0;
        for(j=2;j>=0;j--)
        { 
            
            System.out.println(a[i][j]);
            i++;
           
        }
        
        System.out.println("(2,0)to(0,2)");
        j=0;
        for(i=2;i>=0;i--)
        { 
            
             System.out.println(a[i][j]);
             j++;
            
            
        }
        
        j=2;
        System.out.println("(2,2)to(0,0)");
          for(i=2;i>=0;i--)
        { 
            
            System.out.println(a[i][j]);
            j--;
           
        }
        
        
        
        

		
	}
}
