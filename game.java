package gameStore;

import java.util.Scanner;

public class GameStorePurchase {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;

    while (choice != 6) {
    	
        System.out.println("\nGames Menu");
        System.out.println("1. Call of Warfare");
        System.out.println("2. Speed Racers");
        System.out.println("3. Mystery Mansion");
        System.out.println("4. Pixel Adventure");
        System.out.println("5. Puzzle Mania");
        System.out.println("6. Checkout/Exit");
        
        System.out.print("Choose an option: ");
        choice = sc.nextInt();
        
        System.out.println("How many copies you’d like purchase?");
        int copies =sc.nextInt();
        
        System.out.println("Game(s) added to your cart!");

        if (choice >= 1 && choice <= 5) {
        	
            switch (choice) {
                case 1:
                    int cow = 1500;
                    int sum = cow * copies;
                    System.out.println(sum);
                    break;
                case 2:
                	int sr = 1200;
                    int srsum = sr * copies;
                    System.out.println(srsum);
                    break;
                case 3:
                	int mm = 1000;
                    int mmsum = mm * copies;
                    System.out.println(mmsum);
                    break; 
                case 4:
                	int ad = 800;
                    int adsum = ad * copies;
                    System.out.println(adsum);
                    break;
                case 5:
                	int pm = 500;
                    int pmsum = pm * copies;
                    System.out.println(pmsum);
                    break;
            }
        } else if (choice == 6) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}

}
	
