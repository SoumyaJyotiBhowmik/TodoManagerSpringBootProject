package com.todo.rest.webservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idcounter = 0;
	
	static {
		todos.add(new Todo(++idcounter,"Soumya","Learn to Love",new Date(),false));
		todos.add(new Todo(++idcounter,"Soumya","Learn MicroServices",new Date(),false));
		todos.add(new Todo(++idcounter,"Soumya","Learn Angular",new Date(),false));
		todos.add(new Todo(++idcounter,"Soumya","Learn Kubernetes",new Date(),false));
	}
	public List<Todo> findAll(){
		return todos;
	}
	public Todo deleteByID(long id) {
		Todo todo = findById(id);
		if(todo != null) {
			todos.remove(todo);
		}
		return todo;
	}
	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idcounter);
			todos.add(todo);
		}else {
			deleteByID(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
}
