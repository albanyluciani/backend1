package tasks.models.useCase;

import tasks.models.Task;

public class TaskUseCase {

    //Propiedad
    Task task;

    //Contructor
    public TaskUseCase (){
        this.task = new Task();
    }

     public String create(String name, String description){
     Task task = new Task(name, description, false);
     return "Tarea Creada:" + task.getName() + "Descripcion" + task.getDescription();
    }

    //Get
    public String get (){
        return "Tarea Creada" + task.getName() + "Descripcion" + task.getDescription();
    }
}
