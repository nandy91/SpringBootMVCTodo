/**
 * 
 */
package com.nandithak.TodoListApplication.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nandithak.TodoListApplication.Service.ToDoListService;
import com.nandithak.TodoListApplication.model.ToDoList;

import misc.ToDoListConstants;

/**
 * @author NANDITHA
 *
 */
@Controller
@RequestMapping("/todos")
public class TodoListController {
	@Autowired
	private ToDoListService todolistService;
	// private static final String[] "" = null;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listTodos(Model model) {
		List<ToDoList> todoList = this.todolistService.getAllTodoList();

		model.addAttribute(ToDoListConstants.TODO_LIST, todoList);
		System.out.println("From App:" + todoList.get(0));
		return "listTodos";
	}

	// show the addtodos form for get request
	@RequestMapping(value = "/addTodo", method = RequestMethod.GET)
	public String addTodo(Model model) {
		ToDoList ntodo = new ToDoList();
		model.addAttribute("todolist", ntodo);
		return "addTodo";
	}

	@RequestMapping(value = "/addTodo", method = RequestMethod.POST)
	public String addTodo(@ModelAttribute("todolist") ToDoList newtodo) {

		todolistService.createTodo(newtodo);
		return "redirect:/todos/list";
	}

	@GetMapping("/update")
	public String updateTodo(@RequestParam("id") int id, Model model) {
		Optional<ToDoList> mtodo = todolistService.getTodo(id);
		model.addAttribute("todolist", mtodo);
		return "addTodo";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int theId) {
		todolistService.deleteTodo(theId);;
		return "redirect:/todos/list";
	}
}
