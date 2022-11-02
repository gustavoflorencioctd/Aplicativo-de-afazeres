package br.com.todoApp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, length = 255, unique = true)
	private String name;

	@Column(nullable = false, length = 255, unique = true)
	private String description;

	@Column(nullable = false)
	private boolean isCompleted;

	@Column(nullable = false, length = 255, unique = true)
	private String notes;

	@Column(nullable = false, unique = false)
	private Date deadLine;

	@Column(nullable = false, unique = false)
	private Date createdAt;

	@Column(nullable = false, unique = false)
	private Date updatedAt;

	@OneToMany
	@JoinColumn(name = "id_project", insertable = false, updatable = false)
	private Project project;

	public Task() {
	}

	public Task(long id, String name, String description, boolean isCompleted, String notes, Date deadLine,
			Date createdAt, Date updatedAt, Project project) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.isCompleted = isCompleted;
		this.notes = notes;
		this.deadLine = deadLine;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.project = project;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", isCompleted=" + isCompleted
				+ ", notes=" + notes + ", deadLine=" + deadLine + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", project=" + project + "]";
	}

}
