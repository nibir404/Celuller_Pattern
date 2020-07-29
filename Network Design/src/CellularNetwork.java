import java.util.Scanner;

public class CellularNetwork {
    public void CallRate(){
        System.out.println("-----Enter any operator-----");
        System.out.println("1 - Gp\n" + "2 - Airtel\n" + "3 - Banglalink");
        Scanner input = new Scanner(System.in);
        int User = input.nextInt();
        if (User == 1){
            System.out.println("you choose Gp operator ");
            Scanner sc = new Scanner(System.in);
            double minute,Crate;
            double rate = 1.25;
            System.out.println("Enter your minute to know the call rate : ");
            minute = sc.nextDouble();
            Crate = minute*rate;
            System.out.println("You call rate for Gp is "+Crate+" taka");
        }
        else if (User == 2){
            System.out.println("you choose Airtel operator");
            Scanner sc = new Scanner(System.in);
            double minute,Crate;
            double rate = 1.35;
            System.out.println("Enter your minute to know the call rate : ");
            minute = sc.nextDouble();
            Crate = minute*rate;
            System.out.println("You call rate for Airtel is "+Crate+" taka");
        }
        else if (User == 3){
            System.out.println("you choose Banglalink operator");
            Scanner sc = new Scanner(System.in);
            double minute,Crate;
            double rate = 1.25;
            System.out.println("Enter your minute to know the call rate : ");
            minute = sc.nextDouble();
            Crate = minute*rate;
            System.out.println("You call rate for Banglalink is "+Crate+" taka");
        }
        else System.out.println(" Try again you didn't choose any operator!!!!!");
        {
            if (User !=1 && User !=2 && User!=3){
                CallRate();
            }
        }
    }
}
