/**
 * 
 */
package com.nandithak.TodoListApplication.Service;

import java.util.List;
import java.util.Optional;

import com.nandithak.TodoListApplication.model.ToDoList;
/**
 * @author NANDITHA
 *
 */
public interface ToDoListService {
	
	List<ToDoList> getAllTodoList();
    Optional<ToDoList> getTodo(int id);
    void createTodo(ToDoList todo);
    void deleteTodo(int id);
    void updateTodo(ToDoList todo);
    
}
