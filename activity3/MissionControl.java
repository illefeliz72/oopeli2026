package activity3;

//main method
public class MissionControl {
    public static void main(String[] args) {

        SecretAgent agent = new SecretAgent("007", "James Bond", 5);

        System.out.printf("""
                Agent %s ( %s ) initialized.
                Cleareance: %s |On Mission %s

                """, agent.getAgentId(), agent.getCodename(), agent.getClearanceLevel(), agent.isOnMission());

        Mission mission = new Mission();
        mission.displayMissionBriefing();

        if (agent.getClearanceLevel() >= mission.getDifficulty()) {
            System.out.println("Agent " + agent.getAgentId() + " is cleared for mission.");

            agent.startMission();
            
            System.out.println("Updated Status: On Mission = " + agent.isOnMission());

            System.out.println("... Operation in progress ...");
            agent.completeMission();
        }
    }
}
