# Mental Wellness Journal Project🧘🏼‍♀️🍃

This project is a **Mental Wellness Journal** application designed to help users log their moods and things they are grateful for. The program uses Java to manage and display journal entries, providing suggestions and reflections to encourage well-being.✨

🎀Features
- Log mood entries (e.g., Happy, Sad, Anxious).
- Log gratitude entries (e.g., "Grateful for my family").
- View all logged entries with recommendations based on the mood.
- Easy-to-use, menu-driven interface for user interaction.

🎀 Class Structure 🎀
1. 🌷Abstract Class🌷
    `JournalEntry` This class serves as a blueprint for all journal entries. It defines common properties like date and type, and abstract methods that child classes must implement.

2. 🌷MoodEntry Class🌷 
   This class logs mood-related entries (e.g., Happy, Sad, Anxious) and provides an analysis based on the mood.

3. 🌷GratitudeEntry Class🌷
   This class logs gratitude-related entries and encourages reflection on things the user is thankful for.

4. 🌷Main Class🌷
   `WellnessJournal` The main program that handles user interaction. It allows users to log entries, view their journal, and receive insights based on their entries.

🎀 How It Works 🎀
1. Start the Program:
   - When you run the program, it shows a menu with options to log mood or gratitude entries, or to view all entries.
   
2. Logging Mood Entries:  
   - Choose option 1 to log a mood entry.
   - Enter the date, mood (e.g., Happy, Sad, Anxious), and a short reflection.

3. Logging Gratitude Entries:  
   - Choose option 2 to log a gratitude entry.
   - Enter the date and something you are grateful for.

4. View Entries:  
   - Choose option 3 to view all your journal entries with reflections or advice based on the mood.

5. Exit the Program:  
   - Choose option 0 to exit.

🎀Example Output
1. Menu:
   ```text
   Welcome to the Mental Wellness Journal!
   Menu:
   1. Log Mood Entry
   2. Log Gratitude Entry
   3. View Journal Entries
   0. Exit
   Choose an option: 
  

2. Logged Entry:
   ```text
   Mood Entry logged: Happy - Had a great day!
   

3. View All Entries:
   ```text
   Your Journal Entries:
   2024-11-29 - Mood: Keep up the positive mindset!
   2024-11-29 - Gratitude: Reflect on your gratitude entries to maintain a positive outlook.
   
Feel free to fork this repository and submit pull requests. If you encounter any issues or have suggestions, please open an issue and I will be happy to help!

