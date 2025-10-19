import java.util. Scanner;


public class Example02 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);


        String[] days = new String[3];
        System.out.println("Please enter 3 days of the week:");

for(int i =0; i < days.length; i++) {
    System.out.print("Enter day: " + (i + 1) + " : ");
    days[i] = input.nextLine();

}

        System.out.println("---------------------");
        System.out.println("The days you entered are:");




        for (int i = 0; i < days.length; i++) {
            System.out.println("Day " + (i + 1) + " : " + days[i]);
        }




        input.close();
        }

}