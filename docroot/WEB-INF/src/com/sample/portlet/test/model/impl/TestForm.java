package com.sample.portlet.test.model.impl;


import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sample.portlet.test.service.*;


public class TestForm extends MVCPortlet{
 public void processAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
        throws IOException, PortletException {
       System.out.println("check1");
      long empId=Long.parseLong(actionRequest.getParameter("empId"));
	  String fname=actionRequest.getParameter("fname");
      long phone=Long.parseLong(actionRequest.getParameter("phone"));
   
      
       EmployeeLocalServiceUtil.add(empId, fname,phone);
    
    }
}