import java.util.Date;
import java.util.List;

public class ReconMission extends Mission {

        public ReconMission(String id, String name, Date start, Date end, String status) {
            super(id, name, start, end, status);
        }

        @Override
        public void assignTask() {
            if (assignedPersonnel.size() >= 2) {
                System.out.println("Recon tasks assigned to personnel.");
            } else {
                System.out.println("Error: At least 2 personnel are required for ReconMission.");
            }
        }
    @Override
    public void allocateResources(List<Resource> resources) {
        for (Resource r : resources) {
            if (r.getName().equalsIgnoreCase("Drone") && r.isAvailable(1)) {
                r.allocate(1);
                System.out.println("Drone allocated.");
                return;
            }
        }
        System.out.println("Error: Drones not available.");
    }

    @Override
    public void trackMissionProgress() {
        this.status = "IN_PROGRESS";
        System.out.println("Tracking recon progress...");
    }
        @Override
        public void generateMissionReport() {
            System.out.println("=== Recon Mission Report ===");
            System.out.println("Mission: " + missionName);
            System.out.println("Personnel count: " + assignedPersonnel.size());
            System.out.println("Status: " + status);
        }
    }


