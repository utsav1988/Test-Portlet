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

package com.sample.portlet.test.service.impl;

import com.sample.portlet.test.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;
import com.sample.portlet.test.model.*;
import com.sample.portlet.test.service.*;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sample.portlet.test.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author priyanka.dhingra
 * @see com.sample.portlet.test.service.base.EmployeeLocalServiceBaseImpl
 * @see com.sample.portlet.test.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
public void add(long empId, String fname,long phone) {

        try {
            Employee employee = EmployeeLocalServiceUtil
                    .createEmployee(empId);
            //employee.setEmpId(empId);
           
            employee.setFname(fname);
			employee.setPhone(phone);
         EmployeeLocalServiceUtil.updateEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
	
	
	
}	
}