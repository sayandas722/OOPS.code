
public class TryCatchFinally {
  
  //exception handling using try-catch-finally keywords
  
  public static void main(String[] args) { 
    
    System.out.println("********************CASE 1:********************");
    tryCatch(); 
    System.out.println("********************CASE 2:********************");
    tryCatchFinally();
    System.out.println("********************CASE 3:********************");
    tryCatchFinallyNoException();
  }
  
  public static void tryCatch(){
    try{   //code that can throw exceptions will be enclosed in the try block
      int i=10/0;   //will throw an arithmetic exception as we are attemting division by zero on integer data type
      
    }catch(ArithmeticException arith_exc){   //catching the instance of the exception using catch keyword
      System.out.println(arith_exc + " caught in catch block");   //handling the exception
    }
  }
  
  public static void tryCatchFinally(){
    try{
      int i=10/0;   //will throw an arithmetic exception as we are attemting division by zero on integer data type
      
    }catch(ArithmeticException arith_exc){   //catching the instance of the exception using catch keyword
      System.out.println(arith_exc + " caught in catch block");   //handling the exception
    }finally{
      //finally block will be executed regardless whether an exception is thrown or not
      System.out.println("We are in the finally block" ); 
    }
  }
  
    public static void tryCatchFinallyNoException(){
    try{
      int i=10/5;   //will not throw an arithmetic exception  
      
    }catch(ArithmeticException arith_exc){   //no exception would be caught by catch
      System.out.println(arith_exc + " caught in catch block");   
    }finally{
      //finally block will be executed regardless whether an exception is thrown or not
      System.out.println("We are in the finally block" ); 
    }
  }
  

  
}
