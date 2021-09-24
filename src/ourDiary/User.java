package ourDiary;

public class User {
    private final String userName;
    private Diary diary;

    public User(String userName, Diary userDiary) {
        diary = userDiary;
        this.userName = userName;
    }

    public Diary getDiary() {
        return diary;
    }

    public void createEntry(String entryBody) {
        diary.addEntry(entryBody);
    }
}
