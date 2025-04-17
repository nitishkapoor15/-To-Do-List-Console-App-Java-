import java.util.ArrayList;

public class ToDoList {
        private ArrayList<Task> tasks = new ArrayList<>();

    // Add a new task to the list
        public void addTask(String desc){
        tasks.add(new Task(desc));
        System.out.println("Task added.");
        }
    //----------------------------------------------------------

    // Show all tasks with their status (done or not)

       public void showTasks(){
        if(tasks.isEmpty()){
            System.out.println("Task not found"); }
        else{
         for(int i=0;i<tasks.size();i++){
            System.out.println((i + 1) + ". " + tasks.get(i));}
        }
        }

    //----------------------------------------------------------

             // Delete a task by its index

    
           public void deleteTask(int index){
            if (index >= 0 && index < tasks.size()) {
             tasks.remove(index);
             
             System.out.println(" Task deleted.");
            } else {
                System.out.println("Invalid task number.");
            }
       }
    //----------------------------------------------------------


     // Mark a specific task as done

      public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
            System.out.println("Task marked as done.");
        } else {
            System.out.println(" Invalid task number.");
        }
    }

}
      


