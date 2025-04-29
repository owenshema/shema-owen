public class Personnel {

        private String personnelId;
        private String personnelName;
        private String personnelRole;
        private Mission assignedMission;

        public Personnel(String id, String name, String role) {
            this.personnelId = id;
            this.personnelName = name;
            this.personnelRole = role;
        }

        public String getRole() {
            return personnelRole;
        }

        public String getName() {
            return personnelName;
        }

        public void assignMission(Mission mission) {
            this.assignedMission = mission;
        }
    }


