import java.util.*;
/**
 * BaseballGame
 */
public class BaseballGame {

  public static void main(String[] args) {
    String ops[]={"5","2","C","D","+"};
    int result=0;
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<ops.length;i++)
    {
      if(ops[i].equals("C"))
      {
        stack.pop();
      }
      else if(ops[i].equals("D"))
      {
        stack.push(stack.peek()*2);
        
      }
      else if(ops[i].equals("+"))
      {
        int temp = stack.pop();
        int sum = temp + stack.peek();
        stack.push(temp);
        stack.push(sum);
      }
      else
      {
        stack.push(Integer.parseInt(ops[i]));
      
      }
    }
    while (stack!=null) {
      if(stack.isEmpty())
      {
        break;
      }
      result+=stack.pop();
    }
    System.out.println(result);
  }
}


