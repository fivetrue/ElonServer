<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@page import="com.elontech.web.entry.TopContents"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	TopContents topContents = WebTextObtainManager.getInstance().getTopContents();
%>
<section class="hero">
        <section class="navigation">
            <header>
                <div class="header-content">
                    <!-- <div class="logo"><a href="#"><img src="img/sedna-logo.png" alt="Elon logo"></a></div> -->
                    <div class="logo"><a href="#"><h1 alt="Elon logo"><%out.print(topContents.getWebName()); %></h3></a></div>
                    <div class="header-nav">
                        <nav>
                            <ul class="primary-nav">
                                <li><a href="#introduce">회사소개</a></li>
                                <li><a href="#skills">보유기술</a></li>
                                <li><a href="#blog">주요제품소개</a></li>
                            </ul>
                           <!--  <ul class="member-actions">
                                <li><a href="#download" class="login">Log in</a></li>
                                <li><a href="#download" class="btn-white btn-small">Sign up</a></li>
                            </ul> -->
                        </nav>
                    </div>
                    <div class="navicon">
                        <a class="nav-toggle" href="#"><span></span></a>
                    </div>
                </div>
            </header>
        </section>
        <div class="container">
            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <div class="hero-content text-center">
                        <h1><%out.print(topContents.getTopMain().getTitle()); %></h1>
                        <p class="intro"><%out.print(topContents.getTopMain().getContent()); %></p>
                        <a href="<%out.print(topContents.getTopMain().getLink());%> %>" class="btn btn-fill btn-large"><%out.print(topContents.getTopMain().getLinkName());  %></a> 
                        <!-- <a href="#" class="btn btn-accent btn-large">Learn more</a> -->
                    </div>
                </div>
            </div>
        </div>
        <div class="down-arrow floating-arrow"><a href="#"><i class="fa fa-angle-down"></i></a></div>
    </section>
</section>
<section class="intro section-padding">
        <div class="container">
            <div class="row">
		<%
			for(SimpleMessage itm : topContents.getTopIntros()) {
		%>
		<div class="col-md-4 intro-feature">
			<div class="intro-icon">
				<span data-icon="&#xe033;" class="icon"></span>
			</div>
			<div class="intro-content">
				<h5><%out.print(itm.getTitle()); %></h5>
				<p><%out.print(itm.getContent()); %></p>
			</div>
		</div>
		<%
			}
		%>
            </div>
        </div>
    </section>