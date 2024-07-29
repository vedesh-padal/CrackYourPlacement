import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
      
      // Stack<Character> stk = new Stack<>();
      // for (char it: s.toCharArray())  {
      //     if (it == '(' || it == '{' || it == '[')
      //         stk.push(it);
      //     else {
      //         if (stk.isEmpty())  return false;
      //         char p = stk.pop();
              
      //         if ((p == '(' && it == ')') || (p == '{' && it == '}') || (p == '[' && it == ']'))
      //             continue;
      //         else return false;
      //     }
      // }
      // return stk.isEmpty();

      Stack<Character> stk = new Stack<>();
      for (char c: s.toCharArray())   {
          if (c == '(')
              stk.push(')');
          else if (c == '[')
              stk.push(']');
          else if (c == '{')
              stk.push('}');
          else if (stk.isEmpty() || c != stk.pop())
              return false;
      }
      return stk.isEmpty();
  }
}