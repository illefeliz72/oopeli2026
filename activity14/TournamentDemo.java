import java.util.Collections;
import activity14.Tournament;

public class TournamentDemo {
    public static void main(String[] args) {
        Tournament<Athlete> olympics = new Tournament<>();
        olympics.addParticipant(new Athlete("Jamal", 85));
        olympics.addParticipant(new Athlete("Epstein", 95));
        olympics.addParticipant(new Athlete("Tung Tung Sahur ", 87));

        System.out.println("--- Original List ---");
        olympics.showAll();

        Collections.sort(olympics.getParticipants());
        System.out.println("\n--- Sorted List (Ranked) ---");
        olympics.showAll();

        System.out.println("\n--- Deep Copy Test ---");
        Athlete original = olympics.getParticipants().get(0); // spongebob
        Athlete clone = original.clone();

        clone.addTrophy("Gold Medal");

        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);
        System.out.println("Deep copy successful: " + (original != clone));

        System.out.println("\n--- Interface Feature Test ---");
        original.reportStatus(); 
        int testScore = 105;
        System.out.println("Is " + testScore + " valid? " + Competitor.isValidScore(testScore));

    }
}
