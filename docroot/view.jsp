<%
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
%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ page import="javax.portlet.*"%>
<%@ page import="com.sample.portlet.test.service.*"%>
<%@ page import="com.sample.portlet.test.model.*"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>test</b> portlet.

<form action='<portlet:actionURL/>' method="post">


<table>
        <tr>
            <td>EmpID:</td>
            <td><input type="text" name="empId" /></td>
        </tr>
		<tr>
            <td>Fname:</td>
            <td><input type="text" name="fname" /></td>
        </tr>
		<tr>
            <td>Phone:</td>
            <td><input type="text" name="phone" /></td>
        </tr>
	    <tr>
            <td colspan=2><input type="submit" value="submit" /></td>
        </tr>
	</table>
</form>
<H3> No of Customers in Database :
    <%
        out.println(EmployeeLocalServiceUtil.getEmployeesCount());
    %>
</H3>



