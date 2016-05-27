<%@page import="com.fivetrue.db.annotation.DisplayName"%>
<%@page import="java.lang.reflect.Field"%>
<%@page import="com.elontech.web.entry.CompanyInfo"%>
<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% CompanyInfo info = WebTextObtainManager.getInstance().getCompanyInfo(); %>
<footer>
        <div class="container">
            <div class="row">
                    <div class="footer-links">
                    <p><%
                    
                    for(Field f : info.getClass().getDeclaredFields()){
                    	f.setAccessible(true);
                    	DisplayName name = f.getAnnotation(DisplayName.class);
                    	if(name != null){
                    		out.print(name.value() + " " + f.get(info) + " / ");
                    	}
                    }
                    %></p>
                    </div>
            </div>
        </div>
    </footer>