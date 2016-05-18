<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.entry.Skills"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% 
	Skills skills = WebTextObtainManager.getInstance().getSkills();
%>
<section class="features-extra section-padding" id="skills">
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<div class="feature-list">
					<h3><%out.print(skills.getSkillMain().getTitle());%></h3>
					<p><%out.print(skills.getSkillMain().getContent());%></p>
					<div class="row">
					<ul class="features-stack">
						<li class="feature-item">
								<%
									for (SimpleMessage msg : skills.getSkillMessages()) {
								%>
								<li class="feature-item">
									<div class="feature-content">
										<div class="feature-content">
										<h5>
											<%
												out.print(msg.getTitle());
											%>
										</<h5>>
										<p>
											<%
												out.print(msg.getContent());
											%>
										</p>
									</div>
									</div>
								</li>
								<%
									}
								%>
							
					</ul>
					<a href=<%out.print(skills.getSkillMain().getLink()); %> class="btn btn-ghost btn-accent btn-small">
					<%out.print(skills.getSkillMain().getLinkName()); %></a>
				</div>
			</div>
		</div>
	</div>
	<div class="macbook-wrap wp3"></div>
	<div class="responsive-feature-img">
		<img src=<%out.print(skills.getImageItem().getImageUrl()); %> alt="responsive devices">
	</div>
</section>
