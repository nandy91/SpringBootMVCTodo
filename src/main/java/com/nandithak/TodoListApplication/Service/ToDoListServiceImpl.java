/**
 * 
 */
package com.nandithak.TodoListApplication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandithak.TodoListApplication.Repository.ToDoListRepository;
import com.nandithak.TodoListApplication.model.ToDoList;

/**
 * @author NANDITHA
 *
 */
@Service
public class ToDoListServiceImpl implements ToDoListService{

	@Autowired
	ToDoListRepository todoRepository;
	
	
	
	@Override
	public List<ToDoList> getAllTodoList() {
		
		return todoRepository.findAll();
	}

	@Override
	public Optional<ToDoList> getTodo(int id) {
		
		return todoRepository.findById(id);
	}

	@Override
	public void createTodo(ToDoList todo) {
		todoRepository.save(todo);
		
	}

	@Override
	public void deleteTodo(int id) {
		Optional < ToDoList > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
		
	}

	@Override
	public void updateTodo(ToDoList todo) {
		todoRepository.save(todo);
		
	}

}
