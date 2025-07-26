package tasks.models;

public class Task {
    private String name;
    private String description;
    private boolean status;

    public Task (String name, String description, boolean status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }
}
