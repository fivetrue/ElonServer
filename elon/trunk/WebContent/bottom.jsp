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
                    <p><%out.print(info.getCompanyName().getTitle() + " " + info.getCompanyName().getContent() + " / ");
                    out.print(info.getCategory().getTitle() + " " + info.getCategory().getContent() + "<br>"); 
                    out.print(info.getOwner().getTitle() + " " + info.getOwner().getContent() + " / "); 
                    out.print(info.getAddress().getTitle() + " " + info.getAddress().getContent() + " / ");
                    out.print(info.getTelephon().getTitle() + " " + info.getTelephon().getContent() + " / ");
                    out.print(info.getFax().getTitle() + " " + info.getFax().getContent() + " / ");
                    /* out.print(info.getFoundationDate().getTitle() + " " + info.getFoundationDate().getContent() + " / "); */ 
                    out.print(info.getCompanyId().getTitle() + " " + info.getCompanyId().getContent()); %></p>
                        <!-- <ul class="footer-group">
                            <li><a href="#">Features</a></li>
                            <li><a href="#">Pricing</a></li>
                            <li><a href="#">Sign up</a></li>
                            <li><a href="http://tympanus.net/codrops/licensing/">Licence</a></li>
                            <li><a href="http://tympanus.net/codrops/">Codrops</a></li>
                            <li><a href="http://www.peterfinlan.com/">Peter Finlan</a></li>
                        </ul> -->
                    </div>
            </div>
        </div>
    </footer>