
    import java.util.*;

    public abstract class Mission {
        protected String missionId;
        protected String missionName;
        protected Date missionStartDate;
        protected Date missionEndDate;
        protected String status;
        protected List<Personnel> assignedPersonnel = new ArrayList<>();

        public Mission(String id, String name, Date start, Date end, String status) {
            this.missionId = id;
            this.missionName = name;
            this.missionStartDate = start;
            this.missionEndDate = end;
            this.status = status;
        }

        public void addPersonnel(Personnel p) {
            if (!assignedPersonnel.contains(p)) {
                assignedPersonnel.add(p);
                p.assignMission(this);
            }
        }

        public abstract void assignTask();
        public abstract void allocateResources(List<Resource> resources);
        public abstract void trackMissionProgress();
        public abstract void generateMissionReport();
    }


