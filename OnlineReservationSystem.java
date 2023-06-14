import java.util.Scanner;

public class OnlineReservationSystem {

    private static boolean[] Trainseats = new boolean[100]; 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
        	
 
            System.out.println("\n -----Please select an option from below -----:");
            System.out.println();
            System.out.println("1. View Login Form");
            System.out.println("2. Reservation Form");
            System.out.println("3. CancellationForm");
            System.out.println("4. Exit");
            
            

      
            int choices = scanner.nextInt();

            switch (choices) {

                case 1:
                    LoginForm();
                    break;

                case 2:
                    reservationForm();
                    break;

                case 3:
                    cancellationForm();
                    break;

                case 4:
                    System.exit(0); 

                default:
                    System.out.println("-----Your choice is Invalid!-----");
            }
        }
    }

    private static void LoginForm() {
        System.out.println("Enter Current Seat Login:");
        for (int i = 0; i < Trainseats.length; i++) {
            if (Trainseats[i]) {
                System.out.print("X "); 
            } else {
                System.out.print((i + 1) + " "); 
            }
        }
        System.out.println();
    }

    private static void reservationForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter  the seat numbers from (1-100): ");
        int seatNo = scanner.nextInt();
        if (seatNo < 1 || seatNo > 10) {
            System.out.println("seat number Invalid!");
        } else if (Trainseats[seatNo - 1]) {
            System.out.println("Seat is already reserved!");
        } else {
            Trainseats[seatNo - 1] = true; 
            System.out.println("Seat reserved!");
        }
    }

    private static void cancellationForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat numbers from (1-100): ");
        int seatNo = scanner.nextInt();
        if (seatNo < 1 || seatNo > 100) {
            System.out.println("Invalid seat number!");
        } else if (!Trainseats[seatNo - 1]) {
            System.out.println("----Seat is not reserved!----");
        } else {
            Trainseats[seatNo - 1] = false; 
            System.out.println("------Your Reservation canceled!------");
        }
    }
}
