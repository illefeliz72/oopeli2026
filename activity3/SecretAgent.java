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
        this.onMission = false;
        this.lastMissionCompletionTime = null;
    }
//getter
    public String getAgentId() {
        return agentId;
    }

    public String getCodename() {
        return codename;
    }

    public int getClearanceLevel() {

        return clearanceLevel;
    }

    public boolean isOnMission() {
        return onMission;
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;
    }

    // setter methods
    public void setCodename(String newCodename) {
        this.codename = newCodename;
    }

    public void setClearance(int level) {
        if (level >= 1 && level <= 5) {
            this.clearanceLevel = level;
        } else {
            System.out.println("Invalid clearance level" + level);
        }
    }

    // behavioral methods
    public void startMission() {
        this.onMission = true;
    }

    public void completeMission() {
        this.onMission = false;
        this.lastMissionCompletionTime = LocalDateTime.now();
        
    }
}