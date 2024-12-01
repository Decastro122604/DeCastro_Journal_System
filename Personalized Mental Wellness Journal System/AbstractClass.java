public abstract class JournalEntry {
    private String date;
    private String type;

    public JournalEntry(String date, String type) {
        this.date = date;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public abstract void logEntry();
    public abstract String analyzeEntry();
}
