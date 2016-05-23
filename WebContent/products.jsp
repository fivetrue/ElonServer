<%@page import="com.elontech.web.vo.MainMessage"%>
<%@page import="com.elontech.web.vo.SimpleMessage"%>
<%@page import="com.elontech.web.manager.WebTextObtainManager"%>
<%@page import="com.elontech.web.entry.ProductsInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ProductsInfo products = WebTextObtainManager.getInstance().getProductsInfo();
%>

<section class="features-extra section-padding" id="products">
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<h2>
					<%
						out.print(products.getTitle().getTitle());
					%>
				</h2>
			</div>
		</div>
		<%
				for (MainMessage product : products.getProducts()) {
			%>
		<div class="row">
			<h3>
				<%
						out.print(product.getTitle());
					%>
			</h3>
			<h5>
				<%
						out.print(product.getContent());
					%>
			</h5>
		</div>

		<%
				}
			%>

		<a href=<%out.print(products.getTitle().getLink());%>
			class="btn btn-ghost btn-accent btn-small"> <%
 	out.print(products.getTitle().getLinkName());
 %></a>

	</div>
</section>




<%-- <section id="products">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h2>
					<%out.print(products.getTitle().getTitle()); %>
				</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 col-sm-12 col-xs-12 leftcol">
				<h5>EXCLUSIVE TO CODROPS</h5>
				<p>Minim veniam, quis nostrud exercitation ullamco laboris nisi
					ut aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>
			<div class="col-md-6 col-sm-12 col-xs-12 rightcol">
				<h5>SPREADING PIXELS AROUND THE WORLD</h5>
				<p>Minim veniam, quis nostrud exercitation ullamco laboris nisi
					ut aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>
		</div>
	</div>
</section> --%>
<!-- <section class="blog text-center">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4">
				<article class="blog-post">
					<figure>
						<a href="img/blog-img-01.jpg" class="single_image">
							<div class="blog-img-wrap">
								<div class="overlay">
									<i class="fa fa-search"></i>
								</div>
								<img src="img/blog-img-01.jpg" alt="Sedna blog image" />
							</div>
						</a>
						<figcaption>
							<h2>
								<a href="#" class="blog-category" data-toggle="tooltip"
									data-placement="top" data-original-title="See more posts">Product</a>
							</h2>
							<p>
								<a href="#" class="blog-post-title">Getting started with
									Sedna <i class="fa fa-angle-right"></i>
								</a>
							</p>
						</figcaption>
					</figure>
				</article>
			</div>
			<div class="col-md-4">
				<article class="blog-post">
					<figure>
						<a href="img/blog-img-02.jpg" class="single_image">
							<div class="blog-img-wrap">
								<div class="overlay">
									<i class="fa fa-search"></i>
								</div>
								<img src="img/blog-img-02.jpg" alt="Sedna blog image" />
							</div>
						</a>
						<figcaption>
							<h2>
								<a href="#" class="blog-category" data-toggle="tooltip"
									data-placement="top" data-original-title="See more posts">Technology</a>
							</h2>
							<p>
								<a href="#" class="blog-post-title">Why IE8 support is
									deminishing <i class="fa fa-angle-right"></i>
								</a>
							</p>
						</figcaption>
					</figure>
				</article>
			</div>
			<div class="col-md-4">
				<article class="blog-post">
					<figure>
						<a href="img/blog-img-03.jpg" class="single_image">
							<div class="blog-img-wrap">
								<div class="overlay">
									<i class="fa fa-search"></i>
								</div>
								<img src="img/blog-img-03.jpg" class="single_image"
									alt="Sedna blog image" />
							</div>
						</a>
						<figcaption>
							<h2>
								<a href="#" class="blog-category" data-toggle="tooltip"
									data-placement="top" data-original-title="See more posts">Product</a>
							</h2>
							<p>
								<a href="#" class="blog-post-title">Sedna tutorial: How to
									begin your <i class="fa fa-angle-right"></i>
								</a>
							</p>
						</figcaption>
					</figure>
				</article>
			</div>
			<a href="#" class="btn btn-ghost btn-accent btn-small">More news</a>
		</div>
	</div>
</section> -->