import java.util.Scanner;
 
public class JavaProgram
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    multiply = first * second;
   
    System.out.println("Sum = " + add);
    System.out.println("Multiplication = " + multiply);
   
}