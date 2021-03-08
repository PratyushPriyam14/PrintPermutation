import java.io.*;
import java.util.*;
public class Permutation
{
  public static void main(String []args)throws Exception{
    Scanner s=new Scanner(System.in);
    String str=s.next();
    printpermutation(str,"");
  }
  public static void printpermutation(String ques,String ans)
  {
    if(ques.length()==0)
    {
      System.out.prinltn(ans);
      return;
    }
    for(int i=0;i<ques.length();i++)
    {
      char ch=ques.charAt(i);
      String quesleftpart=ques.substring(0,i);
      String quesrightpart=ques.substring(i+1);
      String restofques= quesleftpart + quesrightpart;
      printpermutation(restofques,ans+ch);
    }
  }
}
