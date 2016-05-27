<%@page import="com.elontech.web.entry.SkillDetail"%>
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
					<h2>
						<%
							out.print(skills.getTitle());
						%>
					</h2>
					<p>
						<%
							out.print(skills.getDescription());
						%>
					</p>
					<div class="row">
						<div class="col-md-9">
							<ul class="features-stack">
								<li class="feature-item">
									<%
										for (SkillDetail detail : skills.getSkillDetails()) {
									%>
								
								<li class="feature-item">
									<div class="feature-content">
										<div class="feature-content">
											<h4>
												<%
													out.print(detail.getSkillName());
												%>
												</h4>
													<p>
														<%
															out.print(detail.getSkillDescription());
														%>
													</p>
										</div>
									</div>
								</li>
								<%
									}
								%>

							</ul>
							<a href=<%out.print(skills.getSkillLink());%>
								class="btn btn-ghost btn-accent btn-small"> <%
 	out.print(skills.getSkillLinkName());
 %></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="macbook-wrap wp3"></div>
		<div class="responsive-feature-img">
			<img src=<%out.print(skills.getSkillMainImageUrl());%>
				alt="responsive devices">
		</div>
</section>
