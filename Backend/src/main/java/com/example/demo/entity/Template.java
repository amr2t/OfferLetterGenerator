package com.example.demo.entity;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="Template")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Template {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String name;
	private String templateObj;
	private Date creationDate;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemplateObj() {
		return templateObj;
	}
	public void setTemplateObj(String templateObj) {
		this.templateObj = templateObj;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "Template [id=" + id + ", name=" + name + ", templateObj=" + templateObj + ", creationDate="
				+ creationDate + "]";
	}
	
	
}
