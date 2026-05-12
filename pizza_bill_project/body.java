import java.util.Scanner;

public class body {
    public Scanner sc = new Scanner(System.in);

    public boolean isextracheese(){
        System.out.println("Do you want extra cheese - 100Rs. ?(yes/no)");
        String op1 = sc.nextLine();
        return op1.equalsIgnoreCase("yes");
    }

    public boolean isextratopping(){
        System.out.println("Do you want extra topping - 150Rs. ?(yes/no)");
        String op2 = sc.nextLine();
        return op2.equalsIgnoreCase("yes");
    }

    public boolean istakeaway(){
        System.out.println("Do you want take away - 20Rs. ?(yes/no)");
        String op3 = sc.nextLine();
        return op3.equalsIgnoreCase("yes");
    }

    public void totalbill(int choice){
        int t_bill = 0;
        int P1 =0 , C1 =0 , T1=0 , A1=0;
        if(choice == 1){
            t_bill += 300;
            P1 = t_bill;
        }
        if(choice == 2){
            t_bill += 400;
            P1 = t_bill;
        }
        if(choice == 3){
            t_bill += 550;
            P1 = t_bill;
        }
        if(choice == 4){
            t_bill += 650;
            P1 = t_bill;
        }
        if( choice == 1 || choice == 2){
            if(isextracheese()){
            t_bill += 100;
            C1 = 100;
        }
        if(isextratopping()){
            t_bill += 150;
            T1=150;
        }
        if(istakeaway()){
            t_bill += 20;
            A1=20;
        }
        }
        if( choice == 3 || choice == 4){
            System.out.println("extra cheese and topping already included..\n");
            t_bill += 100;
            C1 = 100;
            t_bill += 150;
            T1=150;
        if(istakeaway()){
            t_bill += 20;
            A1=20;
        }
        }
        System.out.println("------BILL------\n");
        System.out.println("PIZZA :" + P1 + "\nEXTRA CHEESE :" +  C1 + "\nEXTRA TOPPING : " + T1 + "\nTAKE AWAY :" + A1 + "\n------------------\nTOTAL BILL :" + t_bill + "\n");
    }

    public boolean another(){
        System.out.println("do you want to order anything else ? (yes/no)");
        String op4 = sc.nextLine();
        return op4.equalsIgnoreCase("yes");
    }

    public static void main(String args[]){

    }
}
