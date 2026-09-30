import java.util.Scanner;

public class PRAK104_2510817210011_FatihAlfayruz {

    static String yangMenang(char abu, char bagas) {
        if (abu == bagas) {
            return "Seri";
        }

        if (abu == 'B' && bagas == 'G') return "Abu";
        if (abu == 'G' && bagas == 'K') return "Abu";
        if (abu == 'K' && bagas == 'B') return "Abu";

        return "Bagas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        char abu1 = scanner.next().charAt(0);
        char abu2 = scanner.next().charAt(0);
        char abu3 = scanner.next().charAt(0);

        System.out.print("Tangan Bagas: ");
        char bagas1 = scanner.next().charAt(0);
        char bagas2 = scanner.next().charAt(0);
        char bagas3 = scanner.next().charAt(0);

        scanner.close();

        int abuScore = 0;
        int bagasScore = 0;

        String round1 = yangMenang(abu1, bagas1);
        if (round1.equals("Abu")) abuScore++;
        else if (round1.equals("Bagas")) bagasScore++;

        String round2 = yangMenang(abu2, bagas2);
        if (round2.equals("Abu")) abuScore++;
        else if (round2.equals("Bagas")) bagasScore++;

        String round3 = yangMenang(abu3, bagas3);
        if (round3.equals("Abu")) abuScore++;
        else if (round3.equals("Bagas")) bagasScore++;

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
