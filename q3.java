import java.util.Scanner;
class q3{
    static int calculateTotal(int m,int e){
        return m+e;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter morning water usage : ");
        int mU = in.nextInt();
        System.out.print("Enter evening water usage : ");
        int eU = in.nextInt();
        int total = calculateTotal(mU, eU);
        System.out.println("Total water used was : "+total);
        in.close();
    }
}