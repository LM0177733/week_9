Psudocode
function routePacket(fabric, start, goal):

   rows = number of rows in fabric

   cols = number of columns in fabric

   

   visited = 2D array initialized to false

   

   if backtrack(start.row, start.col):

       return true  // valid route found

   else

       return false // no valid route
       }
       bool backtrack(node,node)
       {
       visited=new[row,col]
       for(int i=0;visited.x(row).length;i++)
       {
        for(int j=0;visited.y(col).length;j++)
       {
        if(row[i]!=null&&col[i]!=null)
       {
       if(row[i]!<101||col[i]!<101)
       {
       if(row[i]!>130||col[i]!<130)
       {
       return false;
       }
       }
       }
       }
       }
       return true;
     
       
       }
