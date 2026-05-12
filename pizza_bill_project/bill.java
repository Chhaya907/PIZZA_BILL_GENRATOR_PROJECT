import java.util.Scanner;

public class bill {
    public static void main(String args[]){

        System.out.println("-----------------------------PIZZA SHOP---------------------------\n");
        System.out.println("WELCOME TO PIZZA SHOP..!\n");
        do{
        System.out.println("-------MENU-------");
        System.out.println("1.VEG PIZZA - 300 \n2.NON-VEG PIZZA - 400 \n3.DELUXE VEG PIZZA - 550 \n4.DELUXE NON-VEG PIZZA - 650\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pizza choice :");
        int choice = sc.nextInt();

        switch(choice){
            case 1 :
                body b1 = new body();
                b1.totalbill(1);
                break;
            
            case 2 :
                body b2 = new body();
                b2.totalbill(2);
                break;
                
            case 3:
                body b3 = new body();
                b3.totalbill(3);
                break;
                
            default:   
                body b4 = new body();
                b4.totalbill(4); 
        }

        sc.nextLine();

        body a = new body();
        if(!a.another()){
            break;
            
        }


    }while(true);
    System.out.println("THANK YOU FOR VISITING....");
    
    }
}