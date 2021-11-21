package Stack;

import java.util.Stack;

public class ValidParanthisis {

	public static void main(String[] args) {
		
		String s="{[{}]}";
//	   Stack stk=new Stack();

	   for(int i=0 ;i<s.length();i++)
       {
           char ch=s.charAt(i);
          switch(ch)
          {
          case '(':stk.push(ch);
          break;
          case '{':stk.push(ch);
          break;
          case '[':stk.push(ch);
          break;
          case ')': if(stk.isEmpty()==false)
                  {
                       char preChar=(char)stk.peek();
	                   if(preChar == '(')
                           stk.pop();
                        else
                            System.out.println(false);
                  }
                  else
                	  System.out.println(false); 
          break;
          case '}': if(stk.isEmpty()==false)
                  {
                       char preChar1=(char)stk.peek();
	                   if(preChar1 == '{')
                           stk.pop();
                        else
                        	System.out.println(false);
                  }
                  else
                	  System.out.println(false);
          break;
          case ']':
                  if(stk.isEmpty()==false)
                  {
                       char preChar2=(char)stk.peek();
	                   if(preChar2 == '[')
                           stk.pop();
                      else
                    	  System.out.println(false);
                  }
                  else
                	  System.out.println(false);
                 
          break;
          default:;
          
          }
       }
	   if(stk.isEmpty())
	   {
		   System.out.println(true);
	   }
	   else
		   System.out.println(false);
	}

}
