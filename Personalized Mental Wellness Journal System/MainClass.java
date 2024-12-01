import java.util.ArrayList;
import java.util.Scanner;

public class WellnessJournal {
    private ArrayList<JournalEntry> entries;

    public WellnessJournal() {
        entries = new ArrayList<>();
    }

    public void addEntry(JournalEntry entry) {
        entries.add(entry);
        entry.logEntry();
    }

    public void displayEntries() {
        System.out.println("Your Journal Entries:");
        for (JournalEntry entry : entries) {
            System.out.println(entry.getDate() + " - " + entry.getType() + ": " + entry.analyzeEntry());
        }
    }

    public static void main(String[] args) {
        WellnessJournal journal = new WellnessJournal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mental Wellness Journal!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Log Mood Entry");
            System.out.println("2. Log Gratitude Entry");
            System.out.println("3. View Journal Entries");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter your mood (Happy, Sad, Anxious, Calm): ");
                    String mood = scanner.nextLine();
                    System.out.print("Enter a short reflection: ");
                    String reflection = scanner.nextLine();
                    journal.addEntry(new MoodEntry(date, mood, reflection));
                    break;

                case 2:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    date = scanner.nextLine();
                    System.out.print("Enter something you're grateful for: ");
                    String gratitude = scanner.nextLine();
                    journal.addEntry(new GratitudeEntry(date, gratitude));
                    break;

                case 3:
                    journal.displayEntries();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Mental Wellness Journal. Stay healthy!");
    }
}