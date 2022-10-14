public class ControlStatements {
    public static void main(String[] args) {
        int year=2020;
        int number=20;
        int age=25;
        int weight=48;
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");
        }

        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);


        //nested if

        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }

        //switch statements

        switch(number){
            //Case statements
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }

    }
}
