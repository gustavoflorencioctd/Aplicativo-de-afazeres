package br.com.todoApp.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.todoApp.entity.Project;

public class ProjectDTO {

	private long id;
	private String name;
	private String description;
	private Date createdAt;
	private Date updatedAt;

	public ProjectDTO() {
	}

	public ProjectDTO(Project project) {
		this.id = project.getId();
		this.name = project.getName();
		this.description = project.getDescription();
		this.createdAt = project.getCreatedAt();
		this.updatedAt = project.getUpdatedAt();
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	public List<ProjectDTO> tolist(List<Project> projects) {
		return projects.stream().map(ProjectDTO::new).collect(Collectors.toList());
	}
	
	public Project toEntity() {
		return new Project(name, description, createdAt, createdAt);
	}

}
