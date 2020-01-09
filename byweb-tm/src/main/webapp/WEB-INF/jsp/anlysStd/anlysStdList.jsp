<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {
		text-align: center;
		color: #FFF;
		width: 900px;
	}

	div#wrapper {
		width: 100%;
		text-align: left;
		min-height: 300px;
		margin: 0 auto;
	}
	
	header, footer, nav, section {
		border: 1px solid #999;
		margin: 5px;
		padding: 10px;
	}
	
	nav, section {
		float: left;
		height: 200px;
	}
	
	nav {
		background-color: goldenrod;
		width: 100px;
	}
	
	section {
		background-color: green;	
		width: 790px; 
	}
	
	footer {
		background-color: blue;
		position: relatiev;
		clear: both;
	}
</style>
</head>
<body>
<div id="wrapper">
	<header>
		<p>HEADER</p>
	</header>
	
	<nav>
		<p>NAV</p>
		<ul>
			<li><a href="">LINK</a></li>
			<li><a href="">LINK</a></li>
			<li><a href="">LINK</a></li>
		</ul>
	</nav>
	
	<section>
		<p>SECTION</p>
		<article>
			<p>ARTICLE</p>
		</article>
	</section>
	
	<footer>footer</footer>
</div>
</body>
</html>