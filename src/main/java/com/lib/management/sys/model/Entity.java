package com.lib.management.sys.model;

import java.util.List;

public abstract class Entity {

	protected List<String> idAttNames;
	protected List<String> idAttValues;
	protected EntityType type;

	public Entity(List<String> idAttNames, List<String> idAttValues, EntityType type) {
		this.idAttNames = idAttNames;
		this.idAttValues = idAttValues;
		this.type = type;
	}

	public List<String> getIdAttsNames() {
		return this.idAttNames;
	}

	public List<String> getIdAttsValues() {
		return this.idAttValues;
	}

	public abstract EntityType getEntityType();

}
