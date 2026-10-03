import java.util.Scanner;
class q2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of water used : ");
        double waterUsed = in.nextDouble();
        int bill = 0;
        if(waterUsed<=500){
            bill += 100;
        }
        else{
            bill += 200;
        }
        System.out.println("Your water bill amount is Rs."+bill+"/-");
        in.close();
    }
}