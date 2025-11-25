import java.util.Scanner;

public class Tester {
int[][] visited={{1,2,3,4},{1,2,3,4,5}};
 
	public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
Tester newobj=new Tester();
 System.out.println("Type the number of rows & Columns you want in the array");
System.out.println("In the format of number of ROWS first then number of COLUMNS");
 newobj.backtrack(1,5);

    //   for(int j=0;j<visited.length;j++)
    //   {
     //   for(int i=0;i<visited.length;i++)
    //   {
     //   if(backtrack(visited[i], visited[j]))
//{
     //  backtrack.true;  // valid route found
//}
   //else
//{
      // return false; // no valid route
//}
    }

       public boolean backtrack(int rowint,int colint)
       {
       
        Scanner myObj = new Scanner(System.in);
         for(int i=0;i<visited.length-1;i++)//
       {
        for(int j=0;j<visited[rowint].length-1;j++)
       {
        System.out.println("Enter value");
        visited[i][j]=myObj.nextInt();
       }
    }
      for(int i=0;i<visited.length;i++)//
       {
          for(int j=0;j<visited[i].length;j++)
       {
    System.out.println("Value is "+ visited[i][j]);
       }
      }
             //int rows=4;
        // int cols=5;
		
      // visited=new[rows,cols]//give it the same length and width as fabric
       for(int i=0;i<visited.length;i++)//
       {
        for(int j=0;j<visited[i].length;j++)
       {
        if(visited[i][j]!=0)
       {
         System.out.println("Value is"+ visited[i][j]);
       if(visited[i][j]<=100)
       {
       if(visited[i][j]>=131)
         System.out.println("Value is"+ visited[i][j]);
       {
        System.out.println("Nope");
        System.out.println("Value is"+ visited[i][j]);
       return false;
       }
       }
       }
      }
       }
        System.out.println("Yep");
       return true;
     
       
       }
       

	}


