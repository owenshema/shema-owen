import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Personnel> personnelList = new ArrayList<>();
        List<Resource> resources = new ArrayList<>();

        // Input mission details
        System.out.print("Enter Mission ID: ");
        String missionId = scanner.nextLine();

        System.out.print("Enter Mission Name: ");
        String missionName = scanner.nextLine();

        // For simplicity, fixed dates (can be extended to parse input)
        Date startDate = new Date(2025 - 1900, Calendar.APRIL, 20);
        Date endDate = new Date(2025 - 1900, Calendar.APRIL, 25);

        // Create mission
        ReconMission recon = new ReconMission(missionId, missionName, startDate, endDate, "PLANNED");

        // Input number of personnel
        System.out.print("How many personnel to add? ");
        int numPersonnel = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        for (int i = 0; i < numPersonnel; i++) {
            System.out.println("Enter details for personnel " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Role: ");
            String role = scanner.nextLine();

            Personnel p = new Personnel(id, name, role);
            recon.addPersonnel(p);
        }

        // Validate personnel count
        if (recon.assignedPersonnel.size() < 2) {
            System.out.println("Error: ReconMission requires at least 2 personnel.");
            return;
        }

        // Input resources
        System.out.print("How many resources to add? ");
        int numResources = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numResources; i++) {
            System.out.println("Enter details for resource " + (i + 1));
            System.out.print("ID: ");
            String rid = scanner.nextLine();
            System.out.print("Name: ");
            String rname = scanner.nextLine();
            System.out.print("Quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Type: ");
            String type = scanner.nextLine();

            resources.add(new Resource(rid, rname, qty, type));
        }

        // Validate drone availability
        boolean hasDrone = resources.stream().anyMatch(r -> r.getName().equalsIgnoreCase("Drone") && r.isAvailable(1));
        if (!hasDrone) {
            System.out.println("Error: Drone resource is required for ReconMission.");
            return;
        }

        // Execute mission
        recon.assignTask();
        recon.allocateResources(resources);
        recon.trackMissionProgress();
        recon.generateMissionReport();
    }
}
