<%@page import="com.elontech.web.entry.ProductDetail"%>
<%@page import="com.elontech.web.entry.Products"%>
<%@page import="com.elontech.web.vo.MainMessage"%>
<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Products products = WebTextObtainManager.getInstance().getProductsInfo();
%>

<section class="features-extra section-padding" id="products">
	<div class="container">
		<div class="row">
			<div class="col-md-5 ">
				<h2>
					<%
						out.print(products.getTitle());
					%>
				</h2>
			</div>
		</div>
		<%
			for (ProductDetail product : products.getProductDetails()) {
		%>
		<div class="row">
			<div class="col-md-5 ">
				<h4>
					<%
						out.print(product.getProductName());
					%>
				</h4>
				<p>
					<%
						out.print(product.getProductDescription());
					%>
				</p>
			</div>
		</div>

		<%
			}
		%>

		<a href=<%out.print(products.getProductsLink());%>
			class="btn btn-ghost btn-accent btn-small"> <%
 	out.print(products.getProductsLinkName());
 %></a>
	</div>
	<div class="macbook-product-wrap wp3"></div>
	<%-- <div class="col-md-5 responsive-feature-img">
		<img src=<%out.print(introContents.getIntroducResponsiveImage().getImageUrl());%> alt=<%out.print(introContents.getIntroducResponsiveImage().getName());%>>
	</div> --%>
</section>
