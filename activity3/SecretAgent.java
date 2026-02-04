package activity3;

import java.time.LocalDateTime;

public class SecretAgent {
    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    public SecretAgent() {
    }

    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        this.agentId = agentId;
        this.codename = codename;
        this.clearanceLevel = clearanceLevel;

        boolean onMission = false;
        lastMissionCompletionTime = null;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getCodename() {
        return codename;
    }

    public int getClearanceLevel(int level) {

        return clearanceLevel;
    }

    public boolean isOnMission() {
        return onMission;
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;
    }

    // setter
    public void setCodename(String newCodename) {
        this.codename = newCodename;
    }

    public void setClearance(int level) {
        try {
            
        } catch (Exception e) {
            System.out.println("Invalid clearance level.");
        }
    }

}