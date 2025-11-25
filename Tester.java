import java.util.Scanner;

public class Tester {

 int[][] visited=new int[4][5];

	public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
Tester newobj=new Tester();


newobj.backtrack(4,5);

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
        for(int j=0;j<visited[rowint-1].length;j++)
       {
         System.out.println("The values for rows and columns start at 0");
        System.out.println("Enter value for row "+i+" & column "+j);
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


