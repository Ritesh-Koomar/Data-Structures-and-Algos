public class Hello
  {
    public static void main(String[] args)
    {
         print(5); 
    }
    public static void print(int n)
    {
        if(n==0)
          return ;
        fun(n-1);
        System.out.print(n);
    }
  }
