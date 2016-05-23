<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="defaultHeader.jsp" %>
<bodys id="top">
    <!--[if lt IE 8]>
    <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
    <![endif]-->
    <%@include file="top.jsp" %>
    <%@include file="introduce.jsp" %>
    <%@include file="skills.jsp" %>
    <%@include file="products.jsp" %>
    <!-- <section class="hero-strip section-padding">
        <div class="container">
            <div class="col-md-12 text-center">
                <h2>
                Customise Sedna with the included <span class="sketch">Sketch <i class="version">3</i></span> file
                </h2>
                <p>Change/swap/edit every aspect of Sedna before you hit development with the included Sketch file.</p>
                <a href="#" class="btn btn-ghost btn-accent btn-large">Download now!</a>
                <div class="logo-placeholder floating-logo"><img src="img/sketch-logo.png" alt="Sketch Logo"></div>
            </div>
        </div>
    </section>
   
    <section class="testimonial-slider section-padding text-center">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="flexslider">
                        <ul class="slides">
                            <li>
                                <div class="avatar"><img src="img/avatar.jpg" alt="Sedna Testimonial Avatar"></div>
                                <h2>"Lorem ipsum dolor sit amet, nullam lucia nisi."</h2>
                                <p class="author">Peter Finlan, Product Designer.</p>
                            </li>
                            <li>
                                <div class="avatar"><img src="img/mani.jpg" alt="Sedna Testimonial Avatar"></div>
                                <h2>"Nunc vel maximus purus. Nullam ac urna ornare."</h2>
                                <p class="author">Manoela Ilic, Founder @ Codrops.</p>
                            </li>
                            <li>
                                <div class="avatar"><img src="img/130.jpg" alt="Sedna Testimonial Avatar"></div>
                                <h2>"Nullam ac urna ornare, ultrices nisl ut, lacinia nisi."</h2>
                                <p class="author">Blaz Robar, Pixel Guru</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="sign-up section-padding text-center" id="download">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h3>Get started with Sedna, absolutely free</h3>
                    <p>Grab your copy today, exclusively from Codrops</p>
                    <form class="signup-form" action="#" method="POST" role="form">
                        <div class="form-input-group">
                            <i class="fa fa-envelope"></i><input type="text" class="" placeholder="Enter your email" required>
                        </div>
                        <div class="form-input-group">
                            <i class="fa fa-lock"></i><input type="text" class="" placeholder="Enter your password" required>
                        </div>
                        <button type="submit" class="btn-fill sign-up-btn">Sign up for free</button>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <section class="to-top">
        <div class="container">
            <div class="row">
                <div class="to-top-wrap">
                    <a href="#top" class="top"><i class="fa fa-angle-up"></i></a>
                </div>
            </div>
        </div>
    </section> -->
    <%@include file="bottom.jsp" %>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
    <script src="bower_components/retina.js/dist/retina.js"></script>
    <script src="js/jquery.fancybox.pack.js"></script>
    <script src="js/vendor/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="js/jquery.flexslider-min.js"></script>
    <script src="bower_components/classie/classie.js"></script>
    <script src="bower_components/jquery-waypoints/lib/jquery.waypoints.min.js"></script>
    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
    <script>
    (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
    function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
    e=o.createElement(i);r=o.getElementsByTagName(i)[0];
    e.src='//www.google-analytics.com/analytics.js';
    r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
    ga('create','UA-XXXXX-X','auto');ga('send','pageview');
    </script>
</body>
</html>