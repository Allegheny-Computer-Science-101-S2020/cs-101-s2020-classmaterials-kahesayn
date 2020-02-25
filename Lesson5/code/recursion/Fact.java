public class Fact{
  public static int factorial(int n){
    // int fact = 1;
    // for (int i = 0; i < n; i--){
    //   fact = num * fact;
    // }
    // return fact;

    if (n<=1){
      return 1;
    }
    return n * factorial(n-1);
  }

  public static int sum(int n){
    if (n<=1){
      return 1;
    }
    return n + sum(n-1);
  }

  public static void main(String[] args){
    int n = 20;
    System.out.println((n*(n+1))/2);
  }
}
