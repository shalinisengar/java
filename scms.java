import java.util.*;

class Complaint {
    private String username;
    private String complaint;
    private String response;
    private String feedback;

    public Complaint(String username, String complaint) {
        this.username = username;
        this.complaint = complaint;
    }

    public String getUsername() {
        return username;
    }

    public String getComplaint() {
        return complaint;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}

class Admin {
    private List<Complaint> complaints;

    public Admin() {
        complaints = new ArrayList<>();
    }

    public void receiveComplaint(Complaint complaint) {
        complaints.add(complaint);
    }

    public void respondToComplaints() {
        Scanner scanner = new Scanner(System.in);
        for (Complaint complaint : complaints) {
            System.out.println("Complaint from: " + complaint.getUsername());
            System.out.println("Complaint: " + complaint.getComplaint());
            System.out.println("Enter your response:");
            String response = scanner.nextLine();
            complaint.setResponse(response);
            System.out.println("Response sent successfully!");
            System.out.println("-------------------------------");
        }
    }
}

class User {
    private String username;
    private Scanner scanner;

    public User(String username) {
        this.username = username;
        scanner = new Scanner(System.in);
    }

    public Complaint submitComplaint() {
        System.out.println("Enter your complaint:");
        String complaint = scanner.nextLine();
        return new Complaint(username, complaint);
    }

    public void viewFeedback(Complaint complaint) {
        System.out.println("Response from Admin:");
        System.out.println(complaint.getResponse());
        System.out.println("Provide your feedback on the response:");
        String feedback = scanner.nextLine();
        complaint.setFeedback(feedback);
        System.out.println("Feedback submitted successfully!");
        System.out.println("-------------------------------");
    }
}

public class scms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        while (true) {
            System.out.println("Select User Type:");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("Enter your username:");
                String username = scanner.nextLine();
                User user = new User(username);
                Complaint complaint = user.submitComplaint();
                admin.receiveComplaint(complaint);
                System.out.println("Complaint submitted successfully!");
                // View feedback option for user
                user.viewFeedback(complaint);
            } else if (choice == 2) {
                System.out.println("Admin Panel:");
                admin.respondToComplaints();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter again.");
            }
        }

        scanner.close();
    }
}
