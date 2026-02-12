import java.util.Scanner;
public class inputDeom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Your name : "+ name);

        input.close();

    }

}
