import java.util.*;
public class CombineList2
{
  /* This program merges two array lists, alternating elements from both array lists.
   * If one array is shorter than the other; then alternate as long as you can and then
   * apend the remaining elements from the longer array lists
   **/
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    

    
    
    System.out.println("Please input the numbers for your first list and the type 'next'");
   
    while (!in.nextLine().equals("next"))
    {
    while (in.hasNextInt())
      {
        list1.add(in.nextInt());
      }
    }
     
    System.out.println("Please input the number for your second list and then type 'next'");
   while (!in.nextLine().equals("next"))
   {
      while (in.hasNextInt())
      {
        list2.add(in.nextInt());
      }
    }
   //System.out.print("Here is your merged list" + " " + merge(list1,list2));
   //System.out.print(Integer.toString(list1.size()));
  }
    

  public static ArrayList<Integer> addtolist(int[] values)
  {
    ArrayList<Integer> newlist = new ArrayList<Integer>();
    for (int i = 0; i < values.length - 1; i++)
    { 
      newlist.add(values[i]);
    }
    return newlist;
  }
  public static ArrayList<Integer> larger(ArrayList<Integer> a, ArrayList<Integer> b)
  {
    if ( a.size() > b.size())
    { return a;}
    else 
    { return b;}
  }  
  public static ArrayList<Integer> smaller(ArrayList<Integer> a, ArrayList<Integer> b)  
  {
    if ( a.size() < b.size())
    { return a;}
    else 
    { return b;}
  }

  
  public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
  {
    ArrayList<Integer> mergedlist = new ArrayList<Integer>();
    ArrayList<Integer> largerlist = larger(a,b);
    ArrayList<Integer> smallerlist = smaller(a,b);
    for (int j = 0; j < largerlist.size(); j++)
    {
      if (j < smallerlist.size())
      {
      mergedlist.add(smallerlist.get(j));
      mergedlist.add(largerlist.get(j));
      }
      else 
      {
        mergedlist.add(largerlist.get(j));
      }
    }
    
    return mergedlist;
  }
}
  
 
  


              
    