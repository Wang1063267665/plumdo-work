package com.plumdo.form.domain;

import javax.persistence.*;

import com.plumdo.common.domain.BaseEntity;

/**
 * The persistent class for the pw_fo_model database table.
 * 
 */
@Entity
@Table(name = "pw_fo_layout", catalog = "plumdo_form")
@NamedQuery(name = "FormLayout.findAll", query = "SELECT f FROM FormLayout f")
public class FormLayout extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private int editorSourceId;
	private String name;
	private int tableId;
	private int version;

	public FormLayout() {
	}

	@Column(name = "editor_source_id_")
	public int getEditorSourceId() {
		return this.editorSourceId;
	}

	public void setEditorSourceId(int editorSourceId) {
		this.editorSourceId = editorSourceId;
	}

	@Column(name = "name_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "table_id_")
	public int getTableId() {
		return this.tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}