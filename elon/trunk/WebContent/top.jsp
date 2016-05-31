<%@page import="com.elontech.web.entry.HistoryItem"%>
<%@page import="com.elontech.web.entry.Introduce"%>
<%@page import="com.elontech.web.entry.IntroItem"%>
<%@page import="com.elontech.web.entry.IntroMain"%>
<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@page import="com.elontech.web.entry.TopContents"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	IntroMain introMain = WebTextObtainManager.getInstance().getIntroMain();
	Introduce introContents = WebTextObtainManager.getInstance().getIntroduceContents();
%>
<section class="hero"> <section class="navigation">
<header>
<div class="header-content">
	<!-- <div class="logo"><a href="#"><img src="img/sedna-logo.png" alt="Elon logo"></a></div> -->
	<div class="logo">
		<a href="#"><font color="#ffffff" size="4"> <%
 	out.print(introMain.getIntroTitle());
 %>
		</font></a>
	</div>
	<div class="header-nav">
		<nav>
		<ul class="primary-nav">
			<li><a href="#introduce">회사소개</a></li>
			<li><a href="#skills">보유기술</a></li>
			<li><a href="#products">주요제품소개</a></li>
		</ul>
		<!--  <ul class="member-actions">
                                <li><a href="#download" class="login">Log in</a></li>
                                <li><a href="#download" class="btn-white btn-small">Sign up</a></li>
                            </ul> --> </nav>
	</div>
	<div class="navicon">
		<a class="nav-toggle" href="#"><span></span></a>
	</div>
</div>
</header> </section>
<div class="container">
	<div class="row">
		<div class="col-md-10 col-md-offset-1">
			<div class="hero-content text-center">
				<h1>
					<%
						out.print(introMain.getIntroMessage());
					%>
				</h1>
				<p class="intro">
					<%
						out.print(introMain.getIntroTitle());
					%>
				</p>
				<a href="<%out.print(introMain.getIntroLink());%>"
					class="btn btn-fill btn-large"> <%
 	out.print(introMain.getIntroLinkName());
 %>
				</a>
				<!-- <a href="#" class="btn btn-accent btn-large">Learn more</a> -->
			</div>
		</div>
	</div>
</div>
<div class="down-arrow floating-arrow">
	<a href="#"><i class="fa fa-angle-down"></i></a>
</div>
</section>

<section class="features section-padding" id="introduce">
<div class="container">
	<div class="row">
		<div class="col-md-7 col-md-offset-0">
			<div class="feature-list">
				<ul class="features-stack">
					<li class="feature-item">
						<h2 align="center">
							<%
								out.print(introContents.getIntroduceTitle());
							%>
						</h2> <%
 	for (HistoryItem history : introContents.getHistories()) {
 %>
					
					<li class="feature-item">
						<div class="feature-content">
							<p>
								<%
									out.print(history.getHistoryDate() + " : " + history.getHistoryContent());
								%>
							</p>
						</div>
					</li>
					<%
						}
					%>

				</ul>
			</div>
		</div>
	</div>
</div>

<div class="col-md-5 responsive-feature-img">
	<img src=<%out.print(introContents.getIntroduceImageUrl());%>
		alt=<%out.print(introContents.getIntroduceImageUrlName());%>>
</div>


</section>

<section class="features section-padding">
<div class="container">
	<div class="col-md-5 col-md-offset-7">
		<div class="feature-list">
			<h3>
				<%
					out.print(introContents.getIntroduceMessage());
				%>
			</h3>
			<p>
				<%
					out.print(introContents.getIntroduceContent());
				%>
			</p>
			<p align="right">
				<%
					out.print(introContents.getIntroduceDate() + " " + introContents.getIntroduceAuthor());
				%>
			</p>
		</div>
	</div>
</div>

<div class="device-showcase">
	<div class="devices">
		<div class="ipad-wrap wp1"></div>
		<div class="iphone-wrap wp2"></div>
	</div>
</div>
</section>
