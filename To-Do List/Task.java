
public class Task {
    
    String description;
    boolean isDone;

    // Constructor to initialize a new task
public Task(String description){
    this.description = description;
    this.isDone = false; // by default, it's not done yet
}

 // Mark the task as completed
public void markAsDone() {
    this.isDone = true;
}
    // This is how the task will be printed out
@Override
public String toString() {
    return (isDone ? "[✔] " : "[ ] ") + description;
}





}
