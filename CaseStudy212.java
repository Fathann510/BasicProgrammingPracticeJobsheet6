import java.util.Scanner;

public class CaseStudy212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student Name : ");
        String name = input.nextLine();
        System.out.print("Event Type (BELMAWA/BAKORMA/MANDIRI/PKM/OTHERS) : ");
        String eventType = input.nextLine();

         if (eventType.equalsIgnoreCase("BELMAWA") || eventType.equalsIgnoreCase("BAKORMA") || eventType.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Number of Document : ");
            int documentAmount = input.nextInt();
            System.out.print("Rank : ");
            int peringkat = input.nextInt();

            if (documentAmount < 4) {
                int kurang = 4 - documentAmount;
                System.out.println("Status : Insufficient Document (Need more " + kurang + " documents). The award money is not provided.");
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                System.out.println("Status : Entitled to receive an award fund (Rank " + peringkat + ").");
                } else {
                System.out.println("Status : Not entitled to receive an award fund " + "(only for ranks 1, 2, or 3).");
                }
            }
        } else if (eventType.equalsIgnoreCase("PKM")) {
            System.out.print("Number of Document : ");
            int documentAmount = input.nextInt();
            System.out.print("Funding Status PKM (1 = approved, 0 = not approved) : ");
            int statusPkm = input.nextInt();

            if (documentAmount < 4) {
                int kurang = 4 - documentAmount;
                System.out.println("Status : Insufficient Document (Need more " + kurang + " documents). The award money is not provided.");
            } else {
                if (statusPkm == 1) {
                    System.out.println("Status : Entitled to receive an award fund " + "(PKM proposal approved and funded).");
                } else {
                    System.out.println("Status : Not entitled to receive an award fund " + "(PKM proposal not approved or funded).");
                }
            }
        } else {
            System.out.println("Status : Not entitled to receive an award fund " + "(event type not included in the regulations).");
        }
        input.close();

    }
}