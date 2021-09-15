import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input Count: " );
      int count = input.nextInt();
    if(count > 0){
      while (count != 0){
        System.out.println(count);
        count--;
      }
      System.out.println("Blast off");
    }
  
    else { 
      while(count != 0){
        System.out.println(count);
          count++;
         }
    }   
    System.out.println("Blast off");
  }
}