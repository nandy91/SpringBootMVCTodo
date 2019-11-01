package com.nandithak.TodoListApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author NANDITHA
 *
 */
@Entity 
@Table(name="todolist")
public class ToDoList {
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@Column
	public String name;
	@Column 
	public String category;
	@Column 
	public String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ToDoList [id=" + id + ", name=" + name + ", category=" + category + ", status=" + status + "]";
	}
}
