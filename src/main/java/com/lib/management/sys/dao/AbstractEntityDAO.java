/**
 * 
 */
package com.lib.management.sys.dao;

import java.util.Collection;
import java.util.List;

/**
 * @author vinod
 *
 */
public interface AbstractEntityDAO<T> {

	public abstract void storeEntities(Collection<T> entities);

	public abstract T lookupEntity(List<String> idAttValues);
}
