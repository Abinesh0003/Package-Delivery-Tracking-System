import java.util.Scanner;

class Package {
    int packageId;
    String sender;
    String receiver;
    String status;

    Package(int packageId, String sender, String receiver, String status) {
        this.packageId = packageId;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    void display() {
        System.out.println("Package ID: " + packageId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Status: " + status);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Package p = new Package(101, "John", "Alice", "Shipped");

        int choice;

        do {
            System.out.println("\n--- Package Delivery Tracking System ---");
            System.out.println("1. View Package Details");
            System.out.println("2. Update Status");
            System.out.println("3. Track Package");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    p.display();
                    break;

                case 2:
                    System.out.print("Enter new status: ");
                    p.status = sc.nextLine();
                    System.out.println("Status updated successfully!");
                    break;

                case 3:
                    System.out.print("Enter Package ID: ");
                    int id = sc.nextInt();

                    if (id == p.packageId) {
                        System.out.println("Current Status: " + p.status);
                    } else {
                        System.out.println("Package not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}