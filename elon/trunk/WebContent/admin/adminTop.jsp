<%@page import="java.lang.reflect.Field"%>
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
<div class="container">
	<form>
					<%
					Field[] enhfields = IntroMain.class.getDeclaredFields();
					if(enhfields != null){
						String html = "";
						for(Field f : enhfields){
							f.setAccessible(true);
							String fName = f.getName();
							if(fName != null && fName != "id" && fName != "item"){
								html += fName + " : <input id=\"" + fName + "\" ";
								html += "type=\"text\" name=\"" + fName + "\" /><br>"; 
							}
							
						}
						
						out.print(html);
					}
					%>
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
				</form>
</div>
<div class="down-arrow floating-arrow">
	<a href="#"><i class="fa fa-angle-down"></i></a>
</div>
</section>
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
`
<div class="device-showcase">
	<div class="devices">
		<div class="lampsmall-wrap wp1"></div>
		<div class="lamplarge-wrap wp2"></div>
	</div>
</div>
</section>
