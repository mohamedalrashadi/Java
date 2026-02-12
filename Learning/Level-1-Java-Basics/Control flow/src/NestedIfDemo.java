public class NestedIfDemo {
    public static void main(String[] args){
        int age = 25;
        boolean hasLincense = true;
        boolean hasCar = true;


                if (age >= 18)

                {
                    System.out.println("old enough to Drive ");
                    if (hasLincense)

                    {
                        System.out.println("Has a Lincenese");
                        if (hasCar)

                        {
                            System.out.println("Has a Car");
                            System.out.println("You can drive ");
                        }
                        else {  System.out.println("No Car - rent one"); }


                    }
                    else {
                        System.out.println("No lincense --- get one first");
                    }



                }
                else {
                    System.out.println("Too young for drive ");

                }





    }
}
