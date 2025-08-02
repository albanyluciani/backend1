package tasks.models.useCase;

import tasks.models.Task;

//Instancia es un hilo

// Contenedor de metodos y atributos
public class TaskUseCase {

    //Propiedad
    Task task;

    //Contructor
    public TaskUseCase (){
        this.task = new Task(); //Forma #1 de crear una tarea sin valores
    }

     public String create(String name, String description){
     Task task = new Task(name, description, false); //Forma #2 de crear una tarea con valores
     return "Tarea Creada:" + task.getName() + "Descripcion" + task.getDescription();
    }

    //Update
    public
    task.setName

    //Get
    public String get (){
        return "Tarea Creada" + task.getName() + "Descripcion" + task.getDescription();
    }
}
