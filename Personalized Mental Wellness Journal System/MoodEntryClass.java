public class MoodEntry extends JournalEntry {
    private String mood;
    private String reflection;

    public MoodEntry(String date, String mood, String reflection) {
        super(date, "Mood");
        this.mood = mood;
        this.reflection = reflection;
    }

    @Override
    public void logEntry() {
        System.out.println("Mood Entry logged: " + mood + " - " + reflection);
    }

    @Override
    public String analyzeEntry() {
        switch (mood.toLowerCase()) {
            case "happy":
                return "Keep up the positive mindset!";
            case "sad":
                return "Consider reaching out to a friend or trying a new hobby.";
            case "anxious":
                return "Try breathing exercises or a quick meditation session.";
            default:
                return "Stay mindful and take care of yourself!";
        }
    }
}
