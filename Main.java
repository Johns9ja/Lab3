import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int number;

    System.out.println("Enter a number to count down or up from:");
    number = s.nextInt();

    if(number >= 0) {
      int j = number;
      while(j >= 0 )
      {
        System.out.println(j);
        j--;
      }
    }
    else if(number < 0) {
      int k = number;
      while(k <= 0 )
      {
        System.out.println(k);
        k++;
      }
    }



  }
}