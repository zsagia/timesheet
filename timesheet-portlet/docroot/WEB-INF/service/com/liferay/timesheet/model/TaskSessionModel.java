/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.timesheet.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TaskSession service. Represents a row in the &quot;timesheet_TaskSession&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.timesheet.model.impl.TaskSessionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.timesheet.model.impl.TaskSessionImpl}.
 * </p>
 *
 * @author Istvan Sajtos
 * @see TaskSession
 * @see com.liferay.timesheet.model.impl.TaskSessionImpl
 * @see com.liferay.timesheet.model.impl.TaskSessionModelImpl
 * @generated
 */
public interface TaskSessionModel extends BaseModel<TaskSession> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a task session model instance should use the {@link TaskSession} interface instead.
	 */

	/**
	 * Returns the primary key of this task session.
	 *
	 * @return the primary key of this task session
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this task session.
	 *
	 * @param primaryKey the primary key of this task session
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the task session ID of this task session.
	 *
	 * @return the task session ID of this task session
	 */
	public long getTaskSessionId();

	/**
	 * Sets the task session ID of this task session.
	 *
	 * @param taskSessionId the task session ID of this task session
	 */
	public void setTaskSessionId(long taskSessionId);

	/**
	 * Returns the task ID of this task session.
	 *
	 * @return the task ID of this task session
	 */
	public long getTaskId();

	/**
	 * Sets the task ID of this task session.
	 *
	 * @param taskId the task ID of this task session
	 */
	public void setTaskId(long taskId);

	/**
	 * Returns the start time of this task session.
	 *
	 * @return the start time of this task session
	 */
	public Date getStartTime();

	/**
	 * Sets the start time of this task session.
	 *
	 * @param startTime the start time of this task session
	 */
	public void setStartTime(Date startTime);

	/**
	 * Returns the end time of this task session.
	 *
	 * @return the end time of this task session
	 */
	public Date getEndTime();

	/**
	 * Sets the end time of this task session.
	 *
	 * @param endTime the end time of this task session
	 */
	public void setEndTime(Date endTime);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(TaskSession taskSession);

	public int hashCode();

	public CacheModel<TaskSession> toCacheModel();

	public TaskSession toEscapedModel();

	public String toString();

	public String toXmlString();
}