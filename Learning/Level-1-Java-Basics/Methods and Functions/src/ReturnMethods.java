public class ReturnMethods {

    public static int add (int a, int b){
        return a + b;
    }
    public static double CircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static String getGrade(int score){
        if (score >= 90) return "A";
        else if (score >= 80 ) return "B";
        else if (score > 70 ) return "C";
        else if (score > 60) return "D";

        else return "F";


    }

    public static void main (String[] args){
        int sum = add(10,20);
        double area = CircleArea(5.0);
        String grade = getGrade(85);

        System.out.println("Sum : "+ sum);
        System.out.printf("Area  : %.2f%n", area);
        System.out.println("Grade : "+ grade);


        System.out.println("Add 7 + 3 "+ add(7,3));





    }



}
