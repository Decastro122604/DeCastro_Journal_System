public class GratitudeEntry extends JournalEntry {
    private String gratitude;

    public GratitudeEntry(String date, String gratitude) {
        super(date, "Gratitude");
        this.gratitude = gratitude;
    }

    @Override
    public void logEntry() {
        System.out.println("Gratitude logged: " + gratitude);
    }

    @Override
    public String analyzeEntry() {
        return "Reflect on your gratitude entries to maintain a positive outlook.";
    }
}
