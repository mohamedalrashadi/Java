import java.util.Scanner;

public class Example03 {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        System.out.print("How many input prices you want to enter: ");
        int numSize = num.nextInt();


        double[] prices = new double[numSize];

for(int i = 0; i <numSize; i++){
System.out.print("Enter first number " + (i+1) + " : ");
prices[i] = input.nextDouble();

}

        System.out.println("---------------------");
        System.out.println("The numbers you entered are:");

        for (int i = 0; i < numSize; i++) {
            System.out.println("You entered: " + (i + 1) +  " : " + prices[i]);
        }
double sum = 0.0;
System.out.println("---------------- Average ----------------");

   for (double price: prices){
       sum += price;

   }
double average = sum / prices.length;

   System.out.printf("The Sum is : $%.2f%n", sum);
        System.out.printf("The average is: $%.2f%n", average);





    }
}