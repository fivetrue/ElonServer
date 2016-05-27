<%@page import="com.elontech.web.entry.HistoryItem"%>
<%@page import="com.elontech.web.entry.Introduce"%>
<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	Introduce introContents = WebTextObtainManager.getInstance().getIntroduceContents();
%>
<section class="features section-padding" id="introduce">
	<div class="container">
		<div class="row">
			<div class="col-md-7 col-md-offset-0">
				<div class="feature-list">
					<ul class="features-stack">
						<li class="feature-item">
							<h2 align="center">
								<%out.print(introContents.getIntroduceTitle()); %></h2>
								<%
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
					<%-- <ul class="features-stack">
						<li class="feature-item">
							<%
								for (SimpleMessage msg : introContents.getIntroMessage()) {
							%>
						<li class="feature-item">
							<div class="feature-icon">
								<span data-icon="&#xe03e;" class="icon"></span>
							</div>
							<div class="feature-content">
								<h5>
									<%
										out.print(msg.getTitle());
									%>
								</h5>
								<p>
									<%
										out.print(msg.getContent());
									%>
								</p>
							</div>
						</li>
						<%
							}
						%>
					</ul> --%>
				</div>
			</div>
		</div>
	<div class="device-showcase">
		<div class="devices">
			<div class="ipad-wrap wp1"></div>
			<div class="iphone-wrap wp2"></div>
		</div>
	</div>
	<div class="col-md-5 responsive-feature-img">
		<img src=<%out.print(introContents.getIntroduceImageUrl());%> alt=<%out.print(introContents.getIntroduceImageUrlName());%>>
	</div>
</section>
