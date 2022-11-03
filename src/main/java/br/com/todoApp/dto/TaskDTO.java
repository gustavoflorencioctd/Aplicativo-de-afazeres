package br.com.todoApp.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.todoApp.entity.Project;
import br.com.todoApp.entity.Task;

public class TaskDTO {

	private long id;
	private String name;
	private String description;
	private boolean isCompleted;
	private String notes;
	private Date deadLine;
	private Date createdAt;
	private Date updatedAt;
	private Project project;

	public TaskDTO() {
	}

	public TaskDTO(Task task) {
		this.id = task.getId();
		this.name = task.getName();
		this.description = task.getDescription();
		this.isCompleted = task.isCompleted();
		this.notes = task.getNotes();
		this.deadLine = task.getDeadLine();
		this.createdAt = task.getCreatedAt();
		this.updatedAt = task.getUpdatedAt();
		this.project = task.getProject();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public String getNotes() {
		return notes;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Project getProject() {
		return project;
	}
	
	public List<TaskDTO> tolist(List<Task> tasks) {
		return tasks.stream().map(TaskDTO::new).collect(Collectors.toList());
	}
	
	public Task toEntity() {
		return new Task(name, description, isCompleted, notes, deadLine, createdAt, updatedAt, project);
	}
	
}
