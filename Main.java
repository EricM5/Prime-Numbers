import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a number greater than 2: ");
      int number = in.nextInt();
      while (number <= 2){
        System.out.println("Invalid entry: The number must be larger than 2.");
        System.out.println();
        System.out.print("Enter a number greater than 2: ");
        number = in.nextInt();
      }
      System.out.println();
      int a = 10000;
      int b = 10000;
      if (number != 3 || number != 2){
        a = 2;
        b = 2;
      }
      if (number != 2 || number != 3) {
        while (a <= number) {
          if (b == 2 || b == 3) {
            System.out.println("The number: " + b + " is a prime number.");
            b++;
          }
          if (a == 5 || a == 7 || a == 11 || a == 13) {
            System.out.println("The number: " + a + " is a prime number.");
            a++;
          }     
          if(a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0 && a % 11 != 0 && a % 13 != 0) {
            System.out.println("The number: " + a + " is a prime number.");
              a++;
          } else {
            a++; 
          }
        } 
      }
      System.out.println();
    }
  }
}

  
