public class Main {


    public static void main(String[] args) {

        System.out.println("                                                                                       ");

        ageTemp(15, -12);
        {

            System.out.println("зима");
        }

        ageTemp(18, 20);
        {

            System.out.println("весна");
        }

        ageTemp(24, 30);
        {

            System.out.println("лето");
        }

        ageTemp(25, 18);
        {

            System.out.println("осень");
        }
        ageTemp(30, -10);
        {

            System.out.println("снова зима");
        }



    }
    public static String ageTemp(int age, int temperature){

        if (age > 20 && age < 45 && temperature > -20 && temperature > 30) {
            System.out.println("Можно идти гулять!");
        }
        else if (age < 20 && temperature > 0 && temperature < 28){
            System.out.println("Можно идти гулять!");
        }
        else if (age > 45 && temperature > -10 && temperature < 25){
            System.out.println("Можно идти гулять!");



        }else {
            System.out.println("оставайтесь дома");

        }


        return " " + temperature+ " " + age;
    }




}