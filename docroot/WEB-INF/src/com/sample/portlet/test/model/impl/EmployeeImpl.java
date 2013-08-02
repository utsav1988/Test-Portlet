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

package com.sample.portlet.test.model.impl;

/**
 * The extended model implementation for the Employee service. Represents a row in the &quot;EMPLOYEE_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sample.portlet.test.model.Employee} interface.
 * </p>
 *
 * @author priyanka.dhingra
 */
public class EmployeeImpl extends EmployeeBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a employee model instance should use the {@link com.sample.portlet.test.model.Employee} interface instead.
	 */
	 
	public EmployeeImpl() {
	}
      private long empId;
	
	private String fname;
	private long phone;
	
	public long getEmpId() {
		return empId;
	}

	/**
	 * @param userId the userId to set
	 */
public void setEmpId(long empId) {
		this.empId = empId;
	}

	
	/**
	 * @param userId the userId to set
	 */
public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getFname() {
		return fname;
	}

	/**
	 * @param userId the userId to set
	 */
public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public long getPhone(){
	return phone;
	}
	
	
	
	
	
	
	
	
	}

