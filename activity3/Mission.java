package activity3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty; // 1 - 10

    public Mission() {
        Random rand = new Random();

        String[] missionTargets = {
                "Retrive stolen data",
                "Infiltrate enemy base",
                "Rescue hostage" };

        this.missionTarget = missionTargets[rand.nextInt(missionTargets.length)];

        this.difficulty = rand.nextInt(10) + 1;
        int daysToAdd = rand.nextInt(27) + 7;
        this.missionDeadline = LocalDate.now().plusDays(daysToAdd);
    }

    // getters
    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void displayMissionBriefing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = missionDeadline.format(formatter);

        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + formattedDate);
    }
}
