import java.util.Scanner;
public class Telecom {
    public static void Greeting(){
      System.out.println("This is a telecommunication system app");
            System.out.println("Type any of the listed networks");
            System.out.println("1. mtn");
            System.out.println("2. airtel");
            System.out.println("3. glo");
            System.out.println("4. 9 mobile");
            System.out.print("Selected network here = ");
    }
    public static void  mtn(){
        Scanner F;
        F = new Scanner(System.in);
        System.out.println("You've seleccted the mtn network");
        System.out.println("what will you like to do in the listed option");
         System.out.println("1. Buy data");
    System.out.println("2. Buy Airtime");
    System.out.println("3. Borrow Airtime");
    System.out.println("4. Borrow data");
    System.out.println("5. Repay loan");
    System.out.print("Select here ");
       String G;
        G = F.nextLine();
        switch (G) {
            case "1":
                System.out.println("How much data will you like to buy?");
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String H;
    H= F.nextLine();
    switch (H){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network");
                 break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network");
                                 break;
    }
    
                break;
            case "2":
                System.out.println("How much Airtime will ou like to buy?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String I;
    I= F.nextLine(); 
                switch (I){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "3":
                System.out.println("How much airtime will you like to borrow?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String J;
    J= F.nextLine(); 
                switch (J){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "4":
                System.out.println("How much data will you like to borrow?");
                 System.out.println("How much data will you like to buy?");
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String K;
    K= F.nextLine();
    switch (K){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network");
                                 break;
    }
                
                break;
            case "5":
                System.out.println("Repay my money sir!");
                break;
            default:
                System.out.println("Re-run the program.");
                break;
        }
        
    }
    
    public static void airtel()
    {
       Scanner F;
        F = new Scanner(System.in);
        System.out.println("You've seleccted the Airtel network");
        System.out.println("what will you like to do in the listed option");
         System.out.println("1. Buy data");
    System.out.println("2. Buy Airtime");
    System.out.println("3. Borrow Airtime");
    System.out.println("4. Borrow data");
    System.out.println("5. Repay loan");
    System.out.print("Select here ");
       String G;
        G = F.nextLine();
        switch (G) {
            case "1":
                System.out.println("How much data will you like to buy?");
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String H;
    H= F.nextLine();
    switch (H){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network");
                                 break;
    }
    
                break;
            case "2":
                System.out.println("How much Airtime will ou like to buy?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String I;
    I= F.nextLine(); 
                switch (I){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "3":
                System.out.println("How much airtime will you like to borrow?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String J;
    J= F.nextLine(); 
                switch (J){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network"); break;
                           
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "4":
                System.out.println("How much data will you like to borrow?");
                 
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String K;
    K= F.nextLine();
    switch (K){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network"); break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network"); break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network"); break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network"); break;
    }
                
                break;
            case "5":
                System.out.println("Repay my money sir!");
                break;
            default:
                System.out.println("Re-run the program.");
                break;
        }
    }
    public static void glo() {
       Scanner F;
        F = new Scanner(System.in);
        System.out.println("You've seleccted the Glo network");
        System.out.println("what will you like to do in the listed option");
         System.out.println("1. Buy data");
    System.out.println("2. Buy Airtime");
    System.out.println("3. Borrow Airtime");
    System.out.println("4. Borrow data");
    System.out.println("5. Repay loan");
    System.out.print("Select here ");
       String G;
        G = F.nextLine();
        switch (G) {
            case "1":
                System.out.println("How much data will you like to buy?");
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String H;
    H= F.nextLine();
    switch (H){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network");
                                 break;
    }
    
                break;
            case "2":
                System.out.println("How much Airtime will ou like to buy?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String I;
    I= F.nextLine(); 
                switch (I){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "3":
                System.out.println("How much airtime will you like to borrow?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String J;
    J= F.nextLine(); 
                switch (J){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network"); break;
                           
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "4":
                System.out.println("How much data will you like to borrow?");
                 
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String K;
    K= F.nextLine();
    switch (K){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network"); break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network"); break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network"); break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network"); break;
    }
                
                break;
            case "5":
                System.out.println("Repay my money sir!");
                break;
            default:
                System.out.println("Re-run the program.");
                break;
        }
    }
        public static void etisalat() {
       Scanner F;
        F = new Scanner(System.in);
        System.out.println("You've selected the Etisalat network");
        System.out.println("what will you like to do in the listed option");
         System.out.println("1. Buy data");
    System.out.println("2. Buy Airtime");
    System.out.println("3. Borrow Airtime");
    System.out.println("4. Borrow data");
    System.out.println("5. Repay loan");
    System.out.print("Select here ");
       String G;
        G = F.nextLine();
        switch (G) {
            case "1":
                System.out.println("How much data will you like to buy?");
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String H;
    H= F.nextLine();
    switch (H){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network");
                                 break;
    }
    
                break;
            case "2":
                System.out.println("How much Airtime will ou like to buy?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String I;
    I= F.nextLine(); 
                switch (I){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network");
                            break;
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "3":
                System.out.println("How much airtime will you like to borrow?");
                 System.out.println("1. 100 naira");
    System.out.println("2. 200 naira");
    System.out.println("3. 300 naira");
    System.out.println("4. 400 naira");
    System.out.println("5. 500 naira");
    System.out.print("Select here ");
                String J;
    J= F.nextLine(); 
                switch (J){
        case "1":
             System.out.println("100 naira of Airtime has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200 naira of Airtime has been sent to our mobile network");
                  break;
                  case "3":
             System.out.println("300 naira of Airtime has been sent to our mobile network");
                       break;
                       case "4":
             System.out.println("400 naira of Airtime has been sent to our mobile network"); break;
                           
                            case "5":
             System.out.println("500 naira of Airtime has been sent to our mobile network");
                                 break;
                 }
                break;
            case "4":
                System.out.println("How much data will you like to borrow?");
                
         System.out.println("1. 100MB");
    System.out.println("2. 200MB");
    System.out.println("3. 300MB");
    System.out.println("4. 400MB");
    System.out.println("5. 500MB");
    System.out.print("Select here ");
    String K;
    K= F.nextLine();
    switch (K){
        case "1":
             System.out.println("100MB of data has been sent to our mobile network");
            break;
             case "2":
             System.out.println("200MB of data has been sent to our mobile network"); break;
                  case "3":
             System.out.println("300MB of data has been sent to our mobile network"); break;
                       case "4":
             System.out.println("400MB of data has been sent to our mobile network"); break;
                            case "5":
             System.out.println("500MB of data has been sent to our mobile network"); break;
    }
                
                break;
            case "5":
                System.out.println("Repay my money sir!");
                break;
            default:
                System.out.println("Re-run the program.");
                break;
        }
    }
   
    public static void main(String args[]){
        Greeting();
    Scanner MUiz =new Scanner(System.in);
    String i = MUiz.nextLine();
  
    
    if (null != i) switch (i) {
            case "1":
                mtn();
                break;
            case "2":
                airtel();
                break;
            case "3":
                glo();
                break;
            case "4":
                etisalat();
                break;
            default:
                System.out.println("Not In The Option");
                break;
        }
            
    }

}



