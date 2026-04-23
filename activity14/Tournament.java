package activity14;

import java.util.ArrayList;

public class Tournament<T> {
    private ArrayList<T> participants;

    public Tournament() {
        this.participants = new ArrayList<>();
    }

    public void addParticipant(T participant) {
        participants.add(participant);
    }

    public void showAll() {
        System.out.println("Tournament Participants:");
        for (T participant : participants) {
            System.out.println(participant.toString());
        }
    }
}