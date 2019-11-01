/**
 * 
 */
package com.nandithak.TodoListApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandithak.TodoListApplication.model.ToDoList;

/**
 * @author NANDITHA
 *
 */
public interface ToDoListRepository extends JpaRepository<ToDoList,Integer> {
	
	//ToDoList findById(int id);
    //List<ToDoList> findAllByOrderById();

}
