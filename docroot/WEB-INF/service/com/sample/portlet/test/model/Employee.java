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

package com.sample.portlet.test.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Employee service. Represents a row in the &quot;EMPLOYEE_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author priyanka.dhingra
 * @see EmployeeModel
 * @see com.sample.portlet.test.model.impl.EmployeeImpl
 * @see com.sample.portlet.test.model.impl.EmployeeModelImpl
 * @generated
 */
public interface Employee extends EmployeeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.sample.portlet.test.model.impl.EmployeeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public long getEmpId();

	/**
	* @param userId the userId to set
	*/
	public void setEmpId(long empId);

	/**
	* @param userId the userId to set
	*/
	public void setFname(java.lang.String fname);

	public java.lang.String getFname();

	/**
	* @param userId the userId to set
	*/
	public void setPhone(long phone);

	public long getPhone();
}