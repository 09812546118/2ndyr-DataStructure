/***
   infix to postfix converter
**/
public class InfixToPostfix{
   //define object variable
   private String infix;
   //constructor
   public InfixToPostfix(String infix)    { this.infix = infix; }
   //
   private boolean isOperator(char ch)    { return ch=='+' || ch=='-' || ch=='/' || ch=='*'; }
   private boolean isLowerPrecedence(char a,char b){
      switch(a){
         case '+':case '-': return !((b=='+') || (b=='-'));
         default: return false;
      }
   }
   private boolean isSpace(char ch)       { return ch == ' '; }
   public String convert(){
      StringBuffer sb=new StringBuffer();
         if(!infix.equals("")){
            //i will use built-in Stack from the util package
            java.util.Stack stack = new java.util.Stack(); 
            java.util.StringTokenizer st = new java.util.StringTokenizer(infix,"*-/+ ",true);
            while(st.hasMoreTokens()){
               String token = st.nextToken(); //iterator operator
               char ch = token.charAt(0);
               if(isOperator(ch)){
                  while(!stack.empty() && !isLowerPrecedence(stack.peek().toString().charAt(0),ch)){
                     sb.append(stack.pop()).append(" ");
                  }
                  stack.push(ch);
               }
               else sb.append(token).append(" ");
            }    
            while(!stack.empty()){
               sb.append(stack.pop()).append(" ");
            }
         }
      return sb.toString();
   }
   //
   public double compute(){
      double result = 0.0;
         ///yours to code
      return result;
   }
   //
   static public void main(String ...args){
      String infix = "10-2*3+4/5";
      InfixToPostfix itf = new InfixToPostfix(infix);
      System.out.println(itf.convert());
   }
}//end of class