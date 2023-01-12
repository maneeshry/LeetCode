class Solution {
  public boolean isValid(String s) {
      if(s.length() == 0)
          return true;
      if(s.length() % 2 == 1)
          return false;
      Stack<Character> stack = new Stack<>();
      for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) == '{') {
              stack.push('{');
          }
          else if(s.charAt(i) == '[') {
              stack.push('[');
          }
          else if(s.charAt(i) == '(') {
              stack.push('(');
          }
          else{
              if(stack.empty())
                  return false;
          if(s.charAt(i) == '}' && stack.peek() == '{') {
              stack.pop();
              continue;
          }
          if(s.charAt(i) == ']' && stack.peek() == '[') {
              stack.pop();
              continue;
          }
          if(s.charAt(i) == ')' && stack.peek() == '(') {
              stack.pop();
              continue;
          }
          else
              return false;
      }
  }
      
      
      if(stack.empty())
          return true;
      return false;
      
  }

}