public class PrintfDemo {
    public static void main(String[] args){
        String name = "Sara";
        int age = 20;
        double gpa = 3.856789;
        char grade = 'A';
        boolean passed = true;


        System.out.printf
                ("Name         :%s%n",name );
        // %s for String , %n for new line
        System.out.printf
                ("Age          :%d%n", age);
        System.out.printf
                ("gpa          :%.2f%n", gpa);
        System.out.printf
                ("grad         :%c%n", grade);
        System.out.printf
                ("passed       : %b%n", passed);

        // in one pritn
        System.out.printf
                ("%n Student %s (age %d) passed with GPA %.2f%n", name, age, gpa);



    }
}
